package x1_archivos;

import java.io.File;

import entrada.Teclado;

public class Problema2 {

	public static void main(String[] args) {
		String nombreCarpeta = Teclado.leerCadena("Carpeta? ");
		File carpeta = new File(nombreCarpeta);
		if(carpeta.exists() && carpeta.isDirectory()) {
			File[] archivos = carpeta.listFiles();
			for(int pos = 0 ; pos < archivos.length ; pos++) {
				File archivo = archivos[pos];
				if(archivo.isFile()) {
					String nombreModif = archivo.getName().toUpperCase();
					File archivoModif = new File(nombreModif);
					if(archivo.renameTo(archivoModif)) {
						System.out.println("Fichero modificado: " + archivoModif);
					}
				}
			}
		}else {
			System.out.println("No existe o no es un directorio. ");
		}

	}

}
