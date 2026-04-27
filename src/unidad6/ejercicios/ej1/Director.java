package unidad6.ejercicios.ej1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Director {

	public static void main(String[] args) {

	/*Ejercicio 1: El Grito del Director
 Crea un archivo llamado titulos.txt con 5 nombres de películas en minúsculas.
 Escribe un programa que lea el archivo línea a línea. 
 Utiliza el método .toUpperCase() de la clase String para convertir cada título
 a mayúsculas y muéstralos por consola.
 Si el archivo no existe, el programa debe capturar el error y avisar al usuario sin "petar".*/	
		
File directorio= new File(".");//.=directorio actual
		
		System.out.println("El directorio actual es:" + directorio.getAbsolutePath());
		// /home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/.
		
String linea;
		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/Titulos.txt")){
			 
			BufferedReader br = new BufferedReader(fr);
		
			
			while((linea = br.readLine())!=null) {
		
				
				
				System.out.println(linea.toUpperCase());
				
	}

		}catch (IOException e) {
			
			System.out.println("Error al Leer: " + e.getMessage());
		 
		}
	
    }// fin main 
	
	
	
}// fin clase
