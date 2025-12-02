package unidad3.ejemplos;
/*Implementa una clase Ascensor que simule el funcionamiento básico de
un ascensor en un edificio de seis plantas, numeradas del 0 al 5. El
ascensor cuenta con un panel de control que permite realizar las
siguientes acciones:

1. Marcar planta: El usuario ingresa el número de la planta deseada,
y el ascensor se desplazará hasta ella, subiendo o bajando según
corresponda.
2. Abrir puerta: El usuario puede abrir la puerta del ascensor.
3. Cerrar puerta: El usuario puede cerrar la puerta del ascensor.
4. Apagar: Finaliza el programa.

Requisitos:

● El ascensor comienza en la planta 1 con la puerta cerrada.
● Si la puerta está abierta, no se debe permitir el movimiento del
ascensor hasta que esté cerrada.
● Los métodos deben realizar las acciones indicadas:
○ marcarPlanta(int plantaMarcada): Lleva al ascensor a la
planta indicada, moviéndose de uno en uno (una planta a la
vez).
○ abrirPuerta() y cerraPuerta(): Abren y cierran la puerta,
respectivamente.
○ subir() y bajar(): Desplazan el ascensor una planta hacia
arriba o abajo.
Al seleccionar la opción "Apagar", el programa finalizará, mostrando un
mensaje de despedida*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ascensor {
	
	private static int plantaActual;
	private static boolean cerrada;
	
	public Ascensor() {
		plantaActual=1;
		cerrada=true;
	}
	
	
	
	
public static void subir(int plantaActual) {
	System.out.println("Esta subiendo a la planta "+ plantaActual++);
	
}

public static void bajar(int plantaActual) {
	System.out.println("Esta bajando a la planta "+ plantaActual--);
	
}

public static void abrirPuerta() {
	System.out.println("la puerta se esta abriendo");
	cerrada=false;
	
}

public static void cerrarPuerta() {
	System.out.println("la puerta se esta cerrando");
	cerrada=true;
}

public static void marcarPlanta(int plantaMarcada) {
	
if(plantaMarcada<plantaActual) {
	
	for(int i=1;plantaActual<plantaMarcada;i++) {
		Ascensor.subir(plantaMarcada);
		plantaActual++;
	}
	
}else {
	for(int i=1;plantaActual>plantaMarcada;i++) {
		Ascensor.bajar(plantaMarcada);
		plantaActual--;
	}
}



}

	public static void main(String[] args) {

	Scanner entrada =new Scanner(System.in);
		
		Ascensor elCorteIngles = new Ascensor();
		

	int opcion=0;
	
	do{
		System.out.println("Seleccione la planta de destino:");
		System.out.println("1: Marcar Planta.");
		System.out.println("2: Abrir puerta");
		System.out.println("3: Cerrar puerta ");
		System.out.println("4: Apagar");
		
		
		try {
			opcion=entrada.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Error! introduzca numero de planta");
		}
		
		switch(opcion) {
		
		
		
		case 1:
			System.out.println("Introduce a qué planta quieres ir: ");
			Ascensor.marcarPlanta(entrada.nextInt());
			
			break;
			
		case 2:
		Ascensor.abrirPuerta();
			break;
			
		case 3:
			Ascensor.cerrarPuerta();
			break;
			
		case 4:
		System.out.println("Apagando...");
			break;
			
	
		
		default: 
			System.out.println("Opcion invalida!!");
		}
		
	}while(opcion!=4);
	
	
	
	
	
	
	
	
	}
	

}
