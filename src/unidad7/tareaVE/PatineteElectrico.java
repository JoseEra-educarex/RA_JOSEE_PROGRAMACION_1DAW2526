package unidad7.tareaVE;

public class PatineteElectrico extends VehiculoElectrico{

	private int potenciaMotor;//vatios

	public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	@Override
	public void mostrarInformacion() {
		
		System.out.println("Patinete Electrico");
		System.out.print("Marca: "+marca+" - ");
		System.out.print("Modelo: "+modelo+" - ");
		System.out.print("Autonomia: "+autonomia+" - ");
		System.out.print("Potencia del motor: "+ potenciaMotor);
	}
	@Override
	public void cargar() {
		System.out.println("Cargando patinete eléctrico...");
	}

	
	
}
/*PatineteElectrico
o Atributos adicionales:
§ potenciaMotor (int, en vatios)
o Métodos:
§ Sobrescribe el método mostrarInformacion() para mostrar también la
potencia del motor.
§ Sobrescribe el método cargar() para imprimir “Cargando patinete
eléctrico...”.*/