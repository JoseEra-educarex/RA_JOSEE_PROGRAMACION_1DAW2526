package unidad2.ejercicioRectangulo;

public class Rectangulo {
double base;
double altura;

public void setBase(double b) {
	base=b;

}
public void setAltura(double h) {
	altura=h;
}
public double calcularArea() {
	
	double area=(base*altura);
	
	return area;
	
	}

public void mostrarArea(double area) {
	
	System.out.println("El area del rectangulo es igual a "+area+ " cm2");
	
	}

}
