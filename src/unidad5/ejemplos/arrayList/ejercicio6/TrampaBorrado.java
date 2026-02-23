package unidad5.ejemplos.arrayList.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class TrampaBorrado {

	public static void main(String[] args) {

		
		List<Integer> valores= new ArrayList<>();
		
		
		valores.add(10);
		valores.add(20);
		valores.add(15);
		valores.add(30);
		valores.add(45);
		valores.add(12);
	
		
		for(Integer numero:valores) {
			System.out.println(numero);
		}
		
		
		// no hace falta for
		
		valores.removeIf(n -> n < 20 );
		
	
	System.out.println("-----------valores despues del borrado-----------");	
		
		for(Integer numero:valores) {
			System.out.println(numero);
		}
	

	for(int i=valores.size()-1; i<=0; i--) {
		if(valores.get(i)<20) {
			valores.remove(i);
		}
	
		}
	}
}