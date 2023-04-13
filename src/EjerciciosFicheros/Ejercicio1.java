package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entrada.Teclado;

public class Ejercicio1 {

	public static void main(String[] args) {
		String nombreFichero = Teclado.leerCadena("Nombre Fichero? ");
		BufferedReader flujoLectura = null;
		try {
			flujoLectura = new BufferedReader(new FileReader(nombreFichero));
			int contLineas = 0;
			int contCaracteres = 0;
			String linea = flujoLectura.readLine();
			while (linea != null) {
				System.out.println(linea);
				contLineas++;
				contCaracteres += linea.length() + 2;
				linea = flujoLectura.readLine();
			}
			System.out.println("Lineas: " + contLineas);
			System.out.println("Caracteres: " + contCaracteres);
		} catch (IOException ioe) {
			System.out.println("Error al acceder al fichero. ");
			ioe.printStackTrace();
		} finally {
			try {
				if (flujoLectura != null) {
					flujoLectura.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error al acceder al fichero. ");
				ioe.printStackTrace();
			}
		}
		// BufferedReader flujoLectura = new BufferedReader(new
		// FileReader(nombreFichero));

	}

}
