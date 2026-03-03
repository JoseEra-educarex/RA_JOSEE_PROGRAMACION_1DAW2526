package unidad5.ejemplos.javaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		Map<String, String> diccionario= new HashMap<>();
		
		diccionario.put("Perro", "Dog");
		
		diccionario.put("Gato", "Cat");
	
		diccionario.put("Pajaro", "Bird");
		
		diccionario.put("Cerdo", "Pig");
		
		diccionario.put("Miel", "Honey");
		
		
		System.out.println("Bienvenidos al Diccionario");
		
		System.out.println("Introduce la palabara a traducir");
		
		String palabra="";
		
		do {
			
			palabra=entrada.nextLine();
			
			if(diccionario.containsKey(palabra)) {
				
				System.out.println("En inlges se dice "+diccionario.get(palabra));
			}
			
			
			
		}while(!palabra.equalsIgnoreCase(palabra));
		
		entrada.close();
		
	}

}
