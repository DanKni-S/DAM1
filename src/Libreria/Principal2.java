package Libreria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entrada.Teclado;

public class Principal2 {

	public static void escribirMenu() {
		System.out.println();
		System.err.println("(0) Salir del programa ");
		System.out.println("(1) Crear nueva librería. ");
		System.out.println("(2) Insertar un libro en la librería. ");
		System.out.println("(3) Eliminar un libro, por ISBN, de la librería. ");
		System.out.println("(4) Consultar un libro, por ISBN, de la librería. ");
		System.out.println("(5) Consultar todos los libros de la librería. ");
		System.out.println("(6) Consultar todos los libros de la librería, en orden por precio descendente. ");
		System.out.println("(7) Consultar varios libros, por escritor, de la librería. ");
		System.out.println("(8) Consultar el libro de mayor precio de la librería. ");
		System.out.println("(9) Gestionar la venta de una unidad de un determinado libro por ISBN. ");
		System.out.println();
	}

	public static void main(String[] args) {
		String nombre, isbn, titulo, escritor;
		int anyoPubli, stock;
		double precio;
		int opcion, posicion;
		Libro libro;
		List<Libro> listaLibros = new ArrayList<Libro>();
		List<Libro> listaLibroAux;

		Libreria libreria = null;

		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Elige una opción? ");
			switch (opcion) {
			case 0:
				// Salir del programa.
				break;
			case 1:
				// Crear nueva librería.
				nombre = Teclado.leerCadena("");
				libreria = new Libreria(nombre);
				System.out.println("Se ha creado una nueva librería. ");
				break;
			case 2:
				// Insertar un libro en la librería.
				if (libreria == null) {
					System.err.println("Antes debes crear una librería. ");
				} else {
					isbn = Teclado.leerCadena("");
					libro = libreria.consultar(isbn);
					if (libro != null) {
						System.err.println("Ya existe otro libro con ese ISBN en la librería. ");
					} else {
						titulo = Teclado.leerCadena("Titulo? ");
						escritor = Teclado.leerCadena("Escritor? ");
						anyoPubli = Teclado.leerEntero("Año de Publicación? ");
						stock = Teclado.leerEntero("Cantidad? ");
						precio = Teclado.leerReal("Precio? ");
						libro = new Libro(isbn, titulo, escritor, anyoPubli, stock, precio);
						if (libreria.insertar(libro)) {
							System.out.println("Se ha insertado un libro en la librería. ");
						}
					}
				}
				break;
			case 3:
				// Eliminar un libro, por ISBN, de la librería.
				if (libreria == null) {
					System.err.println("Antes debes crear una librería. ");
				} else {
					isbn = Teclado.leerCadena("");
					if (libreria.eliminar(isbn)) {
						System.err.println("Se ha eliminado un libro de la librería. ");
					} else {
						System.out.println("No se ha encontrado ningun libro. ");
					}
				}
				break;
			case 4:
				// Consultar un libro, por ISBN, de la librería.
				if (libreria == null) {
					System.out.println("");
				} else {
					isbn = Teclado.leerCadena("Antes debes crear una librería. ");
					libro = libreria.consultar(isbn);
					if (libro == null) {
						System.out.println("No se ha encontrado ningun libro. ");
					} else {
						System.out.println(libro.toString());
					}
				}
				break;
			case 5:
				// Consultar todos los libros de la librería.
				if (libreria == null) {
					System.err.println("Antes debes crear una librería. ");
				} else {
					System.out.println(libreria.toString());
				}
				break;
			case 6:
				// Consultar todos los libros de la librería, en orden por precio descendente.
				if(libreria == null) {
					System.out.println("Antes debes crear una librería. ");
				}
				else {
					listaLibroAux = libreria.ordernarPorPrecio();
					System.out.println(listaLibroAux.toString());
				}
				break;
			case 7:
				// Consultar varios libros, por escritor, de la librería.

				break;
			case 8:
				// Consultar el libro de mayor precio de la librería.
				break;
			case 9:
				// Gestionar la venta de una unidad de un determinado libro por ISBN.

				break;
			}

		} while (opcion != 0);
	}

}
