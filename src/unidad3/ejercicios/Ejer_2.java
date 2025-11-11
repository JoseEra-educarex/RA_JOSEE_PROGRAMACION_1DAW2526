package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_2 {

	public static void main(String[] args) {
		//2. Pedir dos números y mostrarlos ordenados de forma decreciente.
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero : ");
		
		int num1= entrada.nextInt();
		
		System.out.println("Introduce un segundo numero: ");

		
		int num2= entrada.nextInt();
		

		OrdenarNum(num1, num2);
		
		entrada.close();
	}
public static void OrdenarNum(int num1, int num2) {
	
	if(num1<num2) {
		System.out.println("El primer numero: "+num1+ " es menor que el segundo: "+ num2);
	}else if(num1==num2) {
		System.out.println("Los numeros son iguales");

	}else {
		System.out.println("El segundo numero "+num2+ " es menor que el primer numero "+ num1);

	}
	
}
}
