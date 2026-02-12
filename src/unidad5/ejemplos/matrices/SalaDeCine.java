package unidad5.ejemplos.matrices;

public class SalaDeCine {

	public static void main(String[] args) {

		 // 1. Declaramos una sala de 3 filas y 4 butacas por fila
        int[][] sala = new int[3][4];

        // 2. Simulamos algunas reservas (Filas 0-2, Columnas 0-3)
        sala[0][0] = 1; // Ocupado: Fila 0, Butaca 0
        sala[1][2] = 1; // Ocupado: Fila 1, Butaca 2
        sala[2][3] = 1; // Ocupado: Última fila, última butaca

        // 3. Recorremos la matriz para "ver" la sala
        // El bucle externo 'i' controla las FILAS
        for (int i = 0; i < sala.length; i++) {
            System.out.print("Fila " + i + ": ");
            
            // El bucle interno 'j' controla las COLUMNAS (butacas) de esa fila
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print("[" + sala[i][j] + "] ");
            }
            
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}