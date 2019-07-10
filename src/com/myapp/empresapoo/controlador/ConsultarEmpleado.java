package com.myapp.empresapoo.controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ConsultarEmpleado {
	static String datos = "";
	static String[] info = datos.split(",");
	static List<String> inform = new ArrayList<>();
	static File fichero = new File("Empleados.txt");

	public static String getDatos() {
		return datos;
	}

	public static void setDatos(String datos) {
		ConsultarEmpleado.datos = datos;
	}

	public static List<String> getInform() {
		return inform;
	}

	public static void setInform(List<String> inform) {
		ConsultarEmpleado.inform = inform;
	}

	public static void verEmpleados() throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("Empleados.txt"));
		while ((datos = bf.readLine()) != null) {
			setDatos(datos);
			inform.add(datos);

		}
		bf.close();

	}

	public static void buscarUnEmpleado(int identificacion) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("Empleados.txt"));

		
		try {
			while ((datos = bf.readLine()) != null) {
				if (datos.contains(Integer.toString(identificacion))) {
					System.out.println("el numero fue encontrado" + identificacion);
				
				} else {
					System.out.println("el numero no se ha encontrado en el fichero");
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
