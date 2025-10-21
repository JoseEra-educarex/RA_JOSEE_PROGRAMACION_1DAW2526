package unidad2.ejercicio7;

public class MainREctangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rectangulo1= new Rectangulo(5,5);
		Rectangulo rectangulo2=new Rectangulo();
		rectangulo2.setAltura(5.4);
		rectangulo2.setBase(3.4);
		
	System.out.println("El area del rectangulo 1 es: "+ rectangulo1.calcularArea());
	System.out.println("El perimetro del rectangulo 1 es: "+ rectangulo1.calcularPerimetro());
	System.out.println("El area del rectangulo 2 es: "+ rectangulo2.calcularArea());
	System.out.println("El perimetro del rectangulo 2 es: "+ rectangulo2.calcularPerimetro());	
	}
}