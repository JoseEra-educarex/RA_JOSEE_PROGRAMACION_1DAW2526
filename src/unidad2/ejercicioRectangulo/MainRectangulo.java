package unidad2.ejercicioRectangulo;

import java.util.Scanner;

public class MainRectangulo {

	public static void main(String[] args) {
		/*Crea una clase Rectangulo con atributos base y altura, y un método que
	calcule el área. Escribe un programa de prueba que cree un objeto de esta clase y
	muestre el área.*/
		
		Scanner entrada= new Scanner(System.in);
		
		Rectangulo rectanguloSalon= new Rectangulo();
		
		System.out.println("¿cual es la altura del Salon?");
		
		rectanguloSalon.setAltura(entrada.nextDouble());
		
		System.out.println("¿cual es la base del Salon?");
		
		rectanguloSalon.setBase(entrada.nextDouble());
		
			entrada.close();



			double area= rectanguloSalon.calcularArea();
			rectanguloSalon.mostrarArea(area);
	}

}
