package unidad2.ejercicio8;



public class MainEmpleado {

	public static void main(String[] args) {

		Empleado admin = new Empleado("Pedro Ayala",1500,1);
	
		double aumento = admin.aumentarSalario();
		
	
		admin.mostrarInfo(aumento);
	}

}
