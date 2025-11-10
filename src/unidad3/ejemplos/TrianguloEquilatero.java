package unidad3.ejemplos;

import java.util.Scanner;

public class TrianguloEquilatero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número de filas para el triángulo: ");
	        int filas = scanner.nextInt();
	        scanner.close();

	        // Bucle exterior para controlar las filas
	        for (int i = 1; i <= filas; i++) {
	            // Bucle anidado para imprimir los espacios
	            // Se imprimen (filas - i) espacios para centrar el triángulo
	            for (int j = 1; j <= filas - i; j++) {
	                System.out.print(" ");
	            }

	            // Bucle anidado para imprimir los asteriscos
	            // Se imprimen (2 * i - 1) asteriscos en cada fila para la forma de pirámide
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Salto de línea para pasar a la siguiente fila
	            System.out.println();
	        }
	    }
	}