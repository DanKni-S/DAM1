package Actividades4;

import entrada.Teclado;

public class Ejercicio1x02 {
	// Sin tener en cuenta las que tienen acentos
	public static boolean esLetraMayuscula(char caracter) {
		if ((caracter >= 'A' && caracter <= 'Z') || caracter == 'Ñ') {
			return true;
		}
		else {
			return false;
		}
	}
	// Sin tener en cuenta las que tienen acentos
	public static boolean esLetraMinuscula(char caracter) {
		if (caracter >= 'a' && caracter <= 'z') {
		return true;	
		}
		else if (caracter == 'ñ') {
			return true;
		}
		else {
			return false;
		}
	}
	// Sin tener en cuenta las que tienen acentos
	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("¿Carácter? ");
		
		if (esLetraMayuscula(caracter)) {
			System.out.println("El carácter " + caracter + " es una letra mayuscula ");
		}
		else if (esLetraMinuscula(caracter)) {
			System.out.println("El carácter " + caracter + " es una letra minuscula ");
		}
		else {
			System.out.println("el carácter " + caracter + " no es una letra ");
		}
	}

}
