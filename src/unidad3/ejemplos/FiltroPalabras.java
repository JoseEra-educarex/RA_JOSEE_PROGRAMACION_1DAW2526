package unidad3.ejemplos;

import java.util.Scanner;

public class FiltroPalabras {

	public static void main(String[] args) {
		/*2. Filtro de palabras
			o Pide palabras al usuario en un bucle do-while.
			o Si la palabra contiene “x”, usa continue para no mostrarla.
			o Termina cuando el usuario escriba “salir”.*/

		
		Scanner entrada= new Scanner(System.in);
		
		String palabra;
		
		do {
			System.out.println("Introduce una palabra...");
			palabra=entrada.nextLine();
			if(palabra.contains("x")||palabra.contains("X")){
				continue;
			}
			System.out.println("Tu palabra no contiene 'X'-> "+palabra);
			
		}while(!palabra.equals("salir"));
		System.out.println("Has introducido la palabra 'Salir'...Adios!");
		
		entrada.close();
	}

}
