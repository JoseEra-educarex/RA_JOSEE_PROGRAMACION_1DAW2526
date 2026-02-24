package unidad5.ejemplos.javaCollection;

import java.util.HashSet;
import java.util.Set;

public class BomboLoteria {

	public static void main(String[] args) {

		Set<Integer> loteria= new HashSet<>();
		
		
		while(loteria.size()<6) {
		
		int aleatorio= (int)(Math.random()*(49)+1);
		loteria.add(aleatorio);
				
		}
		
		for(Integer numero: loteria) {
			System.out.println(numero);
		}
		
		
		
	}

	
	
}
