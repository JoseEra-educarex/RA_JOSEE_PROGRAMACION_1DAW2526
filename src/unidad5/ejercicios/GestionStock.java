package unidad5.ejercicios;


public class GestionStock {

	public static void main(String[] args) {
		
		/*Ejercicio 7: Gestión de Stock de "Cerezas del Jerte S.L."
			
			Una cooperativa tiene almacenados los kilogramos de cerezas recogidos por 10 
			trabajadores en un día.
			
			int[] kilosRecogidos = {50, 35, 60, 40, 55, 30, 65, 20, 50, 45};
			Se te pide realizar un informe completo:
			
			Total: Muestra cuántos kilos se han recogido en total.
			Promedio: ¿Cuál es la media de kilos por trabajador?
			Bonus de Productividad: La empresa paga un bonus a quien recoja más de 55kg.
			 Muestra el índice (el número de trabajador) de aquellos que recibirán el bonus.
			Corrección de errores: El trabajador número 8 (índice 7) se ha quejado; 
			dice que se olvidaron de apuntar su última caja. 
			Súmale 10kg a su registro actual antes de hacer los cálculos.*/

		
		
		int[] kilosRecogidos = {50, 35, 60, 40, 55, 30, 65, 20, 50, 45};
		
		//Total: Muestra cuántos kilos se han recogido en total.
		//Promedio: ¿Cuál es la media de kilos por trabajador?
		int kilosTotales=0;
		
		for(int i=0; i<kilosRecogidos.length;i++) {
			
			kilosTotales+= kilosRecogidos[i];

		}
		System.out.println("Kilos Totales Recogidos: "+kilosTotales);
		
		double mediaKilos= kilosTotales/kilosRecogidos.length;
		
		System.out.println("Media de la recoleccion: "+ mediaKilos);
		
		//Bonus de Productividad: La empresa paga un bonus a quien recoja más de 55kg.
		//Muestra el índice (el número de trabajador) de aquellos que recibirán el bonus.
		
		int minBonus=55;
		
		for(int i=0; i<kilosRecogidos.length;i++) {
		
			if( kilosRecogidos[i]>minBonus) System.out.println("El trabajador "+ (i+1)+ " recibira el bonus");;

	}
		
		/*Corrección de errores: El trabajador número 8 (índice 7) se ha quejado; 
		dice que se olvidaron de apuntar su última caja. 
		Súmale 10kg a su registro actual antes de hacer los cálculos.*/

		
		
		
	}

	
	
	
	
	
}
