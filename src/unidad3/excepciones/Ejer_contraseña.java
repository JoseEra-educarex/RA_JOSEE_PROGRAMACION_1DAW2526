package unidad3.excepciones;

import java.util.Scanner;

public class Ejer_contraseña {

	public static void main(String[] args) {
		/*Gestor de contraseñas
o Crea un método validarContraseña(String pass) que lance una
excepción si la longitud es menor a 8 caracteres. Además, deberá
comprobar lo siguiente:
✓ La cadena tiene 8 o más caracteres.
✓ Contiene al menos una minúscula.
✓ Contiene al menos una mayúscula.
✓ Contiene al menos un número.
✓ Contiene al menos un carácter especial (-, _ o $)
✓ Tras introducir la cadena mostrará un mensaje donde
indicará si la cadena es correcta, si tiene un número inferior a
8 caracteres o si no cumple con los 4 últimos requisitos.
o Usa try-catch en el main para mostrar el mensaje de error*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Introduce la contraseña: ");
		        String contraseña = sc.nextLine();

		        try {
		            validarContraseña(contraseña);
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }

		        sc.close();
		    }
		
		
		 // Método para validar la contraseña
	    public static void validarContraseña(String pass) throws Exception {
	        if (pass.length() < 8) {
	            throw new Exception("Error: La contraseña tiene menos de 8 caracteres.");
	        }

	        // Flags para verificar los requisitos
	        boolean tieneMinuscula = false;
	        boolean tieneMayuscula = false;
	        boolean tieneNumero = false;
	        boolean tieneEspecial = false;

	        for (int i = 0; i < pass.length(); i++) {
	            char c = pass.charAt(i);
	            if (Character.isLowerCase(c)) tieneMinuscula = true;
	            else if (Character.isUpperCase(c)) tieneMayuscula = true;
	            else if (Character.isDigit(c)) tieneNumero = true;
	            else if (c == '-' || c == '_' || c == '$') tieneEspecial = true;
	        }

	        // Verificamos si todos los requisitos se cumplen
	        if (!tieneMinuscula || !tieneMayuscula || !tieneNumero || !tieneEspecial) {
	            throw new Exception("Error: La contraseña no cumple con todos los requisitos (mayúscula, minúscula, número y carácter especial).");
	        }

	        System.out.println("¡La contraseña es correcta!");
	    }

	   
	}