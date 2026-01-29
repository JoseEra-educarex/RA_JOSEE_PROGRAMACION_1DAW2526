package unidad5.ejercicios;



public class LluviaVera {

	public static void main(String[] args) {
		/*La Lluvia en la Vera
Queremos registrar los litros de lluvia caídos durante una semana en Jarandilla de la Vera.

Declara e inicializa directamente (en una sola línea con {}) 
un array de double con 7 valores (ej: 12.5, 0.0, ...).
Imprime cuánto llovió el miércoles (suponiendo que el lunes es el índice 0).
Modifica el valor del viernes: ha habido una tormenta y ahora son 45.0 litros.*/

		double[] lluvias= {12.5, 0.0, 3.4, 5.2, 7.6, 0.6, 7.5};
		 
		String[] dias= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		for(int i=0;i<7;i++) {
			
			System.out.println(dias[i]+": "+lluvias[i]+" l");
	
			
		}
		System.out.println();
		System.out.println("_____Lluvia del viernes____");
		System.out.println("``````````````````````````");
		System.out.println(" `````````````````````````");
		lluvias[4]=45.0;
		

		for(int i=0;i<7;i++) {
			
			System.out.println(dias[i]+": "+lluvias[i]+" l");
	
			
		}
	}

	
	
	
}
