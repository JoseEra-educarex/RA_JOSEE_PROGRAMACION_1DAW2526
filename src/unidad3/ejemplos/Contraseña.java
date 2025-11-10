package unidad3.ejemplos;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
		// Pide al usuario una contraseña hasta que acierte con la correcta (máximo 3
		// intentos).
	
	Scanner entrada= new Scanner(System.in);
	
	String contraseña= "abracadabra";
	
	int intento=0;
	
	boolean acierto=false;
	
	while ((!acierto) && (intento<3)) {
		
		System.out.println("Introduce la constraseña: ");
		String palabra=entrada.nextLine();
		
		if(palabra.equalsIgnoreCase(contraseña)) {
				
			acierto=true;
			System.out.println("Has acertado! felicidades!");
		}else {
		
		System.out.println("Has fallado! Prueba otra vez");
			intento++;
		
		}
	
		
		
	}
	
	
	System.out.println("FIN");
	
	
	entrada.close();
	
	}

}
