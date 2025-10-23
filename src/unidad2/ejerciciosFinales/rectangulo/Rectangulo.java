package unidad2.ejerciciosFinales.rectangulo;

public class Rectangulo {
	/*Crea una clase Rectangulo con atributos base y altura y un método calcularArea()
	que devuelva el área.
	En la clase TestRectangulo, crea un objeto, asigna valores y muestra el área.*/
	
	double base;
	double altura;
	
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
		double area=base*altura;
		return area;
	}

	
}
