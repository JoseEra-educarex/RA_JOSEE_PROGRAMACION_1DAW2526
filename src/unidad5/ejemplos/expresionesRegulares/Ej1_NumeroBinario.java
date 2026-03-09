package unidad5.ejemplos.expresionesRegulares;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Ej1_NumeroBinario {

	public static void main(String[] args) {

		//String regex="^\\d[0-1]+$";
		
		//Pattern pattern = Pattern.compile(regex);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero Binario");
		
		String numero = entrada.nextLine();
		
	    //Matcher matcher = pattern.matcher(numero);

		
		if (esBinarioValido(numero)) {
			System.out.println("El número introducido es válido.");
		} else {
			System.out.println("El número introducido NO ES un número binario válido.");
		}
	
	
	entrada.close();
	
	}

	

	
	
	
	public static boolean esBinarioValido(String numero) {
		
		
		return(numero.matches("^\\d[0-1]+$"));
	}
	
	
	
	
	
	
	
	
	
	
}
