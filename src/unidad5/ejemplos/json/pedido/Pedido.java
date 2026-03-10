package unidad5.ejemplos.json.pedido;

import java.util.ArrayList;

public class Pedido {

	private int id;
	
	private ArrayList<Producto> productos;

	public Pedido(int id, ArrayList<Producto> productos) {
		super();
		this.id = id;
		this.productos = productos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
