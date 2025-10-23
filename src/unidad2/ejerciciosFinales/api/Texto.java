package unidad2.ejerciciosFinales.api;

public class Texto {

	public static void main(String[] args) {
		/*Declara una variable texto = " Hola Java ";
		Muestra por pantalla:
		• Su longitud (length())
		• Sin espacios (trim())// elimina los espacios de los extremos
		• En mayúsculas (toUpperCase())
		• Si contiene la palabra "Java" (contains("Java"))*/
		
		
		String texto= " Hola Java ";
		
		
		System.out.println("El texto tiene una longitud de: "+texto.length()+" caracteres");
		System.out.println("EL texto sin espacios se leeria como "+texto.replace(" ",""));
		System.out.println("El texto en mayusculas es: "+texto.toUpperCase());
		System.out.println("El texto contiene la palabra Java "+ texto.contains("Java"));
	}

}
