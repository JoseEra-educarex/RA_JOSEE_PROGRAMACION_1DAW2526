package unidad7.tareaVE;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EcoMovilApp {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);

		List<VehiculoElectrico> ListaVehiculos = new ArrayList<>();
	
		int opcion=0;
		
	do{	
		
		System.out.println("-----MENU-----");
		System.out.println("1. Agregar una bicicleta eléctrica.");
		System.out.println("2. Agregar un patinete eléctrico.");
		System.out.println("3. Agregar un coche eléctrico.");
		System.out.println("4. Mostrar todos los vehículos registrados.");
		System.out.println("5. Cargar todos los vehículos.");
		System.out.println("6. Salir del programa.");
		System.out.println("Seleccione una opcion:");
		opcion =entrada.nextInt();
		
	switch(opcion) {
	
	case 1:
		
		System.out.println("Ha seleccionado la Opcion 1");
		System.out.println("Agregar una bicicleta eléctrica.");
		System.out.println("--------------------------------");
		System.out.println();
		agregarBicicleta(entrada, ListaVehiculos);
		
		break;
	case 2:
		System.out.println("Ha seleccionado la Opcion 2");
		System.out.println("Agregar una patinete eléctrico.");
		System.out.println("--------------------------------");
		System.out.println();
		agregarPatinete(entrada, ListaVehiculos);

		
		
		break;
	case 3:
		
		System.out.println("Ha seleccionado la Opcion 3");
		System.out.println("Agregar un coche eléctrico.");
		System.out.println("--------------------------------");
		System.out.println();
		
		agregarCoche(entrada, ListaVehiculos);

		break;
	case 4:
		
		System.out.println("Ha seleccionado la Opcion 4");
		System.out.println("Mostrar todos los vehículos registrados.");
		
		
		break;
	case 5:
		
		System.out.println("Ha seleccionado la Opcion 5");
		
		break;
	case 6:
		
		System.out.println("Ha seleccionado la Opcion 6");
		System.out.println("Saliendo...");
		break;
	
	default: 

		System.out.println("Opcion seleccionado no valida");
		break;
	}	
		
		
		

	}while(opcion != 6);
		
		
		
	}

	public static void agregarCoche(Scanner entrada, List<VehiculoElectrico> ListaVehiculos) {
		System.out.println("Introduce la marca:");
		String marca=entrada.nextLine();
		System.out.println("Introduce la modelo:");
		String modelo=entrada.nextLine();
		System.out.println("Introduce la autonomia:");
		int autonomia=entrada.nextInt();
		System.out.println("Introduce Numero de puertas: ");
		int numPuertas=entrada.nextInt();
		
	CocheElectrico coche1=	new CocheElectrico(marca, modelo,autonomia,numPuertas);
		
		ListaVehiculos.add(coche1);
	}

	public static void agregarPatinete(Scanner entrada, List<VehiculoElectrico> ListaVehiculos) {
		System.out.println("Introduce la marca:");
		String marca=entrada.nextLine();
		System.out.println("Introduce la modelo:");
		String modelo=entrada.nextLine();
		System.out.println("Introduce la autonomia:");
		int autonomia=entrada.nextInt();	
		System.out.println("cuanta potencia tiene el motor: ");
		int potencia=entrada.nextInt();
		PatineteElectrico patin1=new PatineteElectrico(marca, modelo,autonomia,potencia);
		ListaVehiculos.add(patin1);
	}

	public static void agregarBicicleta(Scanner entrada, List<VehiculoElectrico> ListaVehiculos) {
		System.out.println("Introduce la marca:");
		String marca=entrada.nextLine();
		System.out.println("Introduce la modelo:");
		String modelo=entrada.nextLine();
		System.out.println("Introduce la autonomia:");
		int autonomia=entrada.nextInt();
		entrada.nextLine();
		System.out.println("Tiene pedales? Si o No:");
		boolean tienePedales=entrada.nextBoolean();
		entrada.nextLine();

		
		
		BicicletaElectrica bici1=new BicicletaElectrica(marca, modelo,autonomia,tienePedales);
		ListaVehiculos.add(bici1);
		
		System.out.println("Bicicleta agregada correctamente");
	}

	
	
	
	
}
/*Introduce la marca: Moma
Introduce el modelo: E-Bike Pro
Introduce la autonomía (km): 80
¿Tiene pedales? (true/false): true
Bicicleta eléctrica agregada correctamente.*/

/*• Usa un ArrayList<VehiculoElectrico> para almacenar los vehículos.
• Muestra un menú que permita al usuario:
1. Agregar una bicicleta eléctrica.
2. Agregar un patinete eléctrico.
3. Agregar un coche eléctrico.
4. Mostrar todos los vehículos registrados.
5. Cargar todos los vehículos.
6. Salir del programa.
• Valida que el usuario no introduzca más de 5 vehículos de cada tipo. En caso contrario,
muestra un mensaje de error.
• Usa polimorfismo y un iterador para recorrer el ArrayList y llamar a los métodos
mostrarInformacion() y cargar().*/