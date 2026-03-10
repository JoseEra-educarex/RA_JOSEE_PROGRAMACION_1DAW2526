package unidad5.ejemplos.json.pedido;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

	
		
		Producto producto1= new Producto("pan",0.90);
		
		Producto producto2= new Producto("tomate", 0.85);
	
		Producto producto3= new Producto("pimiento",0.30);

		ArrayList<Producto> productos= new ArrayList<>();
		
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
			Pedido pedido1= new Pedido(035,productos);
			
			
		Gson serializacion= new Gson();	
			
		String nuevoPedido=serializacion.toJson(pedido1);
		
		
		System.out.println(nuevoPedido);
		
		
		
			
			
	}

}
