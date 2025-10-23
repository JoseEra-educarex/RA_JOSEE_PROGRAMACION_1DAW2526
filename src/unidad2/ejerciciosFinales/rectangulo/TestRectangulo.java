package unidad2.ejerciciosFinales.rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo salon = new Rectangulo();
		
		salon.setAltura(10);
		salon.setBase(20);
		
		double area=salon.calcularArea();
		
		System.out.println("El area del Rectangulo es "+area+"cm");
	}

}
