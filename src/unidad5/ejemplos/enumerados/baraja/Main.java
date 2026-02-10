package unidad5.ejemplos.enumerados.baraja;

public class Main {

	public static void main(String[] args) {
		
	
		
	Carta cartaAleatoria= new Carta();
	
	
	int paloAleatorio= (int)(Math.random()*4)+1;
	
	switch(paloAleatorio) {
	case 1:
	System.out.println(	Palo.CORAZONES);
		
		break;
		
	case 2:
		System.out.println(	Palo.DIAMANTES);

		break;
		
	case 3:
		System.out.println(	Palo.PICAS);

		break;

	case 4:
		System.out.println(	Palo.TREBOLES);

		break;
	
	}
		
		System.out.println(cartaAleatoria);
		
		
	}

}
