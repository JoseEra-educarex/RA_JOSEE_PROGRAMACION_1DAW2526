package unidad4.ejercicios.herencia.constructores;

public class Alumno extends Persona {

	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}



	
	
}
