package com.myapp.empresapoo.controlador;

import java.io.IOException;

import com.myapp.empresapoo.modelo.Empleado;

import java.io.*;

public class GuardarEmpleados {
	// La "ruta" es donde va estar mi archivo txt
	public static void añadir(Empleado e, String ruta) throws IOException {
		File archivo;
		PrintWriter pw = null; // imprime en un fichero
		FileWriter fw = null; // escribe en un fichero

		try {
			// creando el archivo y dandole una carpeta donde crearlo
			archivo = new File("Empleados.txt");

			fw = new FileWriter(archivo, true);
			pw = new PrintWriter(fw);

			pw.println("Nombre: "+ e.getNombre() +" | "+ "Cargo: " + e.getCargo() +" | "+ "Identificacion: " + e.getIdentificacion() +" | "+ "Salario: " + e.getSalario());
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}

	}
}
