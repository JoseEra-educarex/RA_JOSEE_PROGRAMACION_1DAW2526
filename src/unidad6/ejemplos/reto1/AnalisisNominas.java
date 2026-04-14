package unidad6.ejemplos.reto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AnalisisNominas {

	public static void main(String[] args) {
		
			double gastoTotal=0;
				
				double salarioMayor=0;
				
				String empleadoMejorPagado="";
		File directorio= new File(".");//.=directorio actual
		
		System.out.println("El directorio actual es:" + directorio.getAbsolutePath());
		
		
		try (FileReader fr = new FileReader("./src/unidad6/ejemplos/reto1/empleados.csv")){
				 
				BufferedReader br = new BufferedReader(fr);
			 
				String linea;
				linea = br.readLine();// para no leer la primera linea dentro del bucle
			
			
				
			while((linea = br.readLine())!=null) {
				
				//System.out.println(linea);
		
			String [] campos= linea.split(",");//devuelve un array de campos
	
				empleadoMejorPagado=campos[1];
		
				gastoTotal+=Double.parseDouble(campos[3]);
				
			if(	salarioMayor<Double.parseDouble(campos[3]))	{
				salarioMayor=Double.parseDouble(campos[3]);
				empleadoMejorPagado=campos[1];
			}		
				}
	
				System.out.println("El gasto total es: "+ gastoTotal+ "Euros");	
			
	
				System.out.println("El empleado que mas cobra es: "+salarioMayor+" "+empleadoMejorPagado);
			
	
			
		} catch (IOException e) {
		
		System.out.println("Error al Leer: " + e.getMessage());
	 
	}
		
		  try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/unidad6/ejemplos/reto1/informe_rrhh.txt", true));
		            PrintWriter out = new PrintWriter(bw)) {  // PrintWriter nos da el cómodo println()
			
			  out.println("El gasto total es: "+ gastoTotal+ "Euros");
			  out.println("El empleado que mas cobra es: "+salarioMayor+" "+empleadoMejorPagado);
			  
		  }catch(IOException e){
			  
			  
			  }//FIN CATCH 
		  }//fin main
		           
		
		
		
		
	
			
		
		
	
}//fin clase
