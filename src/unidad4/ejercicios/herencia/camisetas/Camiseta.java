package unidad4.ejercicios.herencia.camisetas;

public class Camiseta {
//número de pedido, tamaño, color y precio
	
	protected int numeroPedido;
	protected String tamaño;
	protected String color;
	protected double precio;
	protected int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
		// El precio está determinado por el tamaño: 22.99€ para XXL o XXXL, y 9.99€ para todos los demás tamaños.
	 if((tamaño=="XXXL")||(tamaño=="XXL")) {
		 this.precio =22.99;
	}else {
		this.precio =9.99;
	}
	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "Camiseta [numeroPedido=" + numeroPedido + ", tamaño=" + tamaño + ", color=" + color + ", precio="
				+ precio + "]";
	}
	
	
	
	
}
