package unidad6.ejercicios.ej9;

public class Cliente {

	private String dni;
	private String nombre;
	private int mesesPagados;
	
	public Cliente(String dni, String nombre, int mesesPagados) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.mesesPagados = mesesPagados;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMesesPagados() {
		return mesesPagados;
	}

	public void setMesesPagados(int mesesPagados) {
		this.mesesPagados = mesesPagados;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", mesesPagados=" + mesesPagados + "]";
	}
	
	
	
	
	
	
	
}
