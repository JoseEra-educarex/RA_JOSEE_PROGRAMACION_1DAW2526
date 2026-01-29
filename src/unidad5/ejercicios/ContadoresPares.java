package unidad5.ejercicios;

public class ContadoresPares {

	public static void main(String[] args) {
		
		/*Ejercicio 6: El Contador de Pares
			Crea un array con 20 números enteros (puedes ponerlos a mano o generarlos).
			
			Recórrelo y cuenta cuántos números son pares y cuántos son impares.
			Imprime las estadísticas finales. Ej: "Hay 12 pares y 8 impares".*/

		
		int[] aleatorio=new int[20];
		
		for(int i =0; i<aleatorio.length;i++) {
			
			aleatorio[i]=(int)(Math.random()*100)+1;
			
			System.out.print(aleatorio[i]);
			
			if (i!=aleatorio.length-1)
				System.out.print("-");
		}
		

	int contadorPares=0;
	int contadorImpares=0;
				
		for(int i =0; i<aleatorio.length;i++) {
			
		if(	aleatorio[i]%2 ==0) contadorPares++;
			else contadorImpares++;
			
		}
		System.out.println();
		System.out.println("El array de 20 números tiene " + contadorPares +
                " números pares y " + contadorImpares + " números impares");
		
	}

	
	
	
}
