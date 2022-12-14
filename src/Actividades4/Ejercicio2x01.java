package Actividades4;

import entrada.Teclado;

public class Ejercicio2x01 {
	public static String leerFrase(String mensaje, int longtudMaxima) {
		String frase = Teclado.leerCadena(mensaje);
		while (frase.length() > longtudMaxima) {
			System.out.println("La frase debe tener " + longtudMaxima + " carácteres como maximo");
			frase = Teclado.leerCadena(mensaje);
		}
		return frase;
	}

	public static void main(String[] args) {
		String frase = leerFrase("¿Frase? ", 60);
		
		int contadorLetrasMayusculas = 0;
		String letrasMayusculas = "";
		int contradorLetrasMinusculas = 0;
		String letrasMinusculas = "";
		for (int posicion = 0 ; posicion < frase.length() ; posicion++) {
			char caracter = frase.charAt(posicion);
			if ((caracter >= 'A' && caracter <= 'Z') || caracter == 'Ñ') {
				contadorLetrasMayusculas++;
				letrasMayusculas += caracter;
			}
			else if ((caracter >= 'a' && caracter <= 'z') || caracter == 'ñ') {
				contradorLetrasMinusculas++;
				letrasMinusculas += caracter;
				
			}
		}
		System.out.println("La frase tiene " + contadorLetrasMayusculas + " letras mayusculas ");
		System.out.println("Letras Mayúsculas: " + letrasMayusculas);
		System.out.println("La frase tiene " + contradorLetrasMinusculas + " letras minusculas ");
		System.out.println("Letras Minusculas: " + letrasMinusculas);
	}

}
