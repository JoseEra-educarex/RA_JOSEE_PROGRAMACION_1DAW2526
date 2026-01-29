package unidad5.ejemplos;

public class Busqueda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] idsAprobados = {12, 89, 45, 23, 102, 7};
		int idBuscado = 45;

		boolean encontrado = false;
		int posicion = 0;

		for (int i = 0; i < idsAprobados.length; i++) {
		    if (idsAprobados[i] == idBuscado) {
		        encontrado = true;
		        posicion = i;
		        break;
		    }
		}

		if (encontrado) {
		    System.out.println("El alumno " + idBuscado + 
		        " está aprobado en la posición " + posicion);
		} else {
		    System.out.println("El alumno " + idBuscado + " ha suspendido.");
		}
	}

}
