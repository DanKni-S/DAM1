package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entrada.Teclado;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		BufferedReader flujoLectura = null;
		BufferedWriter flujoEscritura = null;
		File fichLectura = null;
		File fichEscritura = null;
		try {
			String nombreFichero = Teclado.leerCadena("Nombre de fichero? ");
			fichLectura = new File(nombreFichero);
			if (fichLectura.exists()) {
				String palabra = Teclado.leerCadena("Palabra? ");
				fichEscritura = new File("tmp.txt");
				flujoLectura = new BufferedReader(new FileReader(nombreFichero));
				flujoEscritura = new BufferedWriter(new FileWriter("tmp.txt"));

				String linea = flujoLectura.readLine();
				while (linea != null) {
					if (linea.contains(palabra)) {
						flujoEscritura.write(linea);
						flujoEscritura.newLine();
					}
					linea = flujoLectura.readLine();
				}
				System.out.println("El fichero se ha modificado. ");
			} else {
				System.out.println("El fichero no existe. ");
			}
			flujoLectura.close();
			flujoEscritura.close();
			fichLectura.delete();
			fichEscritura.renameTo(fichLectura);

		}  finally {
			if (flujoLectura != null) {
				flujoLectura.close();
			}
			if (flujoEscritura != null) {
				flujoEscritura.close();
			}
			fichLectura.delete();
			fichEscritura.renameTo(fichLectura);
		}

	}

}
