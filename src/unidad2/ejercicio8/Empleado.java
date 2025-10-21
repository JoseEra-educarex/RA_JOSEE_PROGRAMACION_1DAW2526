package unidad2.ejercicio8;

public class Empleado {
		/*2. Crea la clase Empleado con atributos nombre y salario.
		o Añade un método aumentarSalario(double porcentaje).
		o Añade un método mostrarInfo() que imprima nombre y salario*/
	
	private String nombre;
	private double salario;
	private double porcentaje;
	
	public Empleado() {
		nombre="  ";
		salario=0;
		porcentaje=0;
	}
	
	public Empleado(String nombre, double salario, double porcentaje) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.porcentaje = porcentaje;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public double aumentarSalario() {
		
		double aumento= salario*porcentaje/100 ;
		
		return aumento;
	}
	
	public void mostrarInfo(double aumento) {
		
		
		System.out.println("la nomina del empleado "+ nombre +" tiene un salario "+ salario +" Euros"
				+" y un aumento anual de: "+ aumento+ " Euros");
	}


}
