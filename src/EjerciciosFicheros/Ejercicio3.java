package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Teclado;

public class Ejercicio3 {

	public static void main(String[] args) {
		String nombreFichero = Teclado.leerCadena("Nombre del fichero? ");
		BufferedReader Lectura = null;
		try {
			Lectura = new BufferedReader(new FileReader(nombreFichero));
			Set<String> conjCadena = new LinkedHashSet<String>();
			String linea = Lectura.readLine();
			while(linea != null) {
				conjCadena.add(linea);
				linea = Lectura.readLine();
			}
			System.out.println("Linea no repetidas: " + conjCadena);
			for(String s : conjCadena) {
				System.out.println(s);
			}
		}
		catch(IOException ioe) {
			System.out.println("Error al acceder al fichero. ");
			ioe.printStackTrace();
		}
		finally {
			
		}

	}

}
