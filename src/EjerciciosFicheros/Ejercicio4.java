package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Teclado;

public class Ejercicio4 {
	public static Set<String> leerLineasNoRepetidas(String nombreFichero){
		throws IOException {
		BufferedReader flujoLectura = null;
		try {
			flujoLectura = new BufferedReader(new FileReader(nombreFichero));
			Set<String> conjCadena = new LinkedHashSet<String>();
			String linea = flujoLectura.readLine();
			while(linea != null) {
				conjCadena.add(linea);
				linea = flujoLectura.readLine();
			}
			return conjCadena;
		}
		finally {
			if (flujoLectura != null) {
				flujoLectura.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
		String nombreFichero = Teclado.leerCadena("Nombre Fichero? ");
		Set<String> conjCadena = leerLineasNoRepetidas(nombreFichero);
		}
		catch(IOException ioe) {
			System.out.println("Error al acceder al fichero. ");
			ioe.printStackTrace();
		}
		finally {
			
		}
	
	}

}
