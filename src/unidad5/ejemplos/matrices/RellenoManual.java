package unidad5.ejemplos.matrices;

public class RellenoManual {

	public static void main(String[] args) {
		/*Relleno Manual
	
	Crea una matriz de String de 2 x 2.
	
	Almacena manualmente 4 nombres de ciudades extremeñas: 
	
	"Mérida", "Badajoz", "Cáceres", "Plasencia".
	
	Imprime solo la ciudad que esté en la fila 1, columna 0.*/

		
		
		String[][]manual= new String [2][2];
		
		manual[0][0]="Merida";
		manual[0][1]="Badajoz";
		manual[1][0]="Cáceres";
		manual[1][1]="Plasencia";
		
		for(int i=0;i<manual.length;i++) {
			
		       System.out.print("Fila " + i + ": ");
			
			for(int j=0;j<manual[i].length;j++) {
				
			     System.out.print("[" + manual[i][j] + "] ");				
				
			}
			
            System.out.println(); // Salto de línea al terminar cada fila

		}
		
		
	}

	
	
	
}
