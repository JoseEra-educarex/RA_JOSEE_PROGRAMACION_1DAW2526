package unidad5.ejemplos.arrayList.ejercicio6;

public class VideoJuegos implements Comparable{

	private String titulo; 
	private String plataforma;
	private int horasJugadas;
	
	
	public VideoJuegos(String titulo, String plataforma, int horasJugadas) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.horasJugadas = horasJugadas;
	}
	
	public VideoJuegos(String titulo) {
		super();
		this.titulo = titulo;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public int getHorasJugadas() {
		return horasJugadas;
	}


	public void setHorasJugadas(int horasJugadas) {
		this.horasJugadas = horasJugadas;
	}


	@Override
	public String toString() {
		return "VideoJuegos [titulo=" + titulo + ", plataforma=" + plataforma + ", horasJugadas=" + horasJugadas + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		
		VideoJuegos j= (VideoJuegos)o;
		
		return this.titulo.compareTo(j.getTitulo());
	}



	
	
	
}
