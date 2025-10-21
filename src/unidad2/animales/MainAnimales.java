package unidad2.animales;

public class MainAnimales {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro("Lua","Collie");
		Perro tuPerro = new Perro();
		
		tuPerro.setNombre("Pinky");
		tuPerro.setRaza("Doberman");
		
		
		miPerro.ladrar();
		tuPerro.ladrar();
	}

}
