package unidad6.ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class ChatLog {

	public static void main(String[] args) {
/*Objetivo: Crear un programa interactivo que pida frases al usuario por consola y 
 * las vaya guardando en un archivo de texto llamado historial.txt de forma persistente.

Enunciado detallado:

Importa la clase Scanner y las clases necesarias para escritura de texto con Buffer.
Utiliza un bloque try-with-resources para abrir 
(o crear) el archivo historial.txt en modo añadir (append).
Crea un bucle infinito que pida al usuario "Escribe un mensaje:".
Si el usuario escribe la palabra "FIN" (ignora mayúsculas/minúsculas), rompe el bucle con un break.
Si escribe cualquier otra cosa, guarda esa frase en el archivo, seguida de un salto de línea.
Ejecuta el programa varias veces, ciérralo y ábrelo, y verifica abriendo el archivo con el
 Bloc de Notas que el historial de todas las ejecuciones se conserva.*/
	
	
		
Scanner entrada= new Scanner (System.in);
		
		
	String mensaje=null;	
	
	while(true) {
			System.out.println("Escribe un mensaje: ");
			mensaje=entrada.nextLine();
			
			if(mensaje.equalsIgnoreCase("fin")) {
				break;
			}else {
				
				try (FileWriter fw = new FileWriter("./src/unidad6/ejemplos/historial.txt", true);
					     BufferedWriter bw = new BufferedWriter(fw);
					     PrintWriter out = new PrintWriter(bw)) { // PrintWriter nos da el cómodo println()
					            
					     out.println(mensaje);
					     System.out.println("¡Datos guardados en el Historial!");

					        } catch (IOException e) {
					            System.out.println("Error al escribir: " + e.getMessage());
					        }
				
				
				
		
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
 // 1. try-with-resources: ¡Se cerrarán solos!
// 2. new FileWriter("registro.txt", true) -> El 'true' activa "añadir al final"

		    }
		}
