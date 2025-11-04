package unidad2.examen;

public class Descuento {

	public static double calcularPrecioConDescuento(double precio, double descuento) {
		
		double precioFinal= precio-(precio*descuento/100);
		
		return Math.round(precioFinal);
		
	}
	
}
