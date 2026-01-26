package unidad5.ejemplos;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("¿Cuantos precios desea almacenar?");
		
		int indice=entrada.nextInt();
		
		double[] precios=new double[indice];
		
		
		for (int i = 0; i < precios.length; i++) {
	           
			System.out.println("introduzca el precio "+(i+1));
			precios[i]=entrada.nextDouble();
			entrada.nextLine();
	       }
		
		 System.out.println("Lista completa de precios:");
	       for (int i = 0; i < precios.length; i++) {
	           System.out.println("Precio " + (i+1) + ": " + precios[i]);
	       }
	       
	       
	       double precioTotal= CalculoPrecioTotal(precios);
	       System.out.println("El precio total es "+precioTotal+" Euros");
	       
	   entrada.close();

	}

public static double CalculoPrecioTotal(double[] precios) {
		
		double precioTotal=0;
		
		 for (int i = 0; i < precios.length; i++) {
			 
	         precioTotal+=precios[i];
	       }
		
		return precioTotal;
	}

}

