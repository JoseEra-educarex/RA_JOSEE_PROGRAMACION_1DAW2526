package unidad1;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 3;
		 // Operadores aritméticos
		 System.out.println("Suma: " + (a + b));
		 System.out.println("Resta: " + (a - b));
		 System.out.println("Multiplicación: " + (a * b));
		 System.out.println("División: " + (a / b));
		 System.out.println("Módulo: " + (a % b));
		 // Relacionales
		 System.out.println("¿a > b? " + (a > b));
		 System.out.println("¿a == b? " + (a == b));
		 // Lógicos
		 boolean x = true, y = false;
		 System.out.println("x && y = " + (x && y));
		 System.out.println("x || y = " + (x || y));
		 System.out.println("!x = " + (!x));
		 // Asignación y abreviación
		 int c = 5;
		 c += 2; // c = c + 2
		 System.out.println("c tras c+=2: " + c);
		 
		 int valor=2;
		 int resultado1= (valor++)*2;
		 System.out.println(valor);
		 int resultado2=(++valor)*2;
		 
		 System.out.println(resultado1);
		 System.out.println(resultado2);
		 
	}

}
