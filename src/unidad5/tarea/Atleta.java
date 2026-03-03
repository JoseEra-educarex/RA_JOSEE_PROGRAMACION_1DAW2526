package unidad5.tarea;
/**@author José E. Reyes Alcaide
 * LAB-102
 * 
 * 
 * Clase Atleta definida por los atributos nombre, pais y marca personal del atleta*/


public class Atleta {

	private String nombre;
	
	private String pais;
	
	private double marcaPersonal;
	
	
	

	public Atleta(String nombre, String pais, double marcaPersonal) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.marcaPersonal = marcaPersonal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getMarcaPersonal() {
		return marcaPersonal;
	}

	public void setMarcaPersonal(double marcaPersonal) {
		this.marcaPersonal = marcaPersonal;
	}

	@Override
	public String toString() {
		return "["+pais+"]"+" "+nombre+" - Marca "+marcaPersonal+"m";
	}
	//return "Atleta [nombre=" + nombre + ", pais=" + pais + ", marcaPersonal=" + marcaPersonal + "]";
	
	
	
	
	
	
}
