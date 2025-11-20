package unidad3.ejercicios;

import java.util.Scanner;

public class Ejec_17 {

	public static void main(String[] args) {
		/*La clínica veterinaria ofrece venta de pienso para ganado vacuno al por mayor,
		 *  teniendo en cuenta que 3 categorías de alimentación: A, B y C. Los precios
		 *   por kilogramo de pienso son 30,20 y 15 céntimos respectivamente. 
		 *   Realizar un programa que recoja el tipo de pienso que desea el cliente y 
		 *   muestre el precio por pantalla. En caso de elegir una opción no válida, se
		mostrará un mensaje de error. */


		        Scanner entrada = new Scanner(System.in);

		        String tipoPienso;
		        int precio = 0;

		        do {
		            System.out.println("Seleccione qué tipo de pienso desea:");
		            System.out.println("Tipo A: 30 €/Kg");
		            System.out.println("Tipo B: 20 €/Kg");
		            System.out.println("Tipo C: 15 €/Kg");
		            System.out.println("Pulse S/s para salir");

		            tipoPienso = entrada.nextLine();

		     

		            char opcion = Character.toUpperCase(tipoPienso.charAt(0));

		            switch (opcion) {
		                case 'A':
		                    precio = 30;
		                    System.out.println("Su precio por kilo es de " + precio + " €");
		                    break;
		                case 'B':
		                    precio = 20;
		                    System.out.println("Su precio por kilo es de " + precio + " €");
		                    break;
		                case 'C':
		                    precio = 15;
		                    System.out.println("Su precio por kilo es de " + precio + " €");
		                    break;
		                case 'S':
		                    System.out.println("Saliendo...");
		                    break;
		                default:
		                    System.out.println("Error: seleccione una opción válida.");
		            }

		        } while (tipoPienso.charAt(0) != 's' && tipoPienso.charAt(0) != 'S');

		        entrada.close();
		    }

		   
		}
