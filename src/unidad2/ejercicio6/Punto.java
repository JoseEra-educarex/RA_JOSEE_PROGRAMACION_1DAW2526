package unidad2.ejercicio6;


public class Punto {
	/*Crea la clase Punto con atributos x e y.
	o Añade un constructor por defecto que inicialice el punto en (0,0).
	o Añade otro constructor que reciba dos parámetros.
	o Escribe un programa que cree tres puntos diferentes y los muestre.*/

	int x;
	int y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	 
	public Punto(int a, int b) {
	
		x=a;
		y=b;
	}
	
	public void mostrarInfo() {
		System.out.println("Las coordenadas del punto son: ("+x+","+y+")");
	}
	
}
