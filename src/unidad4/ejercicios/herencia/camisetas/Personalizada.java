package unidad4.ejercicios.herencia.camisetas;

public class Personalizada extends Camiseta {

	private String eslogan;

	public String getEslogan() {
		return eslogan;
	}

	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}

	@Override
	public String toString() {
		return "Personlizada [eslogan=" + eslogan + ", numeroPedido=" + numeroPedido + ", tamaño=" + tamaño + ", color="
				+ color + ", precio=" + precio + "]";
	}
	
	
	
}
