package unidad5.ejemplos.arrayList.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompañerosClaseIII {

	public static void main(String[] args) {
		/*4. Escriba un programa Java para eliminar un elemento específico de una lista vinculada, indicando su
				posición en la lista.*/
		
Scanner entrada= new Scanner(System.in);
		
		
		
		
		List<String> listaCompañeros= new ArrayList<>();
		
		do {
		
		System.out.println("Escriba el nombre que desea agregar a la lista enlazada: ");
		
		listaCompañeros.add(entrada.nextLine());
		
		
		}while(listaCompañeros.size()<5);
		
		
		for(String s: listaCompañeros) {
		
			System.out.println(s);
				
		}
		
		
		System.out.println("Indique la posicion del elemento a borrar: ");
		
		listaCompañeros.remove(entrada.nextInt());		
		
		for(String s: listaCompañeros) {
			
			System.out.println(s);
				
		}
		entrada.close();
	}

	
}
