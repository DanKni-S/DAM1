package Actividades3;

import Constructor.Videojuego;
import entrada.Teclado;

public class Ejercicio1x01 {

	public static void main(String[] args) {
		
		String nombre, desarrollador;
		int year, maxJugadores;
		
		System.out.println("Videojuego 1");
		nombre = Teclado.leerCadena("¿Introduce nombre? ");
		desarrollador = Teclado.leerCadena("¿Introduce desarrollador? ");
		year = Teclado.leerNatural("¿Año? ");
		maxJugadores = Teclado.leerNatural("¿Número Maximo de Jugadores? ");
		
		Videojuego videojuego1 = new Videojuego (nombre, desarrollador, year, maxJugadores);
		System.out.println(videojuego1.obtenerEstado());
		
		
		System.out.println("Videojuego 2");
		nombre = Teclado.leerCadena("¿Introduce nombre? ");
		desarrollador = Teclado.leerCadena("¿Introduce desarrollador? ");
		year = Teclado.leerNatural("¿Año? ");
		
		Videojuego videojuego2 = new Videojuego (nombre, desarrollador, year);
		System.out.println(videojuego2.obtenerEstado());
		
		System.out.println("Videojuego 3");
		nombre = Teclado.leerCadena("¿Introduce nombre? ");
		desarrollador = Teclado.leerCadena("¿Introduce desarrollador? ");
		year = Teclado.leerNatural("¿Año? ");
		
		Videojuego videojuego3 = new Videojuego (nombre, desarrollador);
		System.out.println(videojuego3.obtenerEstado());
	}

}
