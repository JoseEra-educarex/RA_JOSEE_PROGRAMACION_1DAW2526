package unidad2.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Utiliza la clase String para crear una variable con un texto y muestra:
			o La longitud de la cadena (length()).
			o El texto en mayúsculas (toUpperCase()).
			o Si contiene la palabra "Java" (contains("Java")).*/

		
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Introduce un texto: ");
		
		String texto= entrada.nextLine();
		
		System.out.println(texto.length());
		
		System.out.println(texto.toUpperCase());
		System.out.println(texto.contains("java"));
		
		entrada.close();
	}

}
