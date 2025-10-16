package unidad2.matematicas;

public class Matematicas {

	public static void main(String[] args) {
		
		
		
		// Potencia y raíz
		System.out.println(Math.pow(2, 3)); // 8.0 dos eleevado a tres
		System.out.println(Math.sqrt(25)); // 5.0 raiz cuadrada
		// Redondeo
		System.out.println(Math.round(2.3)); // 2 (long)
		System.out.println(Math.floor(2.9)); // 2.0 (double) suelo 
		System.out.println(Math.ceil(2.1)); // 3.0 (double)  techo
		// Máximo / mínimo / absoluto
		System.out.println(Math.max(3, 7)); // 7
		System.out.println(Math.min(3, 7)); // 3
		System.out.println(Math.abs(-5)); // 5
		// Trigonometría (radianes)
		System.out.println(Math.sin(Math.toRadians(30))); // 0.5
		// Logs y exponenciales
		System.out.println(Math.log(10)); // ln(10)
		System.out.println(Math.log10(100)); // 2.0
		System.out.println(Math.exp(1)); // e^1
		// Hipotenusa (Java 1.5+)
		System.out.println(Math.hypot(3, 4)); // 5.0
		// Raiz Cúbica
		System.out.println(Math.cbrt(27)); // 3.0
	

	}

}
