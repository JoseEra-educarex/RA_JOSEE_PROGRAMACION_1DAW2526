package unidad3.ejercicios;

import java.util.Scanner;

public class Ejerc_18 {

	public static void main(String[] args) {
		/*Realizar un programa que acepte dos números enteros por teclado. A continuación, muestre
			un menú de operaciones a realizar con los dos números. Estas operaciones serán: suma,
			resta, multiplicación y división. Se indicará la letra correspondiente la operación (S,R,M y D).
			Se mostrará por pantalla el resultado de la operación elegida.*/

		//variables:
		
		int num1;
		int num2;
		String tipoOperacion;
		char opcion;
		
		//Pedir datos al usuario
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		
		num1=entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		
		 num2= entrada.nextInt();
		 
		 //limpiar el buffer
		 
		 entrada.nextLine();
		
		// mostrar menu de opciones 
		 		 
		System.out.println("Bienvenido a la Calculadora");
		System.out.println("Selecione S/R/M/D para Operar: ");
		System.out.println("S. Suma");
		System.out.println("R. Resta");
		System.out.println("M. Multiplicar");
		System.out.println("D. Dividir");
		
		tipoOperacion=entrada.nextLine();
		
		
		
		opcion=Character.toLowerCase(tipoOperacion.charAt(0));
		
		switch (opcion) {
		
		case 's':
			System.out.println("La suma es igual a: "+ (num1+num2));
		 break;
		case 'r':
			System.out.println("La resta es igual a: "+ (num1-num2));
		 break;
		case 'm':
			System.out.println("La multiplicacion es igual a: "+ (num1*num2));
		 break;
		case 'd':
			System.out.println("La division es igual a: "+ (num1/num2));
		 break;
		 
		default: 
			System.out.println("opcion invalida"); 
		}
		
		
		entrada.close();
		
		
	}

}
