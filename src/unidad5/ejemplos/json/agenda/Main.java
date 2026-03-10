package unidad5.ejemplos.json.agenda;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {

		String jsonCreado= "{\"Nombre\":\"Antonio\",\"Telefono\":\"+34627829248\",[\"Calle\":\"Rio Miño\",\"Ciudad\": \"Navalmoral\",\"cp\": 10300]}";
		
		Gson deserializador= new Gson();

		
		
Contacto c1= deserializador.fromJson(jsonCreado, Contacto.class);


System.out.println(c1.getDireccion().getCiudad());
		
	}

	
	
	
}
