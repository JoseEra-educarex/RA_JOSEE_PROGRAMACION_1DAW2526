package unidad2.ejercicio5;

public class MainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria miCuenta = new CuentaBancaria();
		
		CuentaBancaria miCuentaSantander = new CuentaBancaria("ES55 4564 1323 1213", 900.50);
		
		miCuenta.MostrarInfo();
		miCuentaSantander.MostrarInfo();
		
	}

}
