package unidad3.ejemplos;

public class Ejercicio_3_7_2 {

	public static void main(String[] args) {
		// Imprime los números del 1 al 10, saltando los múltiplos de 3 con continue.

		
		for(int i=1;i<=10;i++) {
			
			if(i%3==0) {
				continue;
			}
			
			System.out.println(i);		
		}
		
	}

}
