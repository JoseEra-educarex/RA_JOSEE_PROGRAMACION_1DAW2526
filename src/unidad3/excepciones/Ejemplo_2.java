package unidad3.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo_2 {

	public static void main(String[] args) {
		/*Crea un método leerEntero() que pida un número por teclado y lance una
		  excepción si el usuario introduce texto en lugar de número (InputMismatchException).*/
leerEntero();
	}

	private static void leerEntero() {
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce un numero entero");
		
		try {
		int numero=entrada.nextInt();
		System.out.println("El numero introducido es "+numero);
		}catch(InputMismatchException e) {
			System.out.println("Error!! has introducido texto ");
		}
		
	
		
		entrada.close();
		
	}

}
