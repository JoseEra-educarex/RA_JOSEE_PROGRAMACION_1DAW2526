package unidad5.ejercicios;

public class Formula1 {

	public static void main(String[] args) {
		/*El Podio de la Fórmula 1
Declara un array de String llamado pilotos con capacidad para 3 nombres.

Asigna manualmente (línea a línea) los nombres de los 3 primeros clasificados 
en una carrera (invéntatelos).
Imprime por consola: "El ganador es [nombre] y el tercero es [nombre]".
Reto: Intenta acceder a la posición pilotos[3] y anota en tu cuaderno qué excepción lanza Java.*/

		String[] pilotos= {"Pedro","Juan","Antonio"};
				
				
System.out.println("El ganador es "+pilotos[0]+" y en tercera posicion "+pilotos[2]);
		
System.out.println("pilotos[3] -> lanza  ArrayIndexOutOfBoundsException");
	
		try {	
				System.out.println(pilotos[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
				
			System.out.println("posicion fuera del array");
		
		}
	
	}

	
	
	
	
}
