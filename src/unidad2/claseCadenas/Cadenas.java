package unidad2.claseCadenas;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hola Java ";
		System.out.println(s.length()); // 11 (incluye espacios)
		System.out.println(s.trim()); // "Hola Java" (quita extremos)
		System.out.println(s.toUpperCase()); // " HOLA JAVA "
		System.out.println(s.toLowerCase()); // " hola java "
		System.out.println(s.charAt(2)); // 'l' (índice base 0)
		System.out.println(s.indexOf("Java")); // 7
		System.out.println(s.lastIndexOf('a')); // 9
		System.out.println(s.substring(2, 6)); // "la J" (beginIndex inclusive, endIndex exclusive)
		
		System.out.println(s.startsWith(" Ho")); // true
		System.out.println(s.endsWith("va ")); // true
		System.out.println(s.contains("Ja")); // true
		System.out.println(s.replace("Java","Mundo")); // " Hola Mundo "
		System.out.println(s.replaceAll("\\s+","A")); // usando regex -> " Hola Java "
		System.out.println(s.split("\\s+")[1]); // "Hola" ó "Java" dependiendo del split
		System.out.println("".isEmpty()); // true si longitud == 0
		System.out.println(" ".isBlank()); // true en Java 11+ (solo espacios)
	}

}
