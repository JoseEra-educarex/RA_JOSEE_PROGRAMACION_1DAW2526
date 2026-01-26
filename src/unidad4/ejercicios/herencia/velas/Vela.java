package unidad4.ejercicios.herencia.velas;

public class Vela {
//color, altura y precio.
	
	protected String color;
	protected double altura;// Se almacena la altura en metros
	protected double precio;
	
	
	public Vela(String color) {
		
		this.color = color;
		
	}

//getters 
	public String getColor() {
		return color;
	}


	public double getAltura() {
		return altura;
	}


	public double getPrecio() {
		return precio;
	}

	//Setters 

	public void setColor(String color) {
		this.color = color;
	}


	public void setAltura(double altura) {
		this.altura = altura;
		this.precio = (altura*100)*2;// se almacena al altura en metros  
	}

	@Override
	public String toString() {
		return "Vela [color=" + color + ", altura=" + altura + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
