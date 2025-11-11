package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_5 {

	public static void main(String[] args) {
		/*Realizar un programa que lea por teclado dos números, si el primero es 
		 * mayor al segundo
		  realizar la suma de ambos, en caso contrario realizar el producto del 
		  primero respecto al
		  segundo.*/

		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero : ");
		
		int num1= entrada.nextInt();
		
		System.out.println("Introduce un segundo numero: ");

		
		int num2= entrada.nextInt();
		
		if(num1>num2) {
			int suma=num1+num2;
			System.out.println("la suma es igual a "+suma);
			
		}else {
			double multiplicar= num1*num2;
			
			System.out.println("la multiplicacion es igual a "+multiplicar);
		}
		
		entrada.close();
	}

}
