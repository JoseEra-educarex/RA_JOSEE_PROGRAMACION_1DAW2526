package unidad2.ejercicio.coche;

public class Coche {
	
	
	/*Ejercicio 1.2 — Estado y comportamiento
		Crea una clase Coche con:
		• Atributos: marca y velocidad.
		• Métodos:
		o acelerar(int cantidad) → aumenta la velocidad.
		o mostrarVelocidad() → muestra la velocidad actual.
		Crea un objeto, asígnale valores, y llama a los métodos*/
	
	private String marca;
	private int velocidad;
	
	public Coche() {
		marca="sin marca";
		velocidad=120;
	}
	
	public Coche(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar(int cantidad) {
		
		velocidad=velocidad+cantidad;
		
	} 
	
	public void mostrarInfo() {
		
		System.out.println("El coche "+ marca+ " corre a "+ velocidad);
	}
	
	
}
