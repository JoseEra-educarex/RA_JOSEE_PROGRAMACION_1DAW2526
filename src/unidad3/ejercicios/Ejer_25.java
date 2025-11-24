package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_25 {

	public static void main(String[] args) {
		/*Un agricultor tiene 150 hectáreas disponibles para plantar maíz y tomates. Las semillas de
tomates le cuestan 3.00 € por hectárea y las de maíz 5.00 € por hectárea. Implemente una
aplicación que permita determinar cuál es el costo que invertirá el agricultor por la compra
de cierta cantidad de hectáreas de tomates y maíz, sabiendo que la suma de las hectáreas 
no debe exceder a 150 hectáreas. Además, deberá determinar en qué semilla se invirtió más
dinero*/

	
		 final int TOTAL_HECTAREAS = 150;
	     final double COSTO_TOMATE = 3.0;
	     final double COSTO_MAIZ = 5.0;

	     Scanner sc= new Scanner(System.in);
	     
	        System.out.println("Ingrese hectáreas de tomates a plantar:");
	        int hectareasTomate = sc.nextInt();

	        System.out.println("Ingrese hectáreas de maíz a plantar:");
	        int hectareasMaiz = sc.nextInt();

	        int hectareasTotales = hectareasTomate + hectareasMaiz;

	        if (hectareasTotales > TOTAL_HECTAREAS) {
	            System.out.println("Error: La suma de hectáreas no puede exceder " + TOTAL_HECTAREAS);
	        } else {
	            double costoTomate = hectareasTomate * COSTO_TOMATE;
	            double costoMaiz = hectareasMaiz * COSTO_MAIZ;
	            double costoTotal = costoTomate + costoMaiz;

	            System.out.println("Costo por tomates: " + costoTomate + " €");
	            System.out.println("Costo por maíz: " + costoMaiz + " €");
	            System.out.println("Costo total: " + costoTotal + " €");

	            if (costoTomate > costoMaiz) {
	                System.out.println("Se invirtió más dinero en tomates.");
	            } else if (costoMaiz > costoTomate) {
	                System.out.println("Se invirtió más dinero en maíz.");
	            } else {
	                System.out.println("Se invirtió la misma cantidad en ambos cultivos.");
	            }
	        }

	        sc.close();
	    }
	}
