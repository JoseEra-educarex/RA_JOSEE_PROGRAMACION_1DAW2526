package unidad5.ejemplos.biblioteca;

public class GestionBiblioteca {
	public static void main(String[] args) {
        // 1. Declaración del array (Las estanterías vacías)
        Libro[] estanteria = new Libro[4];

        // 2. Instanciación (Compramos los libros y los colocamos)
        estanteria[0] = new Libro("El Señor de los Anillos", 1200);
        estanteria[1] = new Libro("El Principito", 95);
        estanteria[2] = new Libro("La sombra del viento", 500);
        estanteria[3] = new Libro("Java para Novatos", 300);

        // 3. Recorrido con filtro (Mostrar libros gordos)
        System.out.println("--- Libros extensos ---");
        for (Libro l : estanteria) { // Usamos for-each por comodidad
            if (l.paginas > 100) {
                System.out.println("- " + l.titulo);
            }
        }

        // 4. Búsqueda de título
        String buscado = "El Principito";
        boolean hallado = false;

        for (int i = 0; i < estanteria.length; i++) {
            // ¡OJO! Para comparar Strings usamos .equals(), no ==
            if (estanteria[i].titulo.equals(buscado)) {
                hallado = true;
                break;
            }
        }

        if (hallado) System.out.println("¡" + buscado + " está disponible!");
    }
}