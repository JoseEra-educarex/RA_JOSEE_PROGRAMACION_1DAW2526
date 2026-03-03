package unidad5.ejemplos.javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompraInteligente {

	public static void main(String[] args) {

		/*Crea un programa que permita al usuario
		 *  añadir productos a una lista de la compra.
			
			Si el usuario escribe "FIN", el programa termina.
			Al final, imprime la lista completa, el número total de artículos y .
			permite eliminar el último artículo introducido si el usuario se arrepiente.*/
		
		
		Scanner entrada= new Scanner(System.in);
	
		List<String> compra= new ArrayList<>();
		
		String opcion="";
		String borrado="";
		int contador=0;
		do {
			System.out.println();
			System.out.println("SELECCIONA UNA OPCION");
			System.out.println("----------------------");
			System.out.println("AÑADIR");
			System.out.println("FIN");
			opcion=entrada.nextLine();
			
			if(opcion.equalsIgnoreCase("Añadir")) {
				
				compra.add(entrada.nextLine());
				contador++;
			}

			if(opcion.equalsIgnoreCase("FIN")) {
				
				for(String s : compra) {
					System.out.println(s);
				}
				System.out.println(contador);
				System.out.println("Desea borrar el ultimo producto introducido?");
				System.out.println("SI o NO");
				borrado=entrada.nextLine();
				
				if(borrado.equalsIgnoreCase("SI")) {
					
					compra.remove(contador-1);
					contador--;
					
					for(String s : compra) {
						System.out.println(s);
					}
					System.out.println(contador);
					System.out.println("Gracias por su compra");
					
				}else System.out.println("Gracias por su compra");
				
			}

			
		}while(!opcion.equalsIgnoreCase("FIN"));
		
		
		
		entrada.close();
	}

	
	
	
}
