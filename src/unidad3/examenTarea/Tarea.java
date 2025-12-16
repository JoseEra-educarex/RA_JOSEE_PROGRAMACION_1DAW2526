package unidad3.examenTarea;

public class Tarea {

	private String nombre;
	private int prioridad;
	private String categoria;
	private double duracionHoras;
	
	
	
	
	public Tarea(String nombre, String categoria) {
		super();
		this.nombre = nombre;
		this.prioridad = (int)(Math.random()*(20-10+1)+10);
		this.categoria = categoria;
		this.duracionHoras = 0;
	}



//getters
	public String getNombre() {
		return nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public double getHoras() {
		return duracionHoras;
	}


//setter

	public void setHoras(double horas) {
		this.duracionHoras = horas;
	}
	
	
	public void mostrarTarea() {
		System.out.println("-----Tarea------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Prioridad: "+prioridad);
		System.out.println("Categoria: "+categoria);
		System.out.println("Duracion: "+duracionHoras);
		System.out.println("_________________");
	}
	
	
	
	
	
}
