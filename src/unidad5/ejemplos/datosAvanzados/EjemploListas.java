package unidad5.ejemplos.datosAvanzados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Polimorfismo: Declaramos la Interfaz (List) pero instanciamos la Clase (ArrayList)
        List<String> compra = new ArrayList<>();

        // 1. Añadir elementos
        compra.add("Leche");
        compra.add("Pan");
        compra.add("Aceite");
        compra.add("Pan"); // ¡Admite duplicados!

        // 2. Acceso posicional (Get)
        System.out.println("El primer elemento es: " + compra.get(0)); // Leche

        // 3. Modificar
        compra.set(1, "Pan Integral"); // Cambia "Pan" por "Pan Integral"

        // 4. Borrar
        compra.remove(2); // Borra "Aceite" (por índice)
        compra.remove("Leche"); // Borra "Leche" (por objeto)

        // 5. Tamaño
        System.out.println("Tengo " + (compra.size()+1) + " cosas que comprar.");
        
        //6. Buscar
        
      System.out.println(  compra.contains("Pan"));
    
     // Forma A: El Bucle For-Each (La más limpia)
        for (String producto : compra) {
            System.out.println(producto);
        }

        // Forma B: Iterador (Necesaria si queremos borrar mientras recorremos)
        Iterator<String> it = compra.iterator();
        while(it.hasNext()) {
            String p = it.next();
            if (p.equals("Pan")) {
                it.remove(); // Borrado seguro
            }
        }

	
	
	}
	
	
	
}