package unidad5.ejemplos.datosAvanzados;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	public static void main(String[] args) {
		/*Ejercicio 1: La Playlist de Spotify
	Crea una ArrayList<String> llamada playlist.
	
	Añade manualmente 5 canciones (Títulos).
	Imprime la lista completa.
	Te has equivocado: la canción de la posición 2 no te gusta. Cámbiala por "Despacito" usando set().
	La primera canción ya la has escuchado. Elimínala.
	Imprime: "Actualmente hay [n] canciones en la cola".
	*/
	
	
		List<String> playlist = new ArrayList<>();

        // 1. Añadir elementos
		playlist.add("the end");
		playlist.add("Macarena");
		playlist.add("Asereje");
		playlist.add("haven's door");
		playlist.add("Pollito pio");
		
		
		//2. Imprimir el arraylist
		for (String cancion : playlist) {
		    System.out.println(cancion);
		}
		
		
		
		playlist.set(2,"Despacito");

		
		//3. Imprimir el arraylist tras el cambio
		for (String cancion : playlist) {
		    System.out.println(cancion);
		}
		
		//4. La primera canción ya la has escuchado. Elimínala.
		
		System.out.println("Actualmente hay "+playlist.size()+" canciones en la cola");
		
		playlist.remove(0);
		
		//5. Imprime: "Actualmente hay [n] canciones en la cola".
		
		System.out.println("Actualmente hay "+playlist.size()+" canciones en la cola");
		
	}

	
	
	
}
