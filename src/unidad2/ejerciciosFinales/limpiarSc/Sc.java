package unidad2.ejerciciosFinales.limpiarSc;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		/*Crea un programa que pida al usuario:
			• Su nombre (nextLine())
			• Su edad (nextInt())
			Muestra un mensaje:
			Hola [nombre], tienes [edad] años.
			 Recuerda limpiar el buffer si usas nextInt() y luego nextLine().*/
		
		int edad;
		String nombre;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cual es tu edad?");
		edad=entrada.nextInt();
		
		entrada.nextLine();//limpieza de buffer
		
		System.out.println("¿Cual es tu nombre?");
		nombre=entrada.nextLine();
		
	
		
		System.out.println("Hola "+nombre+", tienes "+edad+" años.");
		
		
		entrada.close();
	}

}
