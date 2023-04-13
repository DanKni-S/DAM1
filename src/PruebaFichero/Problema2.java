package PruebaFichero;

import java.io.File;
import java.io.IOException;

public class Problema2 {

	public static void main(String[] args) {
		File directorio = new File("Direct");
		File fichero1 = new File(directorio, "FICH1.TXT");
		File fichero2 = new File(directorio, "FICH2.TXT");
		try {
			if(directorio.mkdir()) {
				System.out.println();
			}
		}
		catch (IOException ioe) {
			System.out.println("Error de entrada/salida: " + ioe.toString());
			ioe.printStackTrace();
		}
	}

}
