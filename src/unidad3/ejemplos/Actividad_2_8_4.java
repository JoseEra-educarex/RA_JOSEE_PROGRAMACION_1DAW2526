package unidad3.ejemplos;

import java.util.Scanner;

public class Actividad_2_8_4 {

	public static void main(String[] args) {
		// Crea un menú que se repita hasta que el usuario elija “Salir”,
		//utilizando un do-while.

		Scanner scanner = new Scanner(System.in);
        int opcion;

        // El bucle 'do' ejecuta el código al menos una vez
        do {
            // 1. Mostrar el menú de opciones
            System.out.println("---------------------------------");
            System.out.println("      MENÚ DE APLICACIÓN");
            System.out.println("---------------------------------");
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Opción C");
            System.out.println("0. Salir");
            System.out.println("---------------------------------");
            System.out.print("Elige una opción: ");

            // 2. Leer la opción del usuario
            opcion = scanner.nextInt();

            // 3. Manejar la opción elegida (simulación)
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción A.");
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción B.");
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción C.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            
            // Línea extra para mejorar la legibilidad entre iteraciones
            System.out.println("\n"); 

        // 4. La condición 'while' se evalúa DESPUÉS de ejecutar el bloque 'do'.
        // El bucle continuará MIENTRAS la opción NO sea 0 (Salir).
        } while (opcion != 0);

        // Cerramos el scanner al finalizar el bucle
        scanner.close();
    }
}