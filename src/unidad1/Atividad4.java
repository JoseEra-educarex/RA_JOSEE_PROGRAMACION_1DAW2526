package unidad1;

public class Atividad4 {

	final static double IVA = 21;
	
	public static void main(String[] args) {
		
/*Crea un programa que guarde en variables el precio de un producto (float) y
  el IVA (21%).Calcula el precio total con IVA y muéstralo.
  
	Ejemplo de salida:
		Precio sin IVA: 100.0
		IVA: 21.0
		Precio con IVA: 121.0*/
		
		float precioProducto=100f;
		
		double precioFinal= precioProducto+precioProducto*IVA/100;
		
		
		System.out.println("Precio sin IVA = " + precioProducto + " Euros");
		System.out.println("IVA = " + IVA + "%");
		System.out.println("Precio con IVA = " + precioFinal + " Euros");
		
		
		
		
		
		
		
		
	}

}
