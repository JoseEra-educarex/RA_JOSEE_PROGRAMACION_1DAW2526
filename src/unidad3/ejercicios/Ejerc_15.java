package unidad3.ejercicios;

public class Ejerc_15 {

	public static void main(String[] args) {
		/*Suponga que la población de bovino de la provincia Cáceres es de 354000 
		 * y que la población aumenta 1.01 por ciento anualmente. Suponga que la 
		 * población de ovino de Badajoz es de 410000 y que la población se reduce 0,15
		 * por ciento anual. Escribir una aplicación que muestra las poblaciones de las
		 * dos provincias cada año hasta que la población de Cáceres exceda a la de
		 * los Badajoz, y muestre el número de años que se necesitó para superar.
			Guarde el archivo como PoblacionBovina.java.*/

		// Población inicial de bovino en Cáceres
        double poblacionCaceres = 354000;
        // Tasa de crecimiento anual para Cáceres (1.01%)
        final double TASA_CRECIMIENTO_CACERES = 0.0101;

        // Población inicial de ovino en Badajoz
        double poblacionBadajoz = 410000;
        // Tasa de reducción anual para Badajoz (0.15%)
        final double TASA_REDUCCION_BADAJOZ = 0.0015;

        int anios = 0;

        System.out.println("----------------- Evolución de las Poblaciones ----------------");
        System.out.println("Año 0: Población Cáceres = " + Math.round(poblacionCaceres) + " | Población Badajoz = " + Math.round(poblacionBadajoz));

        // Bucle while para simular el paso del tiempo hasta que la población de Cáceres supere a la de Badajoz
        while (poblacionCaceres <= poblacionBadajoz) {
            // Calcular nueva población de Cáceres
            poblacionCaceres += poblacionCaceres * TASA_CRECIMIENTO_CACERES;
            // Calcular nueva población de Badajoz
            poblacionBadajoz -= poblacionBadajoz * TASA_REDUCCION_BADAJOZ;
            
            anios++;
            System.out.println("Año " + anios + ": Población Cáceres = " + Math.round(poblacionCaceres) + " | Población Badajoz = " + Math.round(poblacionBadajoz));
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("La población de Cáceres (" + Math.round(poblacionCaceres) + ") superó a la de Badajoz (" + Math.round(poblacionBadajoz) + ") en " + anios + " años.");
    }
}
