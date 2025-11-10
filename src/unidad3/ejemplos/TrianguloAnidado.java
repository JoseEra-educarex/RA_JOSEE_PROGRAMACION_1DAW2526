package unidad3.ejemplos;

import java.util.Scanner;

public class TrianguloAnidado {

	public static void main(String[] args) {
		// Crea un programa que dibuje un triángulo de asteriscos usando bucles anidados.
	
		Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el número de filas para el triángulo:");
        int filas = entrada.nextInt();

        // Bucle externo: controla las filas
        for (int i = 1; i <= filas; i++) {
           
        	// Bucle interno: controla las columnas e imprime los asteriscos en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           
            // Imprime un salto de línea después de cada fila para pasar a la siguiente
            System.out.println();
        }
        entrada.close();
        
	}
}