package unidad6.ejercicios.ej6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import unidad6.ejercicios.ej4.Pelicula;

public class CensuraAutomatica {

	public static void main(String[] args) {
		
		
/*Ejercicio 6: Censura Automática
Crea una clase Comentario con usuario (String) y texto (String).
Lee un archivo reviews.txt donde cada línea es: usuario|texto del comentario.
Crea los objetos correspondientes.
Antes de guardarlos en tu lista, revisa el atributo texto. Si contiene la palabra "basura" o "aburrida", 
utiliza .replaceAll() para cambiar esas palabras por "***".
Imprime por consola los comentarios censurados.*/
		
		List<Comentario> listaComentarios= new ArrayList<>();
		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/reviews.txt")){
					 
					BufferedReader br = new BufferedReader(fr);
				 
					String linea;
				
				
					
					while((linea = br.readLine()) != null) {

					    String[] campos = linea.split(";");
					    	String usuario = campos[0];
					    	String texto = campos[1];
					    	
					  
					    	
					    	if(texto.contains("basura")||texto.contains("aburrido")) {
					    	texto=	texto.replaceAll("basura", "****");
					    		texto=texto.replaceAll("aburrido", "****");
					    	}
					    	
					    	  	Comentario comentario = new Comentario(usuario, texto);
					    	
					    	
					    	listaComentarios.add(comentario);
					    	
						}
					
					for(Comentario c: listaComentarios) {
						System.out.println(c);
					}

		} catch (IOException e) {
			
			System.out.println("Error al Leer: " + e.getMessage());
		 
		}
				
				

			
				
				
				
			}// FIN DE MAIN 

			
			
			
			
			
		}//FIN DE LA CLASE