package unidad5.ejemplos.json;

public class Prevision {

	private String ciudad;
	private double temperatura;
	private String alertas[];
	public Prevision(String ciudad, double temperatura, String[] alertas) {
		super();
		this.ciudad = ciudad;
		this.temperatura = temperatura;
		this.alertas = alertas;
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
	public String[] getAlertas() {
		return alertas;
	}
	public void setAlertas(String[] alertas) {
		this.alertas = alertas;
	}

	
	
	
	
}
