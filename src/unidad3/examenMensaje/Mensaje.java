package unidad3.examenMensaje;

public class Mensaje {

	private String autor;
	private String contenido;
	private int longitud;
	private int palabras;
	public Mensaje(String autor, String contenido) {
		super();
		this.autor = autor;
		this.contenido = contenido;
		this.longitud = calcularLongitud(contenido);
		this.palabras = calcularPalabras(contenido);
	}
	
	
	
	
	
	
	
	public String getAutor() {
		return autor;
	}







	public void setAutor(String autor) {
		this.autor = autor;
	}







	public String getContenido() {
		return contenido;
	}







	public void setContenido(String contenido) {
		this.contenido = contenido;
	}







	public int getLongitud() {
		return longitud;
	}







	







	public int getPalabras() {
		return palabras;
	}







	



	public void cambiarContenido(String nuevocontenido) {
		this.contenido = nuevocontenido;
		this.longitud=calcularLongitud(nuevocontenido);
		this.palabras=calcularPalabras(nuevocontenido);
	}




	public int calcularPalabras(String contenido) {
		
		int palabras=0;
		int contador=0;
		for(int i=0;i<contenido.length();i++) {
			if(contenido.trim().charAt(i)==' ') {
				contador++;
			}
			palabras=1+contador;
		}
		
	
		return palabras;
	}
	public int calcularLongitud(String contenido) {
	
		int longitud=0;
		for(int i=0;i<contenido.length();i++) {
			if(contenido.trim().charAt(i)!=' ') {
				longitud++;
			}
		}
		
		return longitud;
	}
	
	
	public void mostrarMensaje() {
		
		System.out.println("-------Mensaje-------");
		System.out.println("Autor: "+autor);
		System.out.println("Contenido: "+contenido);
		System.out.println("Número de caracteres: "+longitud);
		System.out.println("Numero de palabras: "+palabras);
		System.out.println("______________________");
	}
	
	
	
	
	
}
