package unidad3.examenTarea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorTareas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);

		Tarea t1=  registrarTarea(entrada, 1);
		Tarea t2=  registrarTarea(entrada, 2);
		Tarea t3=  registrarTarea(entrada, 3);
		
		int opcion=0;
		
		do {
			System.out.println("--------MENU--------");
			System.out.println("1. Mostrar todas las tareas");
			System.out.println("2. Tarea con mayor prioridad");
			System.out.println("3. Buscar tarea por nombre");
			System.out.println("4. Calcular y mostrar el promedio redondeado de las duraciones");
			System.out.println("5. Mostrar tareas que superen limite de prioridad");
			System.out.println("6. Salir");
			System.out.println("Seleccione una Opción");
		
			
			try {
				
				
			opcion=Integer.parseInt(entrada.nextLine());
			}catch(NumberFormatException exc){
				System.out.println("Error ingrese opcion valida");
			}
			 switch (opcion) {
	            case 1:
	                System.out.println("Mostrando todas las tareas...");
	                

	        		t1.mostrarTarea();
	        		t2.mostrarTarea();
	        		t3.mostrarTarea();
	                
	                
	                break;

	            case 2:
	                System.out.println("Mostrando tarea con mayor prioridad...");
	                
	                Tarea mayor=t1;
	                
	                if(t2.getPrioridad()> mayor.getPrioridad()) mayor=t2;
	                
	                if(t3.getPrioridad()> mayor.getPrioridad()) mayor=t3; 
	                
	                mayor.mostrarTarea();
	                
	                break;

	            case 3:
	                System.out.println("Buscando tarea por nombre...");
	                
	                System.out.println("Introduzca el nombre de la tarea: ");
	                
	                String buscado=entrada.nextLine();
	                
	                Tarea buscada=null;
	   
	                 if(t1.getNombre().equalsIgnoreCase(buscado)) { buscada=t1; }
	                 else if(t2.getNombre().equalsIgnoreCase(buscado)) { buscada=t2; }
	                 else if(t3.getNombre().equalsIgnoreCase(buscado)) { buscada=t3; }
	                 else {
	                	 System.out.println("Tarea no encontrada");
	                 }
	                 
	                if(buscada!=null) {
	                System.out.println(" Tarea encontrada:");
	                buscada.mostrarTarea();
	                 }
	                break;

	            case 4:
	                System.out.println("Calculando promedio de duraciones...");
	                
	         

	                double promedio = (t1.getHoras() + t2.getHoras() + t3.getHoras()) / 3;
	               
	                long promedioRedondeado = Math.round(promedio);
	                System.out.println("Promedio de duración: " + promedio + " horas");

	                System.out.println("Promedio de duración (redondeado): " + promedioRedondeado + " horas");
	               
	                
	                
	                break;

	            case 5:
	            	System.out.println("Mostrando tareas que superan el límite de prioridad...");
	                System.out.print("Introduce el límite de prioridad: ");
	                
	                try {
	                
	                	int limite = Integer.parseInt(entrada.nextLine());
	                
	                   
	                
	                boolean encontrada = false;

	                if (t1.getPrioridad() > limite) {
	                    t1.mostrarTarea();
	                    encontrada = true;
	                }
	                if (t2.getPrioridad() > limite) {
	                    t2.mostrarTarea();
	                    encontrada = true;
	                }
	                if (t3.getPrioridad() > limite) {
	                    t3.mostrarTarea();
	                    encontrada = true;
	                }

	                if (!encontrada) {
	                    System.out.println("No hay tareas que superen ese límite.");
	                } 
	                
	                }catch(NumberFormatException ex){
	                	System.out.println("Error... ingrese un limite valido");
	                }           
	                break;

	            case 6:
	                System.out.println("Saliendo del programa...");
	                
	                break;

	            default:
	                System.out.println("Opción no válida. Intente nuevamente.");
	        }
			
			
		}while(opcion!=6);
		

		
	}

	//metodo para registrar tareas:
	
	public static Tarea registrarTarea(Scanner entrada, int num) {
		String nombre;
		String categoria;
		double duracionHoras=0;
		boolean valido=false;
		boolean valido1=false;
		boolean valido2=false;
		do {
			
		System.out.println("Introduce el nombre de la tarea: ");
		nombre=entrada.nextLine();
		
		if (nombre.trim().isEmpty()) {
			System.out.println("Error Nombre en blaco");
		}else {
			valido=true;
		}

		}while(!valido);
		
		
		
		do {
			
			System.out.println("Introduce la categoria de la tarea "+num+" : ");
			
		categoria=entrada.nextLine();
			
			if (categoria.trim().isEmpty()) {
				System.out.println("Error categoria en blaco");
			}else {
				valido1=true;
			}

			}while(!valido1);
		
	
		 do {
		        try {
		            System.out.print("Introduce la duración de la tarea (0.5 - 12): ");
		            duracionHoras = entrada.nextDouble();
		            entrada.nextLine(); // limpiar buffer

		            if (duracionHoras < 0.5 || duracionHoras > 12) {
		                System.out.println("Error: duración fuera de rango");
		                valido2 = false;
		            } else {
		                valido2 = true;
		            }

		        } catch (InputMismatchException e) {
		            System.out.println("Error: introduce un número válido");
		            entrada.nextLine(); // limpiar buffer
		            valido2 = false;
		        }
		    } while (!valido2);
		
		 
		 Tarea tarea=new Tarea(nombre,categoria);
		
		tarea.setHoras(duracionHoras);
		
		
		return tarea;
	}
	
	
	
	
}
