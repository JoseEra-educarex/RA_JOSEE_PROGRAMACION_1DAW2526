package unidad7.tareaVE;

public class BicicletaElectrica extends VehiculoElectrico{

	

	private boolean tienePedales;

	public BicicletaElectrica(String marca, String modelo, int autonomia, boolean tienePedales) {
		super(marca, modelo, autonomia);
		this.tienePedales = tienePedales;
	}

	public boolean isTienePedales() {
		return tienePedales;
	}

	public void setTienePedales(boolean tienePedales) {
		this.tienePedales = tienePedales;
	}
	
	@Override
	public void mostrarInformacion() {
		
		System.out.println("Mostrando caracteristicas del Vehiculo Electrico");
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Autonomia: "+autonomia);
		if (tienePedales==true)System.out.println("Bicicleta Electrica con Pedales");
		else System.out.println("Bicicleta Electrica sin pedales");
	}
	@Override
	public void cargar() {
		System.out.println("Cargando bicicleta eléctrica...");
	}
	
	
}
/*BicicletaElectrica
o Atributos adicionales:
§ tienePedales (boolean)
o Métodos:
§ Sobrescribe el método mostrarInformacion() para mostrar también si tiene
pedales.
§ Sobrescribe el método cargar() para imprimir “Cargando bicicleta
eléctrica...”.*/