package unidad6.ejemplos.reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FiltrosLogs {

	public static void main(String[] args) {
		
File directorio= new File(".");//.=directorio actual
		
		System.out.println("El directorio actual es:" + directorio.getAbsolutePath());
		// /home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/.
		
		
		String linea;
		

		
		try (FileReader fr = new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/server.log")){
			 
			BufferedReader br = new BufferedReader(fr);
		 
		
			
		
			while((linea = br.readLine())!=null) {
				
				if(linea.contains("ERROR") || linea.contains("CRITICAL")) {
					
					
					  try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/alertas_urgentes.txt", true));
					            PrintWriter out = new PrintWriter(bw)) {  // PrintWriter nos da el cómodo println()
						
						  out.println(linea);
				
						  
					  }catch(IOException e){
						  
						  
						  }//fin del catch
					
					
					
					
					
					
					
				}//FIN DEL IF
			}//fin de while
		
	} catch (IOException e) {
	
	System.out.println("Error al Leer: " + e.getMessage());
 
}
	
		
		
		
	}//FIN DE MAIN

}// FIN DE LA CLASE
