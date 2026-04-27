package unidad5.ejemplos.json.repaso;
		
	import java.nio.file.Files;
			
	import java.nio.file.Path;
			
	import java.nio.file.Paths;
			
	import java.io.IOException;


public class OperacionRenove {

	public static void main(String[] args) {

	 Path carpeta = Paths.get("archivos_subidos");

		        if (!Files.exists(carpeta)) {
		            try {
		                Files.createDirectory(carpeta);
		                System.out.println("Carpeta creada con éxito.");
		            } catch (IOException e) {
		                System.out.println("Error al crear la carpeta: " + e.getMessage());
		            }
		        } else {
		            System.out.println("La carpeta ya existía.");
		        }
		    }
	
	//CODIGO ANTIGUO
	
	/*import java.io.File;

File carpeta = new File("archivos_subidos");

if (!carpeta.exists()) {
    carpeta.mkdir();
    System.out.println("Carpeta creada con éxito.");
} else {
    System.out.println("La carpeta ya existía.");
}*/
	
		}