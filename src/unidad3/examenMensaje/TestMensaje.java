package unidad3.examenMensaje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMensaje {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);

		
		Mensaje m1=registrarMensaje(entrada, 1);
		Mensaje m2=registrarMensaje(entrada, 2);
		Mensaje m3=registrarMensaje(entrada, 3);
		
		

		
		int opcion=0;
		
		do {

			System.out.println("------MENU------");
			System.out.println("1. Mostrar todos los mensajes ");
			System.out.println("2. Mostrar mensaje de mayor Longitud");
			System.out.println("3. Contar cuantas veces aparece una letra en un mensaje");
			System.out.println("4. Mostrar contenido del mensaje invertido");
			//for(int i=m1.getContenido().length-1;i<=0,i--){}
			System.out.println("5. Convertir un mensaje a Formato Titulo");
			System.out.println("6. Salir");
			System.out.println("Seleccione un opción: ");
			
	try {
					opcion=entrada.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("Mensaje error: "+e.getMessage());
	}		
				switch (opcion) {
				case 1:
					System.out.println("Ha Seleccionado la Opción 1");
					m1.mostrarMensaje();
					m2.mostrarMensaje();
					m3.mostrarMensaje();
					break;
		
				case 2:
					System.out.println("Ha Seleccionado la Opción 2");
					
					Mensaje mayor= m1;
					
					if(m2.getLongitud()>mayor.getLongitud()) {m2=mayor;}
					if(m3.getLongitud()>mayor.getLongitud()) {m3=mayor;}
					
					System.out.println("El mensaje de mayor longitud: "+mayor.getLongitud());
					mayor.mostrarMensaje();
					
					break;
		
				case 3:
					System.out.println("Ha Seleccionado la Opción 3");
					System.out.println("Introduzcael numero del mensaje a buscar: ");
					int numero=entrada.nextInt();
					entrada.nextLine();
					System.out.println("Introduzca la letra a buscar: ");
					String letraBuscada=entrada.nextLine();
					char letra=letraBuscada.charAt(0);
				
					int contador=0;
			switch (numero) {
			case 1:
				for(int i=0;i<m1.getContenido().length();i++) {
								if(m1.getContenido().charAt(i)==letra) {
								contador++;}
							}
				
				
				break;
			case 2:
				for(int i=0;i<m2.getContenido().length();i++) {
								if(m2.getContenido().charAt(i)==letra) {
								contador++;}
							}
				break;
			case 3:
				for(int i=0;i<m3.getContenido().length();i++) {
								if(m3.getContenido().charAt(i)==letra) {
								contador++;}
							}
				break;
			}	
						System.out.println("La letra seleccionada "+ letra+" aparece "+contador+" veces");	
							
							
		
					break;
				
				case 4:
					System.out.println("Ha Seleccionado la Opción 4");
					break;
				
				case 5:
					System.out.println("Ha Seleccionado la Opción 5");
					break;
				
				case 6:
					System.out.println("Ha Seleccionado la Opción 6");
					System.out.println("Saliendo...");
					break;
		
				default:
					System.out.println("Opcion invalida");
					break;
				}
		
		}while(opcion!=6);	
				
			}

	
	
	public static Mensaje registrarMensaje(Scanner entrada, int num) {
		
		String autor;
		String contenido;
		boolean valido=false;
		boolean valido1=false;
			
			
		do {
			System.out.println("Introduzca autor del mensaje "+num+": ");
			
			autor=entrada.nextLine();
			
			
			
			if(autor.trim().isBlank()) {
				System.out.println("Error autor vacio");
			}else {
				valido=true;
			}
			
			
			
			
		}while(!valido);
		
	
		do {
			System.out.println("Introduzca Contenido del mensaje "+num+": ");
			
			contenido=entrada.nextLine();
			
			
			
			if(contenido.trim().isBlank()) {
				System.out.println("Error mensaje "+num+" en blanco");
				valido1=false;
				
			
			}else if(contenido.length()<5||contenido.length()>200 ){
				System.out.println("Contenido del mensaje "+num+" debe tener entre 5 y 200 caracteres");
				valido1=false;
			
			}else  {
				valido1=true;
			}
		}while(!valido1);
		
		
		Mensaje mensaje= new Mensaje (autor, contenido);
		
		
		
		return mensaje;
	}
	
	
}
