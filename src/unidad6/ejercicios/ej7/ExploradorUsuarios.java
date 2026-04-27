package unidad6.ejercicios.ej7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExploradorUsuarios {

	public static void main(String[] args) {
		/*Ejercicio 7: Exportador de Usuarios (Objeto a String)
Crea una clase Usuario con id (int), email (String) y activo (boolean).
Instancia 3 objetos Usuario directamente en tu código (en un array o lista).
Crea un programa que recorra la lista, concatene sus datos formando una cadena con el formato 
				
				[ID] - EMAIL - Estado: ACTIVO/INACTIVO 

y escriba cada cadena como una línea nueva en el archivo informe_usuarios.txt.*/
		
		
		
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
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/src/unidad6/ejemplos/Informe_Usuarios.txt", true));
	            PrintWriter out = new PrintWriter(bw)) { 
	            for (Usuario u : listaUsuarios) {
	                out.println(u.toString());
	            }

	            System.out.println("Archivo generado correctamente.");

	        } catch (IOException e) {
	        	System.out.println("Error al escrbir: " + e.getMessage());
	        }
	    }
	}