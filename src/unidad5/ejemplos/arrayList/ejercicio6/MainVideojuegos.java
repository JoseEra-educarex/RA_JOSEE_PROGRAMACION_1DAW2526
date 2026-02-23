package unidad5.ejemplos.arrayList.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainVideojuegos {

	public static void main(String[] args) {
		
		
		
		VideoJuegos videoJuego1= new VideoJuegos("PRINCE OF PERSIA", "XBOX",450);
		VideoJuegos videoJuego2= new VideoJuegos("SHADOWS OF HUNTERS", "XBOX",400);
		VideoJuegos videoJuego3= new VideoJuegos("BLACK AND WHITE", "LIONGATE",60);
		
		List<VideoJuegos> listaVideoJuegos = new ArrayList<>();

		listaVideoJuegos.add(videoJuego1);
		listaVideoJuegos.add(videoJuego2);
		listaVideoJuegos.add(videoJuego3);
		
		for(VideoJuegos vj:listaVideoJuegos) {
			
			
			System.out.println(vj);
		}
		
		/*Búsqueda: Pide al usuario un título por teclado. Busca si existe en la lista.
			Si existe: Muestra sus datos y sus horas jugadas.
			Si no existe: Muestra "Juego no encontrado".*/
		
		Scanner entrada= new Scanner(System.in);
		boolean encontrado= false;
		do {
		System.out.println("Introduce el titulo a buscar");
		String titulo=entrada.nextLine();
		
		VideoJuegos juegoBuscado= new VideoJuegos(titulo);
		
		
	
		
		for(int i=0;i<listaVideoJuegos.size();i++) {
			
			if(videoJuego1.getTitulo().equalsIgnoreCase(juegoBuscado.getTitulo())) {
				encontrado=true;
				System.out.println("el titulo buscado es el titulo del videoJuego 1");
				
				break;
			}
			
			if(videoJuego2.getTitulo().equalsIgnoreCase(juegoBuscado.getTitulo())) {
				encontrado=true;
				System.out.println("el titulo buscado es el titulo del videoJuego 2");
				break;		
						}

			if(videoJuego3.getTitulo().equalsIgnoreCase(juegoBuscado.getTitulo())) {
				encontrado=true;
				System.out.println("el titulo buscado es el titulo del videoJuego 3");
				break;
			}
		}
		}while(encontrado==false);
		
	
	
	
	/*Modificación: Busca todos los juegos de la plataforma 
	 * "Xbox" y súmales 10 horas extra a sus horasJugadas.*/
	
		
	
		
		
		String plataformaBuscada="XBOX";


		
		if(videoJuego1.getPlataforma().equalsIgnoreCase(plataformaBuscada)) {
			
			System.out.println("Plataforma XBOX encontrada");
			
			videoJuego1.setHorasJugadas(videoJuego1.getHorasJugadas()+10);
			
		}
				
		if(videoJuego2.getPlataforma().equalsIgnoreCase(plataformaBuscada)) {
					
					System.out.println("Plataforma XBOX encontrada");
					
					videoJuego2.setHorasJugadas(videoJuego2.getHorasJugadas()+10);
					
				}
		
		if(videoJuego3.getPlataforma().equalsIgnoreCase(plataformaBuscada)) {
			
			System.out.println("Plataforma XBOX encontrada");
			
			videoJuego3.setHorasJugadas(videoJuego3.getHorasJugadas()+10);
	
}
		

	
	
	
	System.out.println("JUEGOS TRAS SUMAR 10 A LAS HORAS JUGADAS");
	for(VideoJuegos vj:listaVideoJuegos) {
		
		
		System.out.println(vj);
	}
	
	
	
	
	/*Filtrado: Crea una nueva lista llamada juegosPasados. 
	 * Recorre la original y copia en esta nueva lista solo 
	 * aquellos juegos que tengan más de 100 horas.*/
	
	
	List<VideoJuegos> juegosPasados= new ArrayList<>();
	
	
	
	for(VideoJuegos v:listaVideoJuegos) {	
		if(v.getHorasJugadas()>100) {
			juegosPasados.add(v);
		}
	}
	
	System.out.println("JUEGOS NUEVA LISTA");
	for(VideoJuegos jP:juegosPasados) {
		
		
		System.out.println(jP);
	}
	
	
	
	
	
	
	
	
	
	
	entrada.close();
	
	}//-----------------FIN MAIN----------------

}//---------------------FIN CLASE-----------------------
