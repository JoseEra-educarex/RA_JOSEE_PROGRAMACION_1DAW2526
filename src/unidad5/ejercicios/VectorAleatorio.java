package unidad5.ejercicios;

public class VectorAleatorio {

	public static void main(String[] args) {
		/*El Vector Aleatorio
		 * 
Crea un programa que:

Genere un array de 10 enteros.
Lo rellene automáticamente con números aleatorios del 1 al 100 (Usa Math.random()).
Muestre todos los valores en una sola línea separados por guiones.*/

		
		int[] aleatorio=new int[10];
	
		for(int i =0; i<aleatorio.length;i++) {
			
			aleatorio[i]=(int)(Math.random()*100)+1;
			
			System.out.print(aleatorio[i]);
			
			if (i!=aleatorio.length-1)
				System.out.print("-");
		}
		
		
		
		
	}

	
	
	
}
