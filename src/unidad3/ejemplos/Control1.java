package unidad3.ejemplos;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		/*Pide al usuario un número del 1 al 7 y
		 *  muestra el nombre del día de la semana con
			switch.*/
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero del 1 al 7:");
		
		num=entrada.nextInt();
		
		switch(num) {
		
		case 1: System.out.println("Lunes");
		break;
		
		case 2: System.out.println("Martes");
		break;
		
		case 3: System.out.println("Miercoles");
		break;
		
		case 4: System.out.println("Jueves");
		break;
		
		case 5: System.out.println("Viernes");
		break;
		
		case 6: System.out.println("Sabado");
		break;
		
		case 7: System.out.println("Domingo");
		break;
		
		
		
		}
		entrada.close();
	}

}
