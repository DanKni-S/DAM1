package Actividades4;

import entrada.Teclado;

public class Ejercicio2x10 {
	
	public static int contarEspacio(String texto) {
		int contadorEspacios = 0;
		for (int posicion = 0 ; posicion < texto.length() ; posicion++) {
			char caracter = texto.charAt(posicion);
			if (caracter == ' ') {
				contadorEspacios++;
			}
		}
		return contadorEspacios;
	}
	
	public static String leerFrase(String mensaje, int longtudMinima, int longtudMaxima) {
		String frase = Teclado.leerCadena(mensaje);
		int longitud = frase.length();
		while (longitud > longtudMinima || longitud < longtudMaxima) {
			System.err.println("La frase debe tener " + longtudMinima + " caracteres como mínimo ");
			System.err.println("La frase debe tener " + longtudMaxima + " caracteres como máximo ");
			frase = Teclado.leerCadena(mensaje);
			longitud = frase.length();
		}
		return frase;
	}

	public static void main(String[] args) {
		
		String frase = leerFrase("¿Frase? ", 10, 60);
		
		frase = frase.trim();
		while (frase.indexOf(" ") != -1) {
			frase = frase.replace(" ", " ");
		}
		
		int numeroEspacios = contarEspacio(frase);
		if (frase.length() > 0) {
			int numeroPalabras = numeroEspacios + 1;
			System.out.println("La frase tiene " + numeroPalabras + " palabras. ");
		}
		else {
			System.out.println("La frase no tiene palabras. ");
		}

	}

}
