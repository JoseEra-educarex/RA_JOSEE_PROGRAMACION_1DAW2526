package unidad6.ejercicios.ej5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import unidad6.ejercicios.ej4.Pelicula;

public class GestorErrores {

	public static void main(String[] args) {
		/*Ejercicio 5: El Gestor de Errores (NumberFormatException)
		Modifica el archivo cartelera.csv del Ejercicio 4 e introduce un error a propósito 
		(por ejemplo: Inception;Nolan;dos mil diez).
		
		Modifica tu programa para que, al fallar el Integer.parseInt(), 
		el bloque catch (NumberFormatException e) capture el error, 
		guarde la línea defectuosa en un archivo errores_importacion.log, y 
		continúe leyendo el resto de películas sin detenerse.*/

		
		
		List<Pelicula> listaPeliculas= new ArrayList<>();
		

		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/Cartelera2.cvs")){
					 
					BufferedReader br = new BufferedReader(fr);
				 
					String linea;
				
				
					
					while((linea = br.readLine()) != null) {

					    String[] campos = linea.split(";");

					    String titulo = campos[0];
					    String director = campos[1];
					    
					    
					 try{   
					    
					    int anio = Integer.parseInt(campos[2]);

					
					    
					    Pelicula pelicula = new Pelicula(titulo, director, anio);

					    listaPeliculas.add(pelicula);
					    
					 }catch(NumberFormatException er) {
							System.out.println("Error al Leer: " + er.getMessage());

					 }
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