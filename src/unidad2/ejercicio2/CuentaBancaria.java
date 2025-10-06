package unidad2.ejercicio2;

import java.util.Scanner;

public class CuentaBancaria {
	
	/*Crea una clase CuentaBancaria con atributos titular y saldo.
	Implementa los métodos ingresar(double) y retirar(double).
	Prueba a ingresar y retirar dinero desde el main*/
Scanner entrada= new Scanner(System.in);
	String titular;
	double saldo;
	
	//Constructor
	
	public CuentaBancaria() {
		titular="";
		saldo=0;
	}
	
	
	public void setTitular(String t) {
		titular=t;
		System.out.println("Bienvenido "+ titular);

	}
	public void setSaldo(double s) {
		saldo=s;
		System.out.println("Su saldo inicial es de "+ saldo+ " Euros");
	}
	
	public double ingresar() {
		System.out.println("¿Qué cantidad desea ingresar?");
		double ingreso=entrada.nextDouble();
		
		saldo= saldo+ingreso;
		
		System.out.println("su saldo actual es de "+ saldo + " Euros");

		return saldo ;
	}
	
	public double retirar() {
		System.out.println("¿Qué cantidad desea retirar?");
		double retiro=entrada.nextDouble();
		
		saldo=saldo-retiro;
		
		System.out.println("su saldo actual es de "+ saldo+ " Euros");
		return saldo ;
	}
	

}
