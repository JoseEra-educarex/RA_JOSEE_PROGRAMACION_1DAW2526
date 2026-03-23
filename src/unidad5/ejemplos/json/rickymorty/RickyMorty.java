package unidad5.ejemplos.json.rickymorty;

import com.google.gson.Gson;

public class RickyMorty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String  respuestaApi="{\"info\":{\"count\": 826,\"pages\": 42},\"results\":[{\"id\":1,\"name\":\"Rick Sanchez\",\"status\": \"Alive\",\"origin\": {\"name\": \"Earth\",\"url\": \"https://...\"}},{\"id\": 2,\"name\": \"Morty Smith\",\"status\": \"Alive\",\"origin\":\"name\": \"Earth\",\"url\": \"https://...\"}}]}";	
		
		
	RespuestaApi resApi= new RespuestaApi();

	
	Gson serializacion= new Gson();
	
	serializacion.fromJson(respuestaApi, RespuestaApi.class);
	
	
	System.out.println(resApi.getInfo());
	
	
	
	}
}