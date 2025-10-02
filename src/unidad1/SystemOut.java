package unidad1;

public class SystemOut {

	public static void main(String[] args) {
		/*  • System.out.print() → muestra un texto sin salto de línea.
			• System.out.println() → muestra un texto y añade un salto de línea.
			• System.out.printf() → muestra texto con formato.
			% [banderas] [ancho] [.precisión] carácter de conversión
			
			Banderas:
			▪ -: justificar a la izquierda (el valor predeterminado es justificar a la derecha)
			▪ +: genera un signo más (+) o menos (-) para un valor numérico
			▪ 0: fuerza que los valores numéricos se rellenen con ceros (el valor
			predeterminado es relleno en blanco)
			▪ , : separador de agrupación por coma (para números > 1000)
			▪ : el espacio mostrará un signo menos si el número es negativo o un espacio si
			es positivo
			
			Ancho:
			Especifica el ancho del campo para generar el argumento y representa el número
			mínimo de caracteres para escribirse en la salida. Incluya espacio para las comas
			esperadas y un punto decimal en la determinación de el ancho para valores numéricos.
			
			Precisión:
			Se utiliza para restringir la salida dependiendo de la conversión. Especifica el número
			de dígitos de precisión en valores de punto flotante o la longitud de una subcadena para
			extraer de una cadena.
			
			Caracteres de conversión:
			▪ d: entero [byte, corto, int, largo]
			▪ f : número de punto flotante [flotante, doble]
			▪ c: carácter Capital C pondrá la letra en mayúscula
			▪ s : String Capital S pondrá en mayúsculas todas las letras de la cadena
			▪ h: código hash. Un código hash es como una dirección. Esto es útil para
			imprimir una referencia.
			▪ n: nueva línea: use %n en lugar de \n para una mayor compatibilidad
			
			Ejemplos:
			*/
		
		 System.out.print("Hola ");
		 System.out.println("mundo");
		 System.out.printf("El número es: %d\n", 42);
		 
		 double dblTotal = 3.6;
		 int valorEntero= 9;
		 String valorCadena= "hola mundo";
		 
		 	System.out.printf("Total is: $%,.2f%n", dblTotal);
			System.out.printf("Total: %-10.2f: ", dblTotal);
			System.out.printf("%4d", valorEntero);
			System.out.printf("%20.10s\n", valorCadena);
			String s = "Hola clase";
			System.out.printf("La cadena es %s y su código has es %h%n", s, s);

	}

}
