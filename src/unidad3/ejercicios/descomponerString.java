package unidad3.ejercicios;

import java.util.Scanner;

public class descomponerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	        System.out.print("Introduce la contraseña: ");
	        String pass = entrada.nextLine();
	        
	        
	        
	        // Flags para verificar los requisitos
	        boolean tieneMinuscula = false;
	        boolean tieneMayuscula = false;
	        boolean tieneNumero = false;
	        boolean tieneEspecial = false;

	        for (int i = 0; i < pass.length(); i++) {
	            char c = pass.charAt(i);
	              System.out.println(c);    
	              
	              if(Character.isLowerCase(c)) {
	            	  
	            	tieneMinuscula=true;
	                System.out.println("Tiene minusculas");
	                
	              } else if (Character.isUpperCase(c)) { 
	            	  tieneMayuscula = true;
	            	  System.out.println("Tiene Mayusculas");
	              }   else if (Character.isDigit(c)) {
	            	  tieneNumero = true;
	            	  System.out.println("Tiene Numero");
	            	  } else if (c == '-' || c == '_' || c == '$') {
	            		  tieneEspecial = true;
	            		  
	            		  System.out.println("Tiene caracter especial");
	            		  }
	            	  }
	        
	        entrada.close();
	        
	              }
	        }
	

