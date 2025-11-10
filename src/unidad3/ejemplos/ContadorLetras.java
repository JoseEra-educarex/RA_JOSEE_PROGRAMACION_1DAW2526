package unidad3.ejemplos;

import java.util.Scanner;

public class ContadorLetras {

	public static void main(String[] args) {
		//Pide una palabra y muestra cuántas veces aparece la letra ‘a’
		
		int contador=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra:");
		
		String palabra= entrada.nextLine();
		
		for(int i =0; i<palabra.length();i++) {
			
			if(palabra.charAt(i)=='a'|| palabra.charAt(i)=='A') {
				contador++;
			}
			
		}

		System.out.println("La letra 'a' se repite "+contador+" veces");
		
		entrada.close();
		
	}
}
