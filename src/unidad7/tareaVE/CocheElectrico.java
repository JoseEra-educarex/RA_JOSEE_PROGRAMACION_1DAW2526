package unidad7.tareaVE;

public class CocheElectrico extends VehiculoElectrico{

	private int numeroPlazas;

	public CocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		this.numeroPlazas = numeroPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	
	@Override
	public void mostrarInformacion() {
		
		System.out.println("Mostrando caracteristicas del Vehiculo Electrico");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Autonomia: "+autonomia);
		System.out.println("Numero de plazas: "+ numeroPlazas);
	}
	
	@Override
	public void cargar() {
		System.out.println("Cargando coche eléctrico...");
	}
	
	
	
}
/*CocheElectrico
o Atributos adicionales:
§ numeroPlazas (int)
o Métodos:
§ Sobrescribe el método mostrarInformacion() para mostrar también el
número de plazas.
§ Sobrescribe el método cargar() para imprimir “Cargando coche
eléctrico...”.*/