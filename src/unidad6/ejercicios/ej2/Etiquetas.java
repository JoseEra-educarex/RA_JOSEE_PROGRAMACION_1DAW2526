package unidad6.ejercicios.ej2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Etiquetas {

	public static void main(String[] args) {

		
	/*Ejercicio 2: Generador de Etiquetas
Pide al usuario por consola que introduzca el nombre de 3 géneros de cine (ej: "Acción"). 
Por cada género introducido, utiliza el método .substring() para extraer solo las 3 primeras letras y
conviértelas a mayúsculas (ej: "ACC"). Guarda estas etiquetas en un archivo llamado generos_tags.txt,
separadas por guiones*/
		
		
		Scanner entrada= new Scanner(System.in);
		
		String genero1;
		String genero2;
		String genero3;
		
		System.out.println("Introduce el nombre de 3 Generos de cine: ");
	
		genero1=entrada.nextLine();
		genero2=entrada.nextLine();
		genero3=entrada.nextLine();
		
	genero1=genero1.toUpperCase().substring(0, 3);
		
	genero2=genero2.toUpperCase().substring(0, 3);

	genero3=genero3.toUpperCase().substring(0, 3);

		System.out.println(genero1);
	
		System.out.println(genero2);

		System.out.println(genero3);
		
		
		
		try (FileWriter fw = new FileWriter("./src/unidad6/ejemplos/generos_tags.txt", true);
			     BufferedWriter bw = new BufferedWriter(fw);
			     PrintWriter out = new PrintWriter(bw)) { // PrintWriter nos da el cómodo println()
			            
			     out.print(genero1);
			     out.print("-");
			     out.print(genero2);
			     out.print("-");
			     out.print(genero3);
			     System.out.println("¡Datos guardados en el Historial!");

			        } catch (IOException e) {
			            System.out.println("Error al escribir: " + e.getMessage());
			        }
		
		
		entrada.close();

		
	}
	
	
	
}


