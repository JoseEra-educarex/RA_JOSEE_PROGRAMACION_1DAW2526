package unidad2.matematicas;

public class MayorAleatorio {

	public static void main(String[] args) {
		/*2. Crea un programa que genere tres números aleatorios con Math.random() y
				muestre cuál es el mayor.*/
			int max =10;
			int min=1;
			
			
		int a= (int)(Math.random()*(max-min+1)+min);
		int b= (int)(Math.random()*(max-min+1)+min);
		int c= (int)(Math.random()*(max-min+1)+min);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a>b&&a>c) {
			
			System.out.println("El numero mayor es a: "+a);
		
		}else if(b>a&&b>c) {
		
			System.out.println("El numero mayor es b: "+b);
		
		}else {
		
			System.out.println("El numero mayor es c: "+c);
		}
		
		
	}

}
