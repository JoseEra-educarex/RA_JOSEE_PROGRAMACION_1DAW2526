package unidad2.ejercicio2;

public class MainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CuentaBancaria cliente1 = new CuentaBancaria();// el new llama al constructor


cliente1.setTitular("Pedro Perez");
cliente1.setSaldo(100.2031);
cliente1.ingresar();
cliente1.retirar();

	}

}
