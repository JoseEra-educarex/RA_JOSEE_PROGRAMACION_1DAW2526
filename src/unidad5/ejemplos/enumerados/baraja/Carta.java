package unidad5.ejemplos.enumerados.baraja;

public class Carta {

	public int numero;
	
	public enum  Palos {
		CORAZONES,
		DIAMANTES,
		TREBOLES,
		PICAS
	}

	public Carta() {
		super();
		this.numero = (int)(Math.random()*13)+1;
	}

	public int getNumero() {
		return numero;
	}


	@Override
	public String toString() {
		

		
		return "Carta [numero=" + numero + "]";
	}
	
	
	
}
