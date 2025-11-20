package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_21 {

	static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		/*Una empresa de alquiler de vehículos de tres clases: pequeños, medianos y grandes. La
		tarifa del alquiler por día es: 15€ en el auto pequeño, 20 € en el auto mediano y 30€ en el
		auto grande. Además, la empresa cobra 0.20 €/km recorrido en vehículo pequeño, 0.30
		€/km recorrido en vehículo mediano y 0.40€ /km recorrido en vehículo grande. Si la cantidad
		de km recorridos por el auto supera los 10 km por día se le aumentara un 2.5% sobre el
		monto a pagar por el cliente.
		Realice un programa que reciba el tipo de vehículo, los km a recorrer y muestre por pantalla
		el coste del alquiler del vehículo.*/
		
		
		//Variables
		int dias;

	double tarifaDia=0;
	
	
	double precioKm=0;

	
	
	
	System.out.println("---Bienvenido---");
	System.out.println("Seleccione un tamaño de vehiculo: ");
	System.out.println("P: Pequeño | Precio/dia=15 | Precio/Km=0.20");
	System.out.println("M: Mediano| Precio/dia=20 | Precio/Km=0.30");
	System.out.println("G: Grande| Precio/dia=30 | Precio/Km=0.40");
	
	String tamañoVehiculo=entrada.nextLine();
	
	char opcion= Character.toUpperCase(tamañoVehiculo.charAt(0));
	
	switch(opcion) {
	
	case 'P':
		tarifaDia=15;
		precioKm=0.20;
		
		System.out.println("");
	   break;
	  
	case 'M':
		System.out.println();
	   break;
	   
	case 'G':
		System.out.println();
	   break;
	
	default: 
		  System.out.println();
	}
	
	
	}
	
	public static double calcularPrecio(double tarifaDia, double precioKm) {
		System.out.println("¿Cuantos dia alquilara el coche?");
		
		int dias=entrada.nextInt();
		
		System.out.println("¿Cuantos kilometros hara al dia?");
		System.out.println("mas de 10 km al dia tiene un recargo del 2.5 del total");
		
		int Km_Dia=entrada.nextInt();
		
		if(Km_Dia>=10) {
			
			double precioFinal=dias* tarifaDia*
		}
		
		return precioFinal;
	}

}
