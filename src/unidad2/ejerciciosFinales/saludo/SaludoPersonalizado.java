package unidad2.ejerciciosFinales.saludo;

import java.util.Scanner;

public class SaludoPersonalizado {

	public static void main(String[] args) {
		// Crea un programa SaludoPersonalizado que pida el nombre con Scanner y muestre:
	    //	¡Hola, [nombre]!
		Scanner entrada= new Scanner(System.in);
		
		
		
		System.out.println("¿Cual es tu nombre?");
		String nombre= entrada.nextLine();
		
		System.out.println("¡Hola, "+nombre+"!");
		
		
		entrada.close();
		
		

	}

	
}
