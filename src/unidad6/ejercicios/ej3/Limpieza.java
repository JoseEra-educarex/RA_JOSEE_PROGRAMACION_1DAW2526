package unidad6.ejercicios.ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Limpieza {

static 	String [] campos;
	
	public static void main(String[] args) {

		/*Ejercicio 3: Limpieza de Espacios
Te han pasado un archivo categorias_sucias.txt con nombres de categorías mal formateados 
(ej: " Terror ", " Comedia"). Lee el archivo, utiliza el método .trim() para eliminar los espacios 
sobrantes a los lados, y escribe el resultado limpio en un nuevo archivo llamado categorias_limpias.txt.*/
		
		
		
		// /home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/src/unidad6/ejemplos/categorias_sucias.txt
		
		
		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/src/unidad6/ejemplos/categorias_sucias.txt")){
			 
			BufferedReader br = new BufferedReader(fr);
		 
			String linea;
	
			
		while((linea = br.readLine())!=null) {
			
			//System.out.println(linea);
	
		 campos= linea.split(",");//devuelve un array de campos

		for(int i=0; i<campos.length;i++) {
			
			
			
			System.out.println(campos[i]);
			
	}
		
		
		
		for(int i=0; i<campos.length;i++) {
			
				
				
				System.out.println(campos[i].trim());
				
		}
		
		}

		
	} catch (IOException e) {
	
	System.out.println("Error al Leer: " + e.getMessage());
 
}
	
	 try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/src/unidad6/ejemplos/categorias_limpias.txt", true));
	            PrintWriter out = new PrintWriter(bw)) {  // PrintWriter nos da el cómodo println()
		
	for(int i=0; i<campos.length;i++) {
			
				
				
		out.println(campos[i].trim());
				
		}
		 
		  
	  }catch(IOException e){
		 
		  System.out.println("Error al escrbir: " + e.getMessage());
		  
		  }//FIN CATCH 
	  }//fin main
	           
	
	
	
	

		
	
	

}//fin clase
		
		
		
		
		
	

	
	
	
	

