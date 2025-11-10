package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio_3_7_3 {

	public static void main(String[] args) {
		/*Diseña un método que reciba un número y devuelva su cuadrado, pero si el
		número es negativo, finalice el método con return y un mensaje de error.*/
	
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero= entrada.nextInt();
		
		System.out.println("El cuadrado del numero "+ numero+ " es "+Cuadrado(numero));
		
		
		entrada.close();
	}
	
	
	
	public static int Cuadrado(int numero) {
		
		if(numero<0) {
			
			System.out.println("Error!! el numero es negativo");
			return 0;
		}
		
		
		return numero*numero;
		
		}
}
