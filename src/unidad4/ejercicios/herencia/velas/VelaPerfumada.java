package unidad4.ejercicios.herencia.velas;

public class VelaPerfumada extends Vela{

	private String aroma;

	public VelaPerfumada(String color,  String aroma) {
		
		super(color);
		
		this.aroma = aroma;
	}

	public String getAroma() {
		
		return aroma;
	}

	public void setAroma(String aroma) {
		
		this.aroma = aroma;
	}
	
	@Override
	public void setAltura(double altura) {
		
		this.altura=altura;
		this.precio=(altura*100)*3;
		
		}

	@Override
	public String toString() {
		return "VelaPerfumada [aroma=" + aroma + ", color=" + color + ", altura=" + altura + ", precio=" + precio + "]";
	}



	

}
