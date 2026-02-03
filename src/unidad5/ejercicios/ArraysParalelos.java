package unidad5.ejercicios;

public class ArraysParalelos {

	public static void main(String[] args) {
		/*Se pide crear un método imprimirBoletin que:

		Recorra ambos arrays.
		Muestre: "El alumno [Nombre] tiene un [Nota]".
		Filtrado Avanzado: Solo debe mostrar aquellos alumnos cuya nota sea superior a la media de la clase.*/
				
		String[] nombres = {"Ana", "Luis", "Pepe", "Maria", "Juan"};
		
		double[] notas = {4.5, 8.0, 9.5, 4.5, 7.0};
		
		imprimirBoletin(nombres, notas);
		
	}

	public static void imprimirBoletin(String[] nombres, double[] notas) {
	    
		double suma = 0;

	    // 1. Calcular la media
	  
	    for (int i = 0; i < notas.length; i++) {
	        
	    	suma += notas[i];
	    }
	    double media = suma / notas.length;

	   
	    // 2. Recorrer arrays y filtrar
	    
	    for (int i = 0; i < nombres.length; i++) {
	        
	    	if (notas[i] > media) {
	            
	    		System.out.println("El alumno " + nombres[i] + " tiene un " + notas[i]);
	        }
	    }
	}
	
	
}
