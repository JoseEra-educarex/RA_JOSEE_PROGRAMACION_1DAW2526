package unidad5.ejercicios;

public class OrdenacionArrastre {


 
/*Ordenación con Arrastre: Dentro del if (notas[j] < notas[j+1]) del método burbuja,
  *  hay que hacer dos swaps:
			
			Swap notas
			auxNota = notas[j]; 
			notas[j] = notas[j+1]; 
			notas[j+1] = auxNota;
			
			Swap nombres (¡Crucial!)
			auxNombre = nombres[j]; 
			nombres[j] = nombres[j+1];
			nombres[j+1] = auxNombre;*/
		
	public static void main(String[] args) {
		
		String[] nombres = {"Ana", "Luis", "Pepe", "Maria", "Juan"};
		
		double[] notas = {4.5, 8.0, 9.5, 4.5, 7.0};
		
		  double auxNota;
	      String auxNombre;

	        // Metodo Burbuja (Mayor a Menor)
	        for (int i = 0; i < notas.length - 1; i++) {
	        	
	            for (int j = 0; j < notas.length - 1 - i; j++) {

	                if (notas[j] < notas[j + 1]) {

	                    // Swap notas
	                    auxNota = notas[j];
	                    notas[j] = notas[j + 1];
	                    notas[j + 1] = auxNota;

	                    // Swap nombres (¡Crucial!)
	                    auxNombre = nombres[j];
	                    nombres[j] = nombres[j + 1];
	                    nombres[j + 1] = auxNombre;
	                }
	            }
	        }

	        // Imprimir Top 3
	        System.out.println("TOP 3 ALUMNOS");
	        for (int i = 0; i < 3; i++) {
	            System.out.println((i + 1) + ". " + nombres[i] + " - " + notas[i]);
	        }
	    }
	}