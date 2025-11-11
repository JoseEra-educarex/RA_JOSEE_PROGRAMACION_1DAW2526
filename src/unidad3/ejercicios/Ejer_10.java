package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_10 {

	public static void main(String[] args) {
		/*10. Pedir una nota de 0 a 10 y mostrarla de la forma: 
		 * Insuficiente (de 0 a 4), Suficiente (5), Bien
		   (6), Notable (7 y 8) y Sobresaliente (9,10).*/

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nota: ");
		
		int nota= entrada.nextInt();
		
		switch(nota) {
		case 0,1,2,3,4:
			System.out.println("Insuficiente");
			break;
		
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
			break;

		case 9,10:
			System.out.println("Sobresaliente");
			break;

		
		}
		
		entrada.close();
	}

}
