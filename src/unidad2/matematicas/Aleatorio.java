package unidad2.matematicas;



public class Aleatorio {

	public static void main(String[] args) {
		// Math.random() devuelve double entre [0.0, 1.0) el uno no esta incluido maximo 0.99.
		
	    int min = 1;
        int max = 100;

        System.out.println("Generando 100 números aleatorios entre " + min + " y " + max + ":");

        for (int i = 0; i < 100; i++) {
            // Fórmula para generar un número aleatorio dentro de un rango [min, max]
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
        }
    }
}
