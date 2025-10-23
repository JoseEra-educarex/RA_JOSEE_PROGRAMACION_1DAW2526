package unidad2.ejerciciosFinales.buenasPracticas;

public class Libro {
	
	/*Crea una clase Libro con atributos titulo y autor y un método mostrarInfo()
	 *  que
	muestre ambos datos.
	Usa nombres descriptivos y añade un pequeño comentario explicando cada método*/

	
	String titulo;
	String autor;
	
	
	public Libro() {
		
		titulo="Sin Titulo";
		autor="Sin autor";
				
	}
	

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void mostrarInfo() {
		System.out.println("El libro de titulo: "+titulo+", es del autor: "+ autor);
		
		
	}


	public static void main(String[] args) {
		
		Libro libro1= new Libro("La Celestina","Galdos");
		
		libro1.mostrarInfo();
	}

}
