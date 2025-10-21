package unidad2.animales;

public class Perro {
String nombre;
String raza;

public Perro() {
	nombre="Sin nombre";
	raza="Sin raza";
}

public Perro(String perro, String raza) {
	super();
	this.nombre = perro;
	this.raza = raza;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String perro) {
	this.nombre = perro;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public void ladrar() {
	System.out.println("El perro de nombre "+nombre+" de raza "+raza+" ladra: "+"Guau! Guau! Guau!");
}








}
