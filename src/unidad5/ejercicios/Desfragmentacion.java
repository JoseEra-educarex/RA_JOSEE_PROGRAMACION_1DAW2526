package unidad5.ejercicios;

public class Desfragmentacion {

	/*Crea un método llamado compactarArray.

Dado un array con huecos dispersos: [5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0].
Debe mover todos los números válidos a la izquierda, eliminando los huecos intermedios.
Las posiciones sobrantes a la derecha deben rellenarse con -1.0.
Resultado esperado: [5.0, 8.5, 9.0, 4.0, -1.0, -1.0, -1.0].

💡 Pista: Necesitarás dos índices. Uno para recorrer (i) 
y otro para saber dónde colocar el siguiente número válido (indiceDestino).
La clave es no usar arrays auxiliares (para ahorrar memoria).
Algoritmo: "Tengo un puntero p en 0. Recorro con i. Si notas[i] es válido, 
lo copio en notas[p] e incremento p. Al final, relleno de -1 desde p hasta el final."*/
	
	public static void main(String[] args) {

	double[]array={5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0};
	
	compactarArray(array);	
	  
	for (int i = 0; i < array.length; i++) {
	
		System.out.print(array[i]);
		if (i!=array.length-1)
			System.out.print(", ");
		
		}
	
	
	
	
	}
	public static void compactarArray(double[] array) {
	    int indiceDestino = 0;

	    // Recorremos el array
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] != -1.0) {
	            array[indiceDestino] = array[i];
	            indiceDestino++;
	        }
	    }

	    // Rellenamos el resto con -1.0
	    for (int i = indiceDestino; i < array.length; i++) {
	        array[i] = -1.0;
	          
	    }
	
	}
	
	
	
}
