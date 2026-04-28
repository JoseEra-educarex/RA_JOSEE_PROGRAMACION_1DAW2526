package unidad6.ejercicios.ej8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import unidad6.ejercicios.ej7.Usuario;

public class OfuscadorEmail {

	public static void main(String[] args) {
/*Ejercicio 8: El Ofuscador de Emails
Modifica el Ejercicio 7. Antes de escribir el email en el archivo de texto, ofúscalo por privacidad. 
Debes usar métodos de String para localizar la arroba (.indexOf('@')), 
quedarte con el dominio (.substring()) y cambiar el nombre del usuario por asteriscos.

Ejemplo: juan.perez@gmail.com se escribirá en el fichero como ********@gmail.com.*/
	
	
	

		Usuario usu1 = new Usuario(1,"pepito@gmail.com",false);
		
		Usuario usu2 = new Usuario(2,"miguelito@gmail.com", true);

		Usuario usu3 = new Usuario(3, "pascualito@gmail.es", true);

		List<Usuario> listaUsuarios = new ArrayList<>();	
		
		listaUsuarios.add(usu1);
		listaUsuarios.add(usu2);
		listaUsuarios.add(usu3);

		for(Usuario u: listaUsuarios) {
			System.out.println(u);
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/Ofuscador", true));
	            PrintWriter out = new PrintWriter(bw)) { 
	           
			  for (Usuario u : listaUsuarios) {

	                String emailOfuscado = ofuscarEmail(u.getEmail());
	            
	                out.println("ID: " + u.getId() +
	                            " Email: " + emailOfuscado +
	                            " Activo: " + u.isActivo());
	            }

	            System.out.println("Archivo generado correctamente.");

	        } catch (IOException e) {
	            System.out.println("Error al escribir: " + e.getMessage());
	        }
	    }

	    // Método para ofuscar el email
	    public static String ofuscarEmail(String email) {

	        int posArroba = email.indexOf('@');

	        String dominio = email.substring(posArroba); // desde @ hasta el final
	        String nombre = email.substring(0, posArroba); // antes de @

	        String asteriscos = "";
	        for (int i = 0; i < nombre.length(); i++) {
	            asteriscos += "*";
	        }

	        return asteriscos + dominio;
	    }
	}