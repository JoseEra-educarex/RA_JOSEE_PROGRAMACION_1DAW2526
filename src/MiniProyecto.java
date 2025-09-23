import java.util.Scanner;
public class MiniProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables:
		
		String nombre;
		int edad;
		
		 Scanner entrada = new Scanner(System.in);
		
		 System.out.print("¿Cual es tu nombre?");
		 nombre = entrada.nextLine();
		 
		 System.out.print("¿Cual es tu edad?");
		 edad = entrada.nextInt();
		 
		
		 
		 entrada.close();
		 
		 System.out.println("Tu nombre es " + nombre + " tu edad es "+ edad + " años.");	
	}

}
