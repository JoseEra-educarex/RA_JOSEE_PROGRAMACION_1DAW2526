package unidad1;

public class Conversiones {

	public static void main(String[] args) {
		/*Existen dos formas de conversión en Java:
			1. Conversión implícita (widening o promoción automática):
			Ocurre cuando un tipo más pequeño se convierte automáticamente en un tipo
			más grande sin pérdida de información.
			Ejemplo: de int a double.
			2. Conversión explícita (narrowing o cast):
			Ocurre cuando convertimos manualmente un tipo más grande a uno más
			pequeño. Puede haber pérdida de precisión o truncamiento.
			Ejemplo: de double a int.
				• Conversión implícita: posible de izquierda a derecha.
				• Conversión explícita: necesaria de derecha a izquierda.
			*/
		
		int x = 10;
		double y = x; // Conversión automática int → double
		System.out.println(y); // 10.0
		
		double a = 9.99;
		int b = (int) a; // Conversión explícita
		System.out.println(b); // Resultado: 9

		char letra = 'A';
		int codigo = letra; // Conversión implícita char → int
		System.out.println(codigo); // 65
		
		
		int codigo2 = 66;
		char letra2 = (char) codigo2; // Conversión explícita int → char
		System.out.println(letra2); // 'B'
		
		int z = 5;
		double w = 2.5;
		double c = z + w; // a se convierte en double automáticamente
		System.out.println(c); // 7.5
		
	}

}
