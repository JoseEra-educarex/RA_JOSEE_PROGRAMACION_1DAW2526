
public class DepuracionDemo {


	    public static void main(String[] args) {

	        int[] notas = {10, 5, 8, 3, 7};

	        double media = calcularMedia(notas);
	        System.out.println("Media: " + media);

	        int suspensos = contarSuspensos(notas);
	        System.out.println("Suspensos: " + suspensos);

	        int mejorNota = obtenerMejorNota(notas);
	        System.out.println("Mejor nota: " + mejorNota);
	    }

	    // ERROR 1: la media no se calcula correctamente
	    public static double calcularMedia(int[] notas) {
	        double suma = 0;

	        for (int i = 0; i < notas.length; i++) {
	            suma += notas[i];
	        }
	         

	        return suma / notas.length; 
	    }

	    // ERROR 2: no cuenta bien los suspensos
	    public static int contarSuspensos(int[] notas) {
	        int contador = 0;

	        for (int nota : notas) {
	            if (nota <5) { 
	                contador++;
	            }
	        }

	        return contador;
	    }

	    // CORRECTO, sirve como referencia
	    public static int obtenerMejorNota(int[] notas) {
	        int max = notas[0];

	        for (int i = 1; i < notas.length; i++) {
	            if (notas[i] > max) {
	                max = notas[i];
	            }
	        }

	        return max;
	    }
	}