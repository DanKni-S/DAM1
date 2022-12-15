package Actividades4;

import entrada.Teclado;

public class Ejercicio2x06 {
	
	public static String leerFrase(String mensaje, int longtudMaxima, int longtudMinima) {
		String frase = Teclado.leerCadena(mensaje);
		int longitud = frase.length();
		while (longitud > longtudMinima || longitud < longtudMaxima) {
			System.out.println("La frase debe tener " + longtudMinima + " caracteres como mínimo. ");
			System.out.println("La frase debe tener " + longtudMaxima + " caracteres como máximo. ");
			frase = Teclado.leerCadena(mensaje);
		}
		return frase;
	}

	public static void main(String[] args) {
		
		String frase = leerFrase("¿Frase? ", 5, 40);
		for(int linea = 0 ; linea < frase.length() ; linea++) {
			System.out.println(frase.substring(0, linea + 1));
		}
		
//		String frase = leerFrase("¿Frase? ", 5, 40);
//		for (int linea = 0 ; linea <= frase.length() ; linea++) {
//			for(int posicion = 0 ; posicion <= linea ; posicion++) {
//				System.out.println(frase.charAt(posicion));
//			}
//			System.out.println("");
//		}
	}

}
