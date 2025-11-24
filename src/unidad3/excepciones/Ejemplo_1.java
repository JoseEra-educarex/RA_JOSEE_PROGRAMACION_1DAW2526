package unidad3.excepciones;

import java.util.Scanner;

public class Ejemplo_1 {

	public static void main(String[] args) {
		/*Escribe un programa que pida dos números y muestre su división.
			Captura la excepción ArithmeticException si el divisor es cero.*/
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escriba el primer numero: ");
		int num1=entrada.nextInt();
		
		System.out.println("Escriba el segundo numero: ");
		int num2=entrada.nextInt();
		
		
		try {
			
			double resultado=num1/num2;
			System.out.println("El resultado de la division es "+ resultado);
		
		}catch(ArithmeticException e){
			System.out.println("Error! el numero no es divisible por 0");
		}
		
		entrada.close();
	}

}
