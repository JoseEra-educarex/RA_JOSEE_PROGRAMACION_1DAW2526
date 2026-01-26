package unidad4.ejercicios.herencia.avanzado;

public class Cliente {

	private String nombre;
	private String direccion;
	private String dni;
	private int telefono;
	
	
	public Cliente(String nombre, String direccion, String dni, int telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", dni=" + dni + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	
}
