package unidad2.ejercicioLibro;

	/*Desarrolla una clase Libro con atributos titulo y autor, y un método
	mostrarInfo() que imprima los datos. Haz un programa que cree dos libros y
	muestre su información.*/

public class Libro {
	String titulo;
	String autor;
	
	
	public void setTitulo(String t) {
		titulo=t;

	}
	public void setAutor(String a) {
		autor=a;
	}

	public void mostrarInfo() {
		
		System.out.println("El titulo del libro es "+ titulo+ " del autor "+autor);
		
	}
	
}
