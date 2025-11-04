package unidad2.examen;

public class Libro {

	private String titulo;
	private String autor;
	private double precio;
	private String comentario;
	private int isbn;
	
	
	
	public Libro(String titulo, String autor, double precio, String comentario) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.comentario = comentario;
		isbn = (int)(Math.random()*999999-100000+1)+100000;;
	}
	
	public Libro() {
		
		this.titulo = "Sin titulo";
		this.autor = "anonimo";
		this.precio = 0.0;
		this.comentario = "Sin comentario";
		this.isbn = (int)(Math.random()*999999-100000+1)+100000;
	}
	
	public void procesarComentario() {
		comentario=comentario.trim();
		System.out.println(comentario.length());
		comentario=comentario.toUpperCase();
		
	}
	
	public void mostrarInfo(){
		System.out.println("El titulo es "+titulo);
		System.out.println("El autor es "+autor);
		System.out.println("Su precio es "+precio);
		System.out.println("El comentario es "+ comentario);
		System.out.println("El ISBN generado aleatoriamente es "+ isbn);
		
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getIsbn() {
		return isbn;
	}

	
	
	
	
}
