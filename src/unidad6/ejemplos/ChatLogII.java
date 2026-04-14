package unidad6.ejemplos;
import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

	
public class ChatLogII {

		public static void main(String[] args) {
	
		
		
		try (FileReader fr = new FileReader("./src/unidad6/ejemplos/historial.txt");
			 
				BufferedReader br = new BufferedReader(fr))
			 
		{ 
			System.out.println(br.readLine());
						            
	} catch (IOException e) {
		
		System.out.println("Error al Leer: " + e.getMessage());
	 
	}
					
					
					
			
					
}
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	 // 1. try-with-resources: ¡Se cerrarán solos!
	// 2. new FileWriter("registro.txt", true) -> El 'true' activa "añadir al final"

			    }
			