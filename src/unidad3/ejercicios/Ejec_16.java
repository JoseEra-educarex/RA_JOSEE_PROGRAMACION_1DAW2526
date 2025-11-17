package unidad3.ejercicios;

import java.util.Scanner;

public class Ejec_16 {

	public static void main(String[] args) {
		/*16. Escriba una aplicación que solicite a un usuario la cantidad de años 
		 * que el usuario tiene hasta la jubilación y la cantidad de dinero que el 
		 * usuario puede ahorrar anualmente. Si el usuario ingresa 0 o un número 
		 * negativo para cualquiera de los valores, vuelva a comunicar al usuario 
		 * hasta que se hagan entradas válidas. Suponga que no se ganan intereses 
		 * sobre el dinero. Muestra la cantidad de dinero que tendrá el usuario al
		 *  momento de la jubilación. Guarda el archivo como ObjetivoJubilacion.java.*/
		/*Modifique la aplicación ObjetivoJubilacion para mostrar la cantidad de dinero
		 *  que el usuario tendrá si el usuario gana 4% de interés sobre el saldo cada
		 *   año. Guarde la aplicación como ObjetivoJubilacion2.java.*/
		Scanner entrada =new Scanner(System.in);
		
	
		final double TASA_AHORRO_ANUAL=0.04 ;
		double ahorro_anual;
		int anios_Jubilacion;
		do {
			
			System.out.println("¿Cuántos años le faltan hasta la jubilación?");
			
			anios_Jubilacion= entrada.nextInt();
			
			System.out.println("¿Cuánto puede ahorrar anualmente?");
			
			ahorro_anual= entrada.nextDouble();
			
			if(ahorro_anual<=0 || anios_Jubilacion<=0) {
			
				System.out.println("Entrada invalida, Pruebe de nuevo  ");
			
			}else {
				double totalAhorrado = 0;

		        for (int i = 1; i <= anios_Jubilacion; i++) {
		            totalAhorrado += ahorro_anual;      // se añade el ahorro del año
		            totalAhorrado *= 1 + TASA_AHORRO_ANUAL; // se aplica el interés anual
		        }

		        System.out.println("El total ahorrado"+ totalAhorrado);
			 }
			 
			}
			
			
		}while(ahorro_anual<=0 || anios_Jubilacion<=0);
		
		
		entrada.close();
		
	}

}
