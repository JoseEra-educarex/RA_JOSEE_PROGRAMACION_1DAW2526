package unidad2.examen;

public class Libreria {

	private String nombre;
	private Libro libroDestacado;
	
	public Libreria(String nombre, Libro libroDestacado) {
	
		this.nombre = nombre;
		this.libroDestacado = libroDestacado;
	}
	
	public void mostrarLibreria() {
		System.out.println("La liberia se llama "+nombre);
		libroDestacado.mostrarInfo();
		
	}
	
	
	
}
