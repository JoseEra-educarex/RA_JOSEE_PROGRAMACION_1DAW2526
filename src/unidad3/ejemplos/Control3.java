package unidad3.ejemplos;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		/*Crea un programa que pida la nota de un alumno (0 a 10) y muestre:
			• “Suspenso” si < 5
			• “Aprobado” si 5–6
			• “Notable” si 7–8
			• “Sobresaliente” si 9–10*/
		
		int nota;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca la nota de su examen: ");
		
		nota=entrada.nextInt();
		
		if(nota<5) {
			System.out.println("El examen esta suspenso");
			
		} else if(nota>=5&&nota<=6) {
			System.out.println("El examen esta aprobado");

		}else if (nota>=7&&nota<=8) {
			System.out.println("el examen tiene un notable");

		}else if(nota>=9&&nota<=10) {
			System.out.println("el examen tiene un sobresaliente");
		} 
		
		
		entrada.close();
	}


	}


