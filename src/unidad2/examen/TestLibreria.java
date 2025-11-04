package unidad2.examen;

import java.util.Scanner;

public class TestLibreria {

	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner(System.in);
		
		String titulo,autor,comentario;
		double precio,descuento;
		
		
		System.out.println("Introduce el titulo del libro: ");
		
		titulo=entrada.nextLine();
		
		System.out.println("Introduce el autor del libro: ");
		
		autor=entrada.nextLine();
		
		System.out.println("Introduce el comentario del libro: ");
		
		comentario=entrada.nextLine();
		
		System.out.println("Introduce el precio del libro: ");
		
		precio=entrada.nextDouble();
		
		System.out.println("Introduce el descuento del libro: ");
		
		descuento=entrada.nextDouble();
		
		
		Libro miLibro =new Libro(titulo,autor,precio,comentario);
		
		
		miLibro.procesarComentario();
		double precioFinal= Descuento.calcularPrecioConDescuento(precio, descuento);
		
		
		Libreria miLibreria= new Libreria("Lecturas Java",miLibro);
		
		miLibreria.mostrarLibreria();
		System.out.println("El precio final con descuento es "+precioFinal);
		
		
		
	}

}
