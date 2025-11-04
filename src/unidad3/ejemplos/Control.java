package unidad3.ejemplos;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		/*Escribe un programa que pida un número y 
		 * diga si es positivo, negativo o cero.*/

		int a;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca un numero positivo, negativo o cero: ");
		
		a=entrada.nextInt();
		
		if(a>0) {
			System.out.println("El numero introducido es postivo");
			
		} else if(a==0) {
			System.out.println("El numero introducido es cero");

		}else {
			System.out.println("El numero introducido es negativo");

		}
		
		
		entrada.close();
	}

}
