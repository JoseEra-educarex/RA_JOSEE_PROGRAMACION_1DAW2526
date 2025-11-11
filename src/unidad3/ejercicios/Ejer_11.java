package unidad3.ejercicios;

import java.util.Scanner;

public class Ejer_11 {

	public static void main(String[] args) {
		/*Implemente una aplicación que tome el peso en kilos de una cantidad 
		 * de ropa a lavar en una lavadora industrial y nos devuelva el nivel de agua 
		 * dependiendo del peso. Se sabe que con más de 30 kilos la lavadora 
		 * no funcionará ya que es DEMASIADO PESO. Si la ropa pesa
			22 o más kilos, el nivel será de MÁXIMO; si pesa 15 o más será de ALTO;
 			si pesa 8 o más, será un nivel MEDIO; o de lo contrario el nivel será MÍNIMO.*/

		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el peso de la ropa a lavar: ");
		
		int peso= entrada.nextInt();
		
		if(peso>30) {
			System.out.println("no funciona...DEMASIADO PESO");
		}else if(peso>=22&&peso<=30) {
			System.out.println("nivel MÁXIMO");

		}else if(peso>=15&&peso<22) {
			System.out.println("nivel ALTO");
		}else if(peso>=8&&peso<15) {
			System.out.println("nivel MEDIO");
	
		}else if(peso>0&&peso<8) {
			System.out.println("nivel MINIMO");
		}
		entrada.close();
	}

}
