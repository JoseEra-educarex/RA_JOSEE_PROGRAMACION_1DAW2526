package unidad2.claseCadenas;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		/*
		Ejercicio A — operaciones con String
		1. Pide al usuario una frase.
		2. Imprime:
		o Longitud
		o Primera y última letra
		o Frase en mayúsculas
		o Número de palabras (usar split("\\s+"))
		o Frase invertida (usar StringBuilder.reverse())
			Pista: new StringBuilder(frase).reverse().toString().*/
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		
		String frase= entrada.nextLine();
		
		System.out.println("Su frase es : "+frase);
		
		System.out.println("Su frase contiene "+ frase.length()+ " caracteres");
		
		System.out.println("Su Frase en Mayusculas es :"+ frase.toUpperCase());
		
		System.out.println("La primera letra de su frase es "+ frase.charAt(0) +
							" y la última es "+ frase.charAt(frase.length()-1));
		
		 String[] palabras = frase.split("\\s+");
		
		System.out.println("El número de palabras es "+ palabras.length);
		
		
		StringBuilder fraseReversa = new StringBuilder(frase);
		
        String fraseAlReves = fraseReversa.reverse().toString();
        
        System.out.println("La frase al revés es: " + fraseAlReves);
		
		
        entrada.close();
	}

}
