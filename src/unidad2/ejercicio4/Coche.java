package unidad2.ejercicio4;

public class Coche {
	/*Crea una clase Coche con atributos marca y año. Define:
		o un constructor por defecto que asigne "Sin marca" y 2000.
		o un constructor con parámetros que inicialice ambos atributos.*/
	
	String marca;
	int anio;
	
	
	public Coche() { //Constructor por defecto

		this.marca = "Sin Marca";
		this.anio = 2000;
	}
	

	public Coche(String m, int a) { //Constructor inicializado

		marca = m;
		anio = a;
	}
	
	public void mostrarInfo() {
		System.out.println("EL coche " + marca+ " es del año "+ anio);
	}

}
