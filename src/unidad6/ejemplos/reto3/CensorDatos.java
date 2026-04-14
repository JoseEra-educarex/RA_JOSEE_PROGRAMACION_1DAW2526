package unidad6.ejemplos.reto3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CensorDatos {

	public static void main(String[] args) {

		
		File directorio= new File(".");//.=directorio actual
		
		System.out.println("El directorio actual es:" + directorio.getAbsolutePath());
		
		// /home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/usuarios_backup.txt
		String linea;
		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/usuarios_backup.txt")){
			 
			BufferedReader br = new BufferedReader(fr);
		 
			
			//linea = br.readLine();  -> para no leer la primera linea dentro del bucle
		
		
			
		while((linea = br.readLine())!=null) {
			System.out.println(linea);

		String [] campos= linea.split(".");//devuelve un array de campos
		
		
		for(String s: campos) {
			System.out.println(s);
		}
		
		 /* try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/unidad6/ejemplos/reto1/usuarios_censurados.txt", true));
		            PrintWriter out = new PrintWriter(bw)) {  // PrintWriter nos da el cómodo println()
			
			  out.println(linea);
		
			  
		  }catch(IOException e){
			  
			  
			  }
		
		
		
		
		

		
	
		
		
		
		
		
		}*/
		
		}
		}catch (IOException e) {
			
			System.out.println("Error al Leer: " + e.getMessage());
		 
		}
	}
}
