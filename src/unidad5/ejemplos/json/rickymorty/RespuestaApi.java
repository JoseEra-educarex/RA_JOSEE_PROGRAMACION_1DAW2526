package unidad5.ejemplos.json.rickymorty;

import java.util.Arrays;

public class RespuestaApi {

	private Info info;
	
	private Personaje[] results;

	

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Personaje[] getResults() {
		return results;
	}

	public void setResults(Personaje[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "RespuestaApi [info=" + info + ", results=" + Arrays.toString(results) + "]";
	}
	
	
}
