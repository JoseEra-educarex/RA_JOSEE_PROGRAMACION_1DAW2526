package unidad5.ejemplos;

public class Ej2 {

	
	static final int INDICE=5;
	
	public static void main(String[] args) {
		/*El Inversor de Nombres
Escribe un programa que tenga un array con 5 nombres de compañeros de clase 
(puedes ponerlos directamente en el código).

El programa debe mostrar los nombres en el orden en que fueron introducidos.
Luego, debe mostrarlos en orden inverso (del último al primero).
Pista: usa un bucle for que empiece en length - 1 y vaya restando.*/

		
		String[] nombres= new String[INDICE];
		
		nombres[0]="Pedro";
		nombres[1]="Juan";
		nombres[2]="Jose";
		nombres[3]="Angel";
		nombres[4]="Miguel";
		System.out.println("________________________________________");
		System.out.println("Nombres impresos en orden de insercion:");
		System.out.println("----------------------------------------");
		for(int i =0; i<INDICE;i++) {
			
			System.out.println((i+1)+" "+nombres[i]);
			
		}
		System.out.println("_______________________________________________");
		System.out.println("Nombres impresos en orden inverso de insercion:");
		System.out.println("-----------------------------------------------");
		for(int i =INDICE-1; i>=0;i--) {
			
			System.out.println((i+1)+" "+nombres[i]);
			
		}
		
	}

	
	
	
	
}
