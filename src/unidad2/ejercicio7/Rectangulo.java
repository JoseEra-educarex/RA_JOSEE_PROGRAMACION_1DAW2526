package unidad2.ejercicio7;

public class Rectangulo {

	/*1. Crea la clase Rectangulo con atributos base y altura. Añade métodos:
	o calcularArea(): devuelve el área.
	o calcularPerimetro(): devuelve el perímetro.*/
	
	private double base;
	private double altura;
	
	public Rectangulo() {
		base=0;
		altura=0;
	}

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return 2*base*altura;
	}
	
}
