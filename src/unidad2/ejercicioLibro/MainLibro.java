package unidad2.ejercicioLibro;

public class MainLibro {

	public static void main(String[] args) {
		Libro libro1=new Libro();
		Libro libro2=new Libro();
		
		
		libro1.setAutor("Cervantes");
		libro1.setTitulo("Don Quijote de la Mancha");
		
		libro1.mostrarInfo();
		
		libro2.setAutor("Shakespeare");
		libro2.setTitulo("Romeo y Julieta");
		
		libro2.mostrarInfo();
	}

}
