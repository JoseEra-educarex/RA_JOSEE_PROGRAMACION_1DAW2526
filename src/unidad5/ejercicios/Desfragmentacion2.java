package unidad5.ejercicios;

public class Desfragmentacion2 {

	public static void main(String[] args) {
		   double[] array = {5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0};

	        double[] nuevoArray = compactarArray(array);

	        System.out.print("nuevoArray = [");
	        for (int i = 0; i < nuevoArray.length; i++) {
	            System.out.print(nuevoArray[i]);
	            if (i != nuevoArray.length - 1)
	                System.out.print(", ");
	        }
	        System.out.println("]");
	    }

	    public static double[] compactarArray(double[] array) {

	        
	    	double[] nuevoArray = new double[array.length];
	        int nuevoIndice = 0;

	        // Copiar los valores distintos de -1
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != -1) {
	                nuevoArray[nuevoIndice] = array[i];
	                nuevoIndice++;
	            }
	        }

	        // Rellenar el resto con -1
	        for (int i = nuevoIndice; i < nuevoArray.length; i++) {
	            nuevoArray[i] = -1;
	        }

	        return nuevoArray;
	    }
	}