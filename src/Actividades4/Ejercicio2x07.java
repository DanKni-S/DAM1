package Actividades4;

import entrada.Teclado;

public class Ejercicio2x07 {

	public static String leerFrase(String mensaje, int longtudMaxima, int longtudMinima) {
		String frase = Teclado.leerCadena(mensaje);
		int longitud = frase.length() - 1;
		while (longitud > longtudMinima || longitud < longtudMaxima) {
			System.out.println("La frase debe tener " + longtudMinima + " caracteres como mínimo. ");
			System.out.println("La frase debe tener " + longtudMaxima + " caracteres como máximo. ");
			frase = Teclado.leerCadena(mensaje);
		}
		return frase;
	}

	public static void main(String[] args) {

		String frase = leerFrase("¿Frase? ", 2, 40);
		System.out.println("Rotacion hacia la derecha: ");
		
		for (int linea = 0; linea < frase.length(); linea++) {
			System.out.println(frase);
			char ultimoCaracter = frase.charAt(frase.length() - 1);
			String restoCaracteres = frase.substring(0, frase.length() - 1);
			frase = ultimoCaracter + restoCaracteres;
		}
		System.out.println("\nRotacion hacia la izquierda: ");
		
		for (int rotacion = 0 ; rotacion < frase.length() ; rotacion++) {
			System.out.println(frase);
			char primerCaracter = frase.charAt(0);
//			String restoCaracteres = frase.substring(1, frase.length());
			String restoCaracteres = frase.substring(1);
			frase = restoCaracteres + primerCaracter;
		}
		
//		String frase = leerFrase("¿Frase? ", 2, 40);
//		for (int linea = 0; linea < frase.length() - 1 ; linea++) {
//			for (int posicion = 0; posicion <= linea; posicion++) {
//				System.out.println(frase.charAt(posicion));
//			}
//			System.out.println("");
//		}
	}
}
