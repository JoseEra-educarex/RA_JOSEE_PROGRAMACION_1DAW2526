package unidad5.ejemplos.genericos;

		// Definimos la clase con el parámetro de tipo <T>
		public class Contenedor<T> {
		   // El atributo interno es de tipo T (aún no sabemos cuál será)
		   private T contenido;
		 
		   // Constructor que recibe un objeto de tipo T
		   public Contenedor(T contenido) {
		       this.contenido = contenido;
		   }
		 
		   // Método que devuelve el contenido (tipo T)
		   public T getContenido() {
		       return contenido;
		   }
		 
		   // Método para cambiar el contenido (debe ser del mismo tipo T)
		   public void setContenido(T contenido) {
		       this.contenido = contenido;
		   }
		 
		   public void mostrarTipo() {
		       System.out.println("El tipo de T es: " + contenido.getClass().getName());
		   }
		}
		 
		// Clase principal para probarlo
		class GestionAlmacen {
		   public static void main(String[] args) {
		       // CASO 1: Creamos un contenedor EXCLUSIVO para Strings (Etiquetas)
		       // Aquí T se convierte en String
		       Contenedor<String> cajaEtiquetas = new Contenedor<>("Etiqueta de envío #55");
		       System.out.println("Caja 1 contiene: " + cajaEtiquetas.getContenido());
		 
		       // CASO 2: Creamos un contenedor EXCLUSIVO para Integers (Códigos postales)
		       // Aquí T se convierte en Integer
		       Contenedor<Integer> cajaCodigos = new Contenedor<>(10003); // CP de Cáceres
		       
		       // ¡SEGURIDAD!
		       // La siguiente línea daría ERROR DE COMPILACIÓN (subrayado rojo).
		       // cajaCodigos.setContenido("Badajoz"); // Error: Se esperaba Integer, no String.
		       
		       cajaEtiquetas.mostrarTipo(); // java.lang.String
		       cajaCodigos.mostrarTipo();   // java.lang.Integer
		   }
		}