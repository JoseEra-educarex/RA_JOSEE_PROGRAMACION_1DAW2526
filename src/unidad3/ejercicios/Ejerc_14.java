package unidad3.ejercicios;

import java.util.Scanner;

public class Ejerc_14 {

	public static void main(String[] args) {
		/*. En una veterinaria de nuestra localidad ofrece distintos tipos de análisis 
		 * a perros. Los precios de los análisis son como siguen: 
		 * Tipo de análisis 1= 25.00 €; Tipo de análisis 2= 36.00 €; Tipo
			de análisis 3= 50.00 €. Realizar un programa que muestre el precio
			 al indicar el tipo de análisis.
				Por otra parte, existen clientes afiliados y no afiliados. 
				En caso de que el animal pertenezca a un cliente afiliado se le 
				descuenta un 8% al precio del análisis. Introduce en una segunda
				versión del programa este cálculo.*/
		
		Scanner entrada= new Scanner(System.in);
		
		int opcion;
		double precio =0;
		
		
		do {
			
		System.out.println("------BIENVENIDO------");
		System.out.println("Introduzca una opcion");
		System.out.println("1. Analisis Tipo 1");
		System.out.println("2. Analisis Tipo 2");
		System.out.println("3. Analisis Tipo 3");
		System.out.println("0. Salir del Programa");
		
		opcion=entrada.nextInt();
			
		switch(opcion) {
		
		case 1: 
			System.out.println("ha seleccionado Analisis tipo 1");
			System.out.println("Su precio es 25.00 Euros");
			precio=25;
			break;
		case 2: 
			System.out.println("ha seleccionado Analisis tipo 2");
			System.out.println("Su precio es 36.00 Euros");
			precio=36;
			break;
		case 3: 
			System.out.println("ha seleccionado Analisis tipo 3");
			System.out.println("Su precio es 50.00 Euros");
			precio=50;
			break;
		case 0: 
			System.out.println("Gracias por venir a la clinica");
			break;
		
		default: System.out.println("Seleccione una opcion valida");
		System.out.println();
		}
		
		}while(opcion < 0 || opcion > 3);
		
		if(opcion==0) {
		
			System.out.println("¡Hasta Pronto!");	
			
		}else {
			
		System.out.println("¿Está afiliado a nuestra clinica?");
		System.out.println("Los afiliados obtienen un 8% de descuento!!!");
		String respuesta=entrada.nextLine();
				respuesta=entrada.nextLine();
		
	

           if (respuesta.equalsIgnoreCase("si")) {
               double nuevoPrecio = calcularNuevoPrecio(precio);
			System.out.println("Su nuevo precio es: "+ nuevoPrecio+ " Euros");
		}else {
			System.out.println("Afiliese para obtener ventajas y descuentos!");
		}
		
		}
		
		entrada.close();

	}

	private static double calcularNuevoPrecio(double precio) {
        return precio * 0.92; // Aplica 8% de descuento
    }

}
