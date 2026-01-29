package unidad5.ejercicios;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		
		/*Ejercicio 4: La Nota Media del Ciclo
Pide al usuario (usando Scanner) que introduzca sus notas de los 5 módulos del curso.

Guárdalas en un array double[] notas.
Usa un bucle para recorrer el array y sumar todas las notas.
Calcula la media y muéstrala.
Extra: Si la media es menor a 5, imprime "Toca estudiar más en la recuperación".*/

		Scanner entrada = new Scanner (System.in);
		
		double[] notas = new double [5];
		
		System.out.println("Introduzca la nota de cada Modulo del Curso:");
		System.out.println("____________________________________________");
		
		
		for(int i=0;i<notas.length;i++) {

			System.out.println("Nota del Modulo "+ (i+1)+":");
			notas[i]=entrada.nextDouble();
			
		}
		
		
		System.out.println("___________________________________________");
		System.out.println("Las notas para cada Modulo del Curso son:");
		System.out.println("___________________________________________");
		
		
		for(int i=0;i<notas.length;i++) {

			System.out.println("Nota del Modulo "+ (i+1)+": "+notas[i]);
		
		}
		
		
		
		
		double sumaTotal =0;
		
		for(int i=0;i<notas.length;i++) {

			 sumaTotal +=  notas[i];
			
			
		
		}
		System.out.println("___________________________________________");
		System.out.println("La Suma de las notas de cada Modulo del Curso es: "+sumaTotal);
		System.out.println("___________________________________________");	
		
		
		double mediaCurso= sumaTotal/notas.length;
		
		
		System.out.println("___________________________________________");
		System.out.println("La Media de las notas de cada Modulo del Curso calculada es: "+mediaCurso);
		System.out.println("___________________________________________");	
		
		
	if(mediaCurso<5) 		System.out.println("Tienes que estudiar más");
	else 					System.out.println("Excelente! Has aprobado");
	
		
	
	
	entrada.close();
	}

	
	
	
	
	
}
