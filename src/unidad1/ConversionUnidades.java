package unidad1;

import java.util.Scanner;

public class ConversionUnidades {

	public static void main(String[] args) {
		/*Escribe un programa que pida un número de grados Celsius y los convierta a
		Fahrenheit, mostrando el resultado.*/

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la temperatura en Grados Celsius: ");

		double celsius = entrada.nextDouble();
		
		//Formula de conversión
		
		double farhenheit= (celsius*9/5)+32;
		
		System.out.println("La Conversion a grados Fahrenheit es: "+ farhenheit);

		
		entrada.close();
	}

}
