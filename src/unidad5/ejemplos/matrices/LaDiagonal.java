package unidad5.ejemplos.matrices;

public class LaDiagonal {

	public static void main(String[] args) {
	
		/*La Diagonal
	Crea una matriz cuadrada de enteros de 5 x 5.
	
	Usa bucles anidados para rellenarla con ceros 0.
	Sin embargo, si la fila es igual a la columna (i == j), guarda un 1.
	Esto creará una línea diagonal de unos. Imprímela para comprobarlo.*/
	
	
		 int[][] matriz = new int[5][5];

	        for (int i = 0; i < matriz.length; i++) {

	            for (int j = 0; j < matriz[i].length; j++) {

	                if (i == j) {
	                    matriz[i][j] = 1;
	                } else {
	                    matriz[i][j] = 0;
	                }

	                System.out.print(matriz[i][j] + " ");
	            }

	            System.out.println();
	        }
	    }
	}
