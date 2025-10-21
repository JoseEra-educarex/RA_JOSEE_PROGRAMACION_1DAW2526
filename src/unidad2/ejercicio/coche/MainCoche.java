package unidad2.ejercicio.coche;

public class MainCoche {

	public static void main(String[] args) {
		
	Coche miCoche= new Coche("toyota",120);
	
	int aumento=10;
	
	miCoche.acelerar(aumento);
	miCoche.mostrarInfo();

	}

}
