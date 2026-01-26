package unidad4.ejercicios.herencia.vehiculos;

public class MainVehiculos {

	public static void main(String[] args) {
		
		Coche c= new Coche();
		
		Bicicleta b= new Bicicleta();
		
		c.acelerar();
		b.acelerar();
		
		c.abrirCapota();
		
		b.activarModoElectrico();

	}

}
