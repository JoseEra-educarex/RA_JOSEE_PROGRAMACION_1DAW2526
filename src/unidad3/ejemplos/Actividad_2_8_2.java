package unidad3.ejemplos;

public class Actividad_2_8_2 {

	public static void main(String[] args) {
		// Calcula el factorial de un número usando un for.
		
		// El número del cual queremos calcular el factorial (puedes cambiarlo)
        int numero = 5; 
        long factorial = 1;

        // Comprobamos si el número es negativo
        if (numero < 0) {
            System.out.println("El factorial de un número negativo no existe.");
        } else {
            // Bucle for desde 1 hasta el número dado
            for (int i = 1; i <= numero; i++) {
                factorial *= i; // Multiplica el factorial acumulado por el contador actual
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
		
	}

}
