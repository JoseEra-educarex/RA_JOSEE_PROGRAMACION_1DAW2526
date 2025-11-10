package unidad3.ejemplos;

import java.util.Scanner;

public class Actividad_2_8_3 {


		 public static void main(String[] args) {
		        // Inicializa el Scanner para leer la entrada del usuario
		        Scanner scanner = new Scanner(System.in);
		        
		        // Variables para almacenar la suma total y el número actual introducido
		        int sumaTotal = 0;
		        int numero;

		        System.out.println("Introduce números para sumar (introduce 0 para terminar):");

		        // El bucle while se ejecutará continuamente HASTA que el usuario introduzca 0
		        while (true) {
		            // Lee el número introducido por el usuario
		            numero = scanner.nextInt();

		            // Comprueba si el número introducido es 0
		            if (numero == 0) {
		                // Si es 0, salimos del bucle using 'break'
		                break; 
		            }

		            // Si no es 0, lo añadimos a la suma total
		            sumaTotal += numero;
		        }

		        // Cerramos el scanner ya que no lo necesitamos más
		        scanner.close();

		        // Imprimimos el resultado final
		        System.out.println("La suma total de los números introducidos es: " + sumaTotal);
		    }
		}