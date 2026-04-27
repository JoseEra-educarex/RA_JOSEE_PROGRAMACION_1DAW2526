package unidad6.ejercicios.ej6;

public class Comentario {
	
	private	String usuario;
	private String texto;
	
	
	public Comentario(String usuario, String texto) {
		super();
		this.usuario = usuario;
		this.texto = texto;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return "Comentario [usuario=" + usuario + ", texto=" + texto + "]";
	}
	
	
	
	
	
}
