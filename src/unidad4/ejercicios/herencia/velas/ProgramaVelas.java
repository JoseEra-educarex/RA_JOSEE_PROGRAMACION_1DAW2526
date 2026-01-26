package unidad4.ejercicios.herencia.velas;

public class ProgramaVelas {

	public static void main(String[] args) {
		/*4. Velas Gata hace velas en varios tamaños. Cree una clase para la empresa denominada Vela
que contenga campos de datos para color, altura y precio. Cree métodos get para los tres campos.
Cree métodos establecidos para el color y la altura, pero no para el precio. En cambio, cuando se
establece la altura, determine el precio como 2€ por cm.
Cree una clase secundaria llamada VelaPerfumada que contenga un campo de datos adicional
llamado aroma y métodos para obtenerlo y configurarlo. En la clase secundaria, anule el método
setAltura () del padre para establecer el precio de un objeto VelaPerfumada en 3€ por cm. Escriba
una aplicación que instancia un objeto de cada tipo y muestra los detalles. Guarde los archivos
como Vela.java, VelaPerfumada.java y ProgramaVelas.java.*/

		
		Vela velaNormal = new Vela("blanca");
		
		velaNormal.setAltura(0.15);
		
		VelaPerfumada velaFrutasBosque = new VelaPerfumada("morado", "Frutos del bosque");
		
		velaFrutasBosque.setAltura(0.25);
		
		System.out.println(velaFrutasBosque.toString());
		System.out.println(velaNormal.toString());
		
		
	}

	
	
	
}
