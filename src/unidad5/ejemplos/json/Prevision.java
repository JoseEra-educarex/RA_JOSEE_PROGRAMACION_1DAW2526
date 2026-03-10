package unidad5.ejemplos.json;

import java.util.ArrayList;

public class Prevision {

	private String ciudad;
	private double temperatura;
	private ArrayList <String> alertas;
	public Prevision(String ciudad, double temperatura, String[] alertas) {
		super();
		this.ciudad = ciudad;
		this.temperatura = temperatura;
		this.alertas = new ArrayList <>();
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public ArrayList<String> getAlertas() {
		return alertas;
	}
	public void setAlertas(ArrayList<String> alertas) {
		this.alertas = alertas;
	}


	
	
	
	
}
