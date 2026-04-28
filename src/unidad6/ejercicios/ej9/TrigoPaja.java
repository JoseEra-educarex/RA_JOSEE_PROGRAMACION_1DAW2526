package unidad6.ejercicios.ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class TrigoPaja {

	public static void main(String[] args) {
		/*Ejercicio 9: Separando el Trigo de la Paja
		 * 
Crea un archivo suscripciones.csv con datos de clientes: dni,nombre,meses_pagados (ej: 111A,Ana,12).

Lee el archivo y carga los datos en objetos de la clase Cliente.

Calcula su estado: Si meses_pagados es mayor que 0, es "Premium". Si es 0, es "Moroso".

Exporta los datos creando simultáneamente dos archivos distintos:

		premium.txt: Solo contendrá el nombre en mayúsculas de los clientes al día.
		morosos.txt: Contendrá un aviso: "Atención [nombre], le quedan 0 meses".*/


	        List<Cliente> listaClientes = new ArrayList<>();

	        try (
	            BufferedReader br = new BufferedReader(
	                new FileReader("/home/diurno/eclipse-workspace/RA_JOSEE_PROGRAMACION_1DAW2526/src/unidad6/ejercicios/ej9/suscripciones.csv"));

	            PrintWriter premium = new PrintWriter(
	                new BufferedWriter(
	                    new FileWriter("premium.txt")));

	            PrintWriter morosos = new PrintWriter(
	                new BufferedWriter(
	                    new FileWriter("morosos.txt")))
	        ) {

	            String linea;

	            while ((linea = br.readLine()) != null) {

	                String[] campos = linea.split(",");

	                String dni = campos[0];
	                String nombre = campos[1];
	                int mesesPagados = Integer.parseInt(campos[2]);

	                Cliente cliente = new Cliente(dni, nombre, mesesPagados);

	                listaClientes.add(cliente);

	                if (cliente.getMesesPagados() > 0) {

	                    premium.println(cliente.getNombre().toUpperCase());

	                } else {

	                    morosos.println("Atención " + cliente.getNombre()
	                            + ", le quedan 0 meses");
	                }
	            }

	            System.out.println("Archivos generados correctamente.");

	        } catch (IOException e) {

	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}//FIN DE LA CLASE