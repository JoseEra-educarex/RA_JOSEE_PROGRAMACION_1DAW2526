package unidad1;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = 3.1416;
		
		double area;
		double radio;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cual es el radio de tu circunferencia?");
		
		radio= entrada.nextDouble();
		
		area= PI*radio*radio;
		
		System.out.println("Área de la circunferencia es igual a "+ area + " metros cuadrados");
		entrada.close();
		
	}

}
