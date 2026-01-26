package unidad4.ejercicios.herencia.vehiculos;

public class Vehiculos {

	protected int velocidad;
	
	
	public int acelerar() {
		
		velocidad++;
		
		return velocidad;
		
	}
	public void frenar() {
		System.out.println("disminuyendo velocidad");
		velocidad--;
		
		
	}
	
}
