package unidad6.ejercicios.ej7;

public class Usuario {

	private int id; 
	private String email; 
	private boolean activo;
	
	
	public Usuario(int id, String email, boolean activo) {
		super();
		this.id = id;
		this.email = email;
		this.activo = activo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	 @Override
	    public String toString() {
	        String estado = activo ? "ACTIVO" : "INACTIVO";
	        return "[" + id + "] - " + email + " - Estado: " + estado;
	    }
	
	
}
