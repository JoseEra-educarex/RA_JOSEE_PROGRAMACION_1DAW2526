package unidad3.ejercicios;

public class Ejerc_15_2 {

	public static void main(String[] args) {
		// Población inicial de bovino en Cáceres
        double poblacionCaceres = 354000;
        // Tasa de crecimiento anual para Cáceres (1.01%)
        final double TASA_CRECIMIENTO_CACERES = 0.0101;

        // Población inicial de ovino en Badajoz
        double poblacionBadajoz = 410000;
        // Tasa de reducción anual para Badajoz (0.15%)
        final double TASA_REDUCCION_BADAJOZ = 0.0015;

        int anios = 0;

        System.out.println("----------- Evolución de las Poblaciones -----------");
        System.out.println("Año: 0 | Población Cáceres  | Población Badajoz ");

        
        while(poblacionCaceres<=poblacionBadajoz) {
        	
        poblacionCaceres+=poblacionCaceres*TASA_CRECIMIENTO_CACERES;
        poblacionBadajoz-=poblacionBadajoz*TASA_REDUCCION_BADAJOZ;
        
        anios++;
        
        System.out.println("Año: "+anios+" | "+poblacionCaceres+" | "+poblacionBadajoz);
        }
        
        System.out.println("La población de Cáceres superó a la de Badajoz en " + anios + " años.");

        
        
	}

}
