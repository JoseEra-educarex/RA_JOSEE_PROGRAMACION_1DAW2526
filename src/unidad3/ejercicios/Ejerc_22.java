package unidad3.ejercicios;

import java.util.Scanner;

public class Ejerc_22 {

	public static void main(String[] args) {
		/*. Determinar la cantidad de dinero que recibirá un/a trabajador/a por concepto de las horas
extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de 40,
el resto se consideran horas extras y que éstas se pagan al doble de una hora normal cuando
no exceden de 8; si las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que
se paga por una hora normal y el resto al triple. La hora normal se paga a 12,5 €.
Realice un programa que reciba el número de horas extras que un trabajador/a ha realizado
y muestre por pantalla la cantidad de dinero que percibirá por dichas horas extras.*/

		
		        Scanner entrada = new Scanner(System.in);

		        // Precio de la hora normal
		        double precioHora = 12.5;

		        // Pedimos al usuario el número de horas extras
		        System.out.print("Ingrese el número de horas extras trabajadas: ");
		        int horasExtras = entrada.nextInt();

		        double pago = 0;

		        if (horasExtras <= 8) {
		            // Si son 8 horas o menos, se pagan al doble
		            pago = horasExtras * precioHora * 2;
		        } else {
		            // Si son más de 8 horas
		            // Primeras 8 al doble
		            pago = 8 * precioHora * 2;
		            // Horas restantes al triple
		            pago += (horasExtras - 8) * precioHora * 3;
		        }

		        System.out.println("El pago por las horas extras es: " + pago + " €");

		        entrada.close();
		    }
		}

		
		
	
