package unidad5.ejemplos.arrayList.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompañerosClase {

	public static void main(String[] args) {
		/* Escriba un programa Java para agregar los nombres de 5 compañeros/as en una lista enlazada.*/
		
		Scanner entrada= new Scanner(System.in);
		
		
		
		
		List<String> listaCompañeros= new ArrayList<>();
		
		do {
		
		System.out.println("Escriba el nombre que desea agregar a la lista enlazada: ");
		
		listaCompañeros.add(entrada.nextLine());
		
		
		}while(listaCompañeros.size()<5);
		
		
		for(String s: listaCompañeros) {
		
			System.out.println(s);
				
		}
				
		
		entrada.close();
	}

	
}
