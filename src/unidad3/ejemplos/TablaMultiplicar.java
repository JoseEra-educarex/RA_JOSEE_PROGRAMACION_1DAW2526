package unidad3.ejemplos;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		/*Pide un número al usuario e imprime su tabla del 1 al 10 con un for.*/

		Scanner entrada = new Scanner(System.in);
		int numero =0;
		System.out.println("Introduce un numero y te digo su tabla de multiplicar:");
		
		numero=entrada.nextInt();
		
	for(int i=1;i<=10;i++) {
		System.out.println(numero +" x "+i+ " es igual "+numero*i);
	}
	
	entrada.close();
	}

}
