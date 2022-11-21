package Actividades3;

import entrada.Teclado;
import Constructor.Libro;

public class Ejercicio1x03 {
	// Escribe en consola el menu de opciones del programa principal
	public static void escribirMenu() {
		System.out.println();
		System.out.println("0) Salir del programa. ");
		System.out.println("1) Crear un libro a partir de datos leídos por teclado. ");
		System.out.println("2) Visualizar en consola el libro. ");
		System.out.println("3) Modificar el título del libro.");
		System.out.println("4) Modificar el número de ejemplares del libro.");
		System.out.println("5) Modificar el precio del libro.");
		System.out.println("6) Visualizar en consola el título del libro.");
		System.out.println("7) Visualizar en consola el número de ejemplares del libro.");
		System.out.println("8) Visualizar en consola el precio del libro.");
		System.out.println();

	}

	public static void main(String[] args) {

		int opcion, numeroEjemplar;
		String titulo;
		double precio;
		Libro libro = null;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Introduce una opción (0 - 8)");
			switch (opcion) {
			// Salir del programa
			case 0:
				break;

			// Crear un libro a partir de datos leidos por teclado
			case 1:
				if (libro == null) {
					titulo = Teclado.leerCadena("Introduce título: ");
					numeroEjemplar = Teclado.leerEntero("Introduce nnúmero de ejemplares: ");
					precio = Teclado.leerReal("Introduce precio: ");
					libro = new Libro(titulo, numeroEjemplar, precio);
					System.out.println("Se ha creado un libro. ");
				} else {
					System.out.println("Ya existe un libro creado. ");
				}
				break;

			// Visualiza en consola libro
			case 2:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					System.out.println(libro.obtenerEstado());
				}
				break;

			// Modificar el título del libro
			case 3:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					titulo = Teclado.leerCadena("Introduce un título: ");
					libro.setTitulo(titulo);
					System.out.println(libro.obtenerEstado());

				}
				break;

			// Modificar el número de ejemplares del libro
			case 4:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					numeroEjemplar = Teclado.leerEntero("Introduce número de ejemplares: ");
					libro.setNumeroEjemplar(numeroEjemplar);
					System.out.println(libro.obtenerEstado());
				}
				break;

			// Modificar el precio del libro
			case 5:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					precio = Teclado.leerReal("Introduce el precio: ");
					libro.setPrecio(precio);
					System.out.println(libro.obtenerEstado());
				}
				break;

			// Visualizar en consola el título del libro
			case 6:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					System.out.println("Titulo: " + libro.getTitulo());
				}
				break;

			// Visualizar en consola el número de ejemplares del libro
			case 7:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					System.out.println("Número de ejemplares: " + libro.getNumeroEjemplar());
				}
				break;

			// Visualizar en consola el precio del libro
			case 8:
				if (libro == null) {
					System.out.println("Antes se debe crear un libro. ");
				} else {
					System.out.println("Precio: " + libro.getPrecio());
				}
				break;

			default:
				System.out.println("La opción de menú debe estar comprendida entre 0 - 8");
			}

		} while (opcion != 0);
		System.out.println("Programa Finalizado. ");
	}

}
