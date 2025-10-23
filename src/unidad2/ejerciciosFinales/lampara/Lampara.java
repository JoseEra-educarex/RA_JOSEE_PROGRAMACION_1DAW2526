package unidad2.ejerciciosFinales.lampara;

public class Lampara {

	
	/*Crea una clase Lampara con:
		• Atributo: boolean encendida
		• Métodos:
		o encender() → pone el atributo en true y muestra “Lámpara
		encendida”.
		o apagar() → pone el atributo en false y muestra “Lámpara apagada”.
		Prueba ambos métodos desde el main.*/
	
	
	boolean encendido;
	
	public Lampara() {
		encendido=false;//apagado
	}

	public Lampara(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void apagar() {
		encendido= false;
		
		System.out.println("La lampara esta apagada");
	}
	
	public void encender() {
		encendido= true;
		System.out.println("La lampara esta encendida");
	}
	
	
	
}
