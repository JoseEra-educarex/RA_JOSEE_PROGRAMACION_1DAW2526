package unidad2.ejercicio1;

public class Perro {
/*Crea una clase Perro con los atributos nombre y raza, y un método ladrar() que
muestre por pantalla "Guau, guau".
Crea dos objetos Perro en el main y llama al método.*/
	String nombre;
	String raza;
	
	public void ladrar() {
		System.out.println("El perro "+nombre+" de raza "+raza+ " esta ladrando: "+ "Gaua! Guau!");
	}
		
	public void setNombre(String n) {
		nombre=n;

	}
	public void setRaza(String r) {
		raza=r;
	}
}
