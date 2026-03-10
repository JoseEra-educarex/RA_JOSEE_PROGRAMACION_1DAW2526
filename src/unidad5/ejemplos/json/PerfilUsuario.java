package unidad5.ejemplos.json;

import com.google.gson.Gson;

import unidad1.SystemOut;

public class PerfilUsuario {

	public static void main(String[] args) {

		
		String jsonEntrada = "{\"nombre\":\"Luisa\",\"edad\":30,\"email\":\"luisa@mail.com\"}";
	
		Gson deserializador = new Gson();
	
		Usuario usuario1= deserializador.fromJson(jsonEntrada, Usuario.class);
	
	System.out.println("Nombre: "+usuario1.getNombre());
	System.out.println("Edad: "+usuario1.getEdad()+" Años");
	System.out.println("Correo: "+ usuario1.getCorreo());
	

	
	Usuario u2 = new Usuario("Pedro",30,"pedro@gmail.com");
	
	Gson serializador = new Gson();
	
	String jsonSalida= serializador.toJson(u2);
	
	System.out.println(jsonSalida);
	
	
	
	}
}
