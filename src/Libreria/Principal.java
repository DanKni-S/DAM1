package Libreria;

import java.util.LinkedList;
import java.util.List;

import Lista_personas.Persona;
import entrada.Teclado;

public class Principal {
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
		
		List<Libro> lista = new LinkedList<Libro>();
		int opcion;
		String titulo, escritor, isbn;
		int anyoPubli, stock;
		double precio;
		Libro libro;
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Elige una opción? ");
			switch(opcion) {
			case 0:
				// Salir del programa
				break;
			case 1:
				// Crear nueva librería.
				isbn = Teclado.leerCadena("");
				libro = new Libro(isbn, "", "", 0, 0, 0);
				if(lista.contains(libro)) {
					System.err.println("Ya existe el libro en la lista. ");
				}
				else {
					titulo = Teclado.leerCadena("Titulo? ");
					escritor = Teclado.leerCadena("Escritor? ");
					anyoPubli = Teclado.leerEntero("Año de Publicación? ");
					stock = Teclado.leerEntero("Cantidad? ");
					precio = Teclado.leerReal("Precio? ");
					if(lista.add(libro)) {
						System.out.println("Se ha insertado un libro en la librería. ");
					}
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		}while(opcion != 0);
	}
}
