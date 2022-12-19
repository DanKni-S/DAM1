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
		}
		return frase;
	}

	public static void main(String[] args) {
		

	}

}
