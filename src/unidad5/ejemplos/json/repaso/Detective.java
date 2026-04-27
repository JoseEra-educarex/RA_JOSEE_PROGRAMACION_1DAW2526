package unidad5.ejemplos.json.repaso;

import java.io.File;
import java.io.IOException;

public class Detective {

	public static void main(String[] args) {
		


		        // Crear objeto para la carpeta
		        File carpeta = new File("logs");
		        
		        // Crear la carpeta si no existe
		        if (!carpeta.exists()) {
		            carpeta.mkdirs();
		        }

		        // Ahora sí, crear el archivo dentro
		        File archivoLog = new File(carpeta, "registro.txt");
		        
		        try {
		            archivoLog.createNewFile();
		            System.out.println("Archivo creado correctamente.");
		        } catch (IOException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}