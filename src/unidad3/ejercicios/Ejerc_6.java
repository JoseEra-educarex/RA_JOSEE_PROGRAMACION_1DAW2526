package unidad3.ejercicios;

import java.util.Scanner;

public class Ejerc_6 {

	public static void main(String[] args) {
		/*Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
		 *  mostrar un mensaje indicando si el número tiene uno o dos dígitos.
		 *  (Tener en cuenta que condición debe cumplirse para tener dos dígitos,
		 *   un número entero).*/

		
		
		Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce un numero entero de una o dos cifras : ");
			
			int num= entrada.nextInt();
			
			if(num<10) {
				System.out.println("El numero "+ num +" introducido es de una cifra ");
			}else if(num<100) {
				System.out.println("El numero "+ num +" introducido es de dos cifras ");

			}else {
				System.out.println("El numero "+ num +" introducido no cumple los requisitos ");

			}
			entrada.close();
	}

}
