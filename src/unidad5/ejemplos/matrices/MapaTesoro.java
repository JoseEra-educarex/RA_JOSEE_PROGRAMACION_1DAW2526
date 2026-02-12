package unidad5.ejemplos.matrices;

import java.util.Scanner;

public class MapaTesoro {

	public static void main(String[] args) {
		
		
	/*El Mapa del Tesoro
		Crea una matriz de 4 x 4 de tipo char rellena inicialmente con 'X' (tierra).
			
		Esconde un tesoro ('O') en una posición aleatoria (usa Math.random).
		Pide al usuario que introduzca coordenadas (fila y columna).
		Si acierta, dile "¡Has encontrado el tesoro!". Si falla, dile "Solo hay tierra".*/
		
		
		 Scanner sc = new Scanner(System.in);

	        // 1. Crear matriz 4x4 rellena con 'X'
	        char[][] mapa = new char[4][4];

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                mapa[i][j] = 'X';
	            }
	        }

	        // 2. Esconder el tesoro en posición aleatoria
	        int filaTesoro = (int)(Math.random() * 4);
	        int columnaTesoro = (int)(Math.random() * 4);

	        mapa[filaTesoro][columnaTesoro] = 'O';

	        // 3. Pedir coordenadas al usuario
	        System.out.print("Introduce la fila (0-3): ");
	        int filaUsuario = sc.nextInt();

	        System.out.print("Introduce la columna (0-3): ");
	        int columnaUsuario = sc.nextInt();

	        // 4. Comprobar si acierta
	        if (mapa[filaUsuario][columnaUsuario] == 'O') {
	            System.out.println("¡Has encontrado el tesoro!");
	        } else {
	            System.out.println("Solo hay tierra");
	        }

	        sc.close();
	    }
	}