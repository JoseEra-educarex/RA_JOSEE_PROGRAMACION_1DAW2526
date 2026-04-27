package unidad6.ejercicios.ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cartelera {

	public static void main(String[] args) {

	/*Ejercicio 4: Parseando la Cartelera (String a Objeto)
Crea una clase Pelicula con los atributos: titulo (String), director (String) y anio (int).
Crea manualmente un archivo cartelera.csv con este formato:
Matrix;Hermanas Wachowski;1999
El destino de Jupiter;Hermanas Wachowski;2022
Escribe un programa que lea el archivo, use .split(";") 
para separar los datos, convierta el año a entero con Integer.parseInt() y
construya un objeto Pelicula por cada línea. Mete todos los objetos en un ArrayList<Pelicula> y, 
al finalizar, imprime el tamaño del ArrayList.*/	
		
		List<Pelicula> listaPeliculas= new ArrayList<>();
	

		
try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/cartelera.csv")){
			 
			BufferedReader br = new BufferedReader(fr);
		 
			String linea;
		
		
			
			while((linea = br.readLine()) != null) {

			    String[] campos = linea.split(";");

			    String titulo = campos[0];
			    String director = campos[1];
			    int anio = Integer.parseInt(campos[2]);

			    Pelicula pelicula = new Pelicula(titulo, director, anio);

			    listaPeliculas.add(pelicula);
			}


			System.out.println(listaPeliculas.size());
			
			for(Pelicula p: listaPeliculas) {
				System.out.println(p);
			}
						
			
		
	} catch (IOException e) {
	
	System.out.println("Error al Leer: " + e.getMessage());
 
}
		
		

	
		
		
		
	}

	
	
	
	
	
}
