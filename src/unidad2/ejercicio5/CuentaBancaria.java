package unidad2.ejercicio5;

public class CuentaBancaria {
	/*2. Implementa la clase CuentaBancaria con atributos iban y saldo.
	o Usa un constructor con parámetros para inicializar ambos.
	o Implementa un método mostrarInfo() que muestre la información.*/

String iban;
double saldo;


public CuentaBancaria(){
	this.iban="ES12 1234 1233 2133";
	this.saldo=350.50;
}
public CuentaBancaria(String i, double s) {
	iban= i;
	saldo=s;
}

public void MostrarInfo() {
	System.out.println("La cuenta con IBAN "+iban+" tiene de saldo "+saldo+" Euros");
}


}
