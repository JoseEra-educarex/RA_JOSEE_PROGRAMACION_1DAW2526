package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_1 {

	public static void main(String[] args) {
		//1. Codificar un programa que solicite
		//al usuario un número e indique si es par o impar

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		int num= entrada.nextInt();
		
		
		
		CalcularModulo(num);
		
		
		
		
		entrada.close();
		
	}

	public static void CalcularModulo(int num) {
		
		if(num%2!=0) {
			System.out.println("El numero es impar");
		}else {
			System.out.println("El numero es par");

		}
		
		
	}
	
	
}
