package unidad5.ejercicios;

public class CazadoresMinMax {

	public static void main(String[] args) {
		/*Ejercicio 5: Cazadores de Mínimos y Máximos
Dado el siguiente array de precios de componentes de PC:

double[] precios = {450.0, 120.50, 78.0, 1200.0, 25.95, 300.0};
Escribe un algoritmo que recorra el array y descubra cuál es el precio más caro y cuál el más barato.
Imprime el resultado al final.
Pista: Necesitarás dos variables auxiliares (max y min) inicializadas con el primer valor del array.*/

		
		
		double[] precios = {450.0, 120.50, 78.0, 1200.0, 25.95, 300.0};
		
		
		double min=precios[0];
		double max=precios[0];
		
		for(int i=1; i<precios.length;i++) {
			
			if(min>precios[i]) min=precios[i];
			
			if (max<precios[i]) max= precios[i];
		}
		
		
		
		System.out.println("El Minimo es "+ min+" y el maximo es "+max);
	}

}
