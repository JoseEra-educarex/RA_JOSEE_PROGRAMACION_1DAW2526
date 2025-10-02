package unidad1;

import java.util.Scanner;

public class Comparaciones {

	public static void main(String[] args) {
		//Pide al usuario dos números enteros.
		/*Muestra en pantalla:
			• Si el primero es mayor que el segundo.
			• Si ambos son iguales.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero A : ");
		int numA = entrada.nextInt();
		System.out.println("Introduce el numero B : ");
		int numB = entrada.nextInt();
		
		if(numA>numB){
			
			System.out.println("Numero A mayor que Numero B");
			
		}else if(numA==numB) {
			
			System.out.println("Los numero A y B son iguales");
			
		}else {
			
			System.out.println("Numero A menor que Numero B");
		}
entrada.close();
	}

}
