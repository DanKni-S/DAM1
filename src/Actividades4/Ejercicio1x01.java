package Actividades4;

import entrada.Teclado;

public class Ejercicio1x01 {
	
	public static boolean esNumeroArabigo(char caracter) {
		if(caracter >= '0' && caracter <= '9') {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		char caracter = Teclado.leerCaracter("¿Caracter? ");
		if (esNumeroArabigo(caracter)) {
			System.out.println("El carácter " + caracter + " es un número arábigo ");
		}
		else {
			System.out.println("El carácter " + caracter + " no es un número arábigo ");
		}
	}

}
