package unidad5.tarea;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**@author José E. Reyes Alcaide*/
	
public class GestorCompeticion {

	public static void main(String[] args) {

	
	//Nuevo formato para metodo toString()	
		
		Atleta atl1 = new Atleta("Ana Peleteiro","ESP",14.5);
		
		System.out.println(atl1);
		
		
		
	//Menu	
		
		List<Atleta> atletas= new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("Bienvenido al Menu del Programa");
			System.out.println("1. Inscribir un atleta");
			System.out.println("2. Retirar atleta(borrar)");
			System.out.println("3. Buscar atleta por Pais");
			System.out.println("4. Intercambiar orden de salto");
			System.out.println("5. Calculo de Rendimiento");
			System.out.println("6. Listar Participantes");
			System.out.println("7. Salir");
		
			System.out.println("Seleccione una opcion: ");

			opcion=entrada.nextInt();

	
			switch(opcion) {
			
			case 1:
				entrada.nextLine();
				System.out.println("Ha seleccionado la opcion 1");
				incribirAtleta(atletas, entrada);
				
				break;
			case 2:
				entrada.nextLine();

				System.out.println("Ha seleccionado la opcion 2");
				borrarAtleta(atletas, entrada);
				
				
				
				
				break;
			case 3:
				entrada.nextLine();

				System.out.println("Ha seleccionado la opcion 3");

				
				
				buscarAtletaPorPais(atletas, entrada);
				
				
				
				
				
				
				break;
			case 4:
				System.out.println("Ha seleccionado la opcion 4");
				break;
			case 5:
				System.out.println("Ha seleccionado la opcion 5");

				/*Iterator<Atleta> it= atletas.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}*/
			
				double max=atletas.get(0).getMarcaPersonal();
				
				for(int i=0;i<atletas.size();i++) {
					
					if(max<atletas.get(i).getMarcaPersonal()) {
						System.out.println(atletas.get(i)+" tiene la marca maxima");
					}
				}
				
				
				
				
				
				break;
			case 6:
				entrada.nextLine();
				System.out.println("Ha seleccionado la opcion 6");
				System.out.println("Listando los atletas participantes: ");
				
				for(Atleta atl: atletas) {
					System.out.println(atl);
				}
				
				
				
				break;
			case 7:
				System.out.println("Ha seleccionado la opcion 7");
				System.out.println("Saliendo...");
				break;
				default:
					System.out.println("Error! opcion invalida");

			}
			
			
		}while(opcion!=7);
		
		
	}

	public static void buscarAtletaPorPais(List<Atleta> atletas, Scanner entrada) {
		System.out.println("Introduce las tres primeras letras del pais a buscar: ");

		String iniciales=entrada.nextLine();
			
		for(int i=0;i<atletas.size();i++) {
			
			if(atletas.get(i).getPais().substring(0,3).equals(iniciales)) {
				System.out.println("Atletas de la nacionalidad ["+iniciales+"] encontrados:");
				System.out.println(atletas.get(i).toString());
				
			}else System.out.println("No encontrado");
		}
	}

	public static void borrarAtleta(List<Atleta> atletas, Scanner entrada) {
		System.out.println("Inserte el nombre a borrar: ");
		String borrado=entrada.nextLine();
		
		for(int i=0;i<atletas.size();i++) {
			if(atletas.get(i).getNombre().contains(borrado)) {
				atletas.remove(i);
			}
		}
	}

	public static void incribirAtleta(List<Atleta> atletas, Scanner entrada) {
		System.out.println("Ingrese nombre del Atleta: ");
		String nombre=entrada.nextLine();
		System.out.println("Ingrese pais del Atleta");
		String pais=entrada.nextLine();
		
		boolean marcaFallida= true;
		double marcaPersonal=0;
		while(marcaFallida) {
			System.out.println("Ingrese Marca personal: ");
			marcaPersonal=entrada.nextDouble();
			
			if(marcaPersonal<0) {System.out.println("Error! Marca negativa") ;continue;}
			else marcaFallida=false;
		}
		
		atletas.add(new Atleta(nombre,pais,marcaPersonal));
	}

	public static void IntercambiarOrdenSalto(List<Atleta> atletas, Scanner entrada) {
		
		System.out.println("Vas a intercambiar el orden de dos atletas");
		System.out.println("introduce la posicion del 1º atleta");
		
		int origen =entrada.nextInt(); 
		System.out.println("introduce la posicion del 2º atleta");
		int destino=entrada.nextInt();
		
		Atleta aux;
		
		aux=atletas.get(destino);
		
		atletas.set(destino, atletas.get(origen));
		atletas.set(origen, aux);
		
		
		
	}
	
	
	public static void CalculoRendimiento(List<Atleta> atletas) {
		double maximo= atletas.get(0).getMarcaPersonal();
		
		for(int i=1; i<atletas.size();i++) {
			maximo=Math.max(maximo, atletas.get(i).getMarcaPersonal());
		}
		
		
			System.out.println(maximo);
			
			double indice= Math.round(Math.sqrt(maximo)*10);
			
			
			System.out.println(indice);
			
		
	}
	
	
}
