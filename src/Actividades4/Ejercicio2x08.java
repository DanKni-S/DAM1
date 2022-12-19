package Actividades4;

import entrada.Teclado;

public class Ejercicio2x08 {
	
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
	
	public static String leerNombre(String mensaje) {
		String nombre = Teclado.leerCadena(mensaje);
		int contadorEspacios = contarEspacio(nombre);
		while (contadorEspacios != 1 || nombre.startsWith(" ") || nombre.endsWith(" ")) {
			System.out.println("El nombre completo debe tener un espacio en blanco. ");
			System.out.println("El nombre completo no debe comenzar por un espacio en blanco. ");
			System.out.println("El nombre completo no debe terminar en un espacio en blanco. ");
			nombre = Teclado.leerCadena(mensaje);
			contadorEspacios = contarEspacio(nombre);
		}
		return nombre;
	}

	public static void main(String[] args) {
		
		String nombreCompleto1 = leerNombre("¿Nombre completo 1? ");
		String nombreCompleto2 = leerNombre("¿Nombre completo 2? ");
		int posicionEspacio1 = nombreCompleto1.indexOf(' ');
		String nombre1 = nombreCompleto1.substring(0, posicionEspacio1);
		String apellido1 = nombreCompleto1.substring(posicionEspacio1 + 1);
		
		int posicionEspacio2 = nombreCompleto2.indexOf(' ');
		String nombre2 = nombreCompleto2.substring(0, posicionEspacio2);
		String apellido2 = nombreCompleto2.substring(posicionEspacio2 + 1);
		
		System.out.println(nombre1 + " " + apellido2);
		System.out.println(nombre2 + " " + apellido1);

	}

}
