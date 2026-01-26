package unidad4.ejercicios.herencia.camisetas;

public class ProgramaCamisetas {

	public static void main(String[] args) {
		/*5. Crea una clase Camiseta para la compañía Camisetas Augusta. Los campos incluyen un
número de pedido, tamaño, color y precio. Cree métodos establecidos para el número de pedido, el
tamaño y el color y obtenga métodos para los cuatro campos. El precio está determinado por el
tamaño: 22.99€ para XXL o XXXL, y 9.99€ para todos los demás tamaños. Cree una subclase
llamada Personalizada que descienda de Camiseta e incluya un campo para contener el eslogan
solicitado para la camisa e incluya métodos get y set en este campo. Escriba una aplicación que
cree dos objetos de cada clase y demuestre que todos los métodos funcionan correctamente.
Guarde los archivos como Camiseta.java, Personalizada.java y ProgramaCamisetas.java*/
		
		Camiseta camiseta1 = new Camiseta();
		Personalizada personalizada1 = new Personalizada();
		
		camiseta1.setNumeroPedido(1);
		camiseta1.setTamaño("XXXL");
		camiseta1.setColor("Negro");
		
		personalizada1.setNumeroPedido(2);
		personalizada1.setTamaño("L");
		personalizada1.setColor("Blanco");
		personalizada1.setEslogan("Un amigo un tesoro");
		
		
		System.out.println(camiseta1.toString());
		System.out.println(personalizada1.toString());
	}

	
	
	
	
}
