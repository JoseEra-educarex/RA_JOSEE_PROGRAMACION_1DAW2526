package unidad5.ejemplos.arrayList.ejercicio6;

		
		import java.util.LinkedList;
		import java.util.Scanner;

public class CompañerosClaseII {

	public static void main(String[] args) {

		/*Escriba un programa Java para insertar el nombre de un compañero/a en la posición especificada
			en la lista enlazada del ejercicio anterior.*/


		 LinkedList<String> listaCompaneros = new LinkedList<>();
		 
		 Scanner scanner = new Scanner(System.in);

		 // Agregar 5 nombres iniciales
		 
		 for (int i = 1; i <= 5; i++) {
		 
			 System.out.print("Ingrese el nombre del compañero/a " + i + ": ");
		     
			 listaCompaneros.add(scanner.nextLine());
		     
		 }

		 
		 // Mostrar lista actual
		 
		 System.out.println("\nLista actual: " + listaCompaneros);

		 
		 
		 // Pedir nuevo nombre y posición
		 
		 System.out.print("\nIngrese el nombre que desea insertar: ");
		 
		 String nuevoNombre = scanner.nextLine();

		 
		 
		 
		 System.out.print("Ingrese la posición donde desea insertarlo (0 a "+ listaCompaneros.size() + "): ");
		        
		 int posicion = scanner.nextInt();

		        
		 // Validar posición
		 
		 if (posicion >= 0 && posicion <= listaCompaneros.size()) {
		 
			 listaCompaneros.add(posicion, nuevoNombre);
		     
			 
			 System.out.println("\nNombre insertado correctamente.");
		     
		 } else {
		 
			 System.out.println("\nPosición inválida.");
		     
		 }

		 
		 // Mostrar lista final
		 
		 System.out.println("\nLista final: " + listaCompaneros);

		 
		 scanner.close();
		 
	}
		
}