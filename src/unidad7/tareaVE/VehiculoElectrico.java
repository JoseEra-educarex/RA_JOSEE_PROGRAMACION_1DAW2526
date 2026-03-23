package unidad7.tareaVE;

public class VehiculoElectrico {

	protected String marca;
	
	protected String modelo;
	
	protected int autonomia; //kilometros

	public VehiculoElectrico(String marca, String modelo, int autonomia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	
	public void mostrarInformacion() {
		
		System.out.println("Mostrando caracteristicas del Vehiculo Electrico");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Autonomia: "+autonomia);
	}
	public void cargar() {
		System.out.println("Cargando vehículo eléctrico...");
	}
}





/*VehiculoElectrico
o Atributos:
§ marca (String)
§ modelo (String)
§ autonomia (int, en km)
o Métodos:
§ Constructor que inicializa todos los atributos.
§ Método mostrarInformacion() que muestra los datos del vehículo.
§ Método cargar() que imprime “Cargando vehículo eléctrico...”.*/


