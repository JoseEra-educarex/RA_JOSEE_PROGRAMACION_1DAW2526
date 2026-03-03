package unidad5.ejemplos.expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
			
		
		/*      ^		Inicio de línea	^Hola	"Hola mundo" (Sí), "Dije Hola" (No)
				$		Fin de línea	mundo$	"Hola mundo" (Sí), "Hola mundo." (No)
				.		Cualquier carácter	Ca.a	"Casa", "Caza", "Cana", "Ca@a"
				\d		Un dígito (0-9)	\\d\\d	"05", "99"
				\w		Carácter de palabra (letra o número)	user_\\w	"user_1", "user_A"
				[abc]	Conjunto (cualquiera de los de dentro)	C[ao]sa	"Casa", "Cosa"
				+		Uno o más (Cuantificador)	ho+la	"hola", "hooola", "hooooooola"
				*		Cero o más	ho*la	"hla", "hola", "hooola"
				?		Opcional (cero o uno)	clase?	"clas", "clase"*/
		
        String texto = "Mi coche tiene matrícula 1234-BBB";
        
        // 1. Definimos el Patrón: 4 dígitos, guion opcional, 3 letras mayúsculas
        // \\d{4}   -> 4 dígitos exactos
        // -?       -> guion opcional
        // [A-Z]{3} -> 3 letras mayúsculas
       
        String regex = "\\d{4}-?[A-Z]{3}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        // 2. Comprobamos si hay coincidencia en alguna parte del texto
        
        if (matcher.find()) {
            
        	System.out.println("He encontrado una matrícula: " + matcher.group());
        
        }else {
          
        	System.out.println("No veo ningún coche aquí.");
        
        }
    }
}