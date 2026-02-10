package unidad5.ejemplos.enumerados.semaforo;

public class Main {

	public static void main(String[] args) {
		
		estadoSemaforo();
	
		

	}

	public static void estadoSemaforo() {
		Semaforo color=Semaforo.VERDE;
		
		switch (color) {
		case ROJO :
			
			System.out.println("Semaforo en Rojo, No puede pasar");
			break;
			
		case AMARILLO :
			System.out.println("Semaforo en amarillo, Si puede frenar con seguridad debe parar");
			break;
			
		case VERDE :
			System.out.println("Semaforo en verde, Puede pasar ");
			break;
	}
	}

}
