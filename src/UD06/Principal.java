package UD06;

import entrada.Teclado;

public class Principal {
	
	// Escribe en consola el menu de opciones del programa
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa");
		System.out.println("(1) Insertar un album en la colección");
		System.out.println("(2) Consultar todos los albumes de la colección");
		System.out.println("(3) Eliminar de la colección");
		System.out.println();
	}

	public static void main(String[] args) {
		Coleccion coleccion = new Coleccion(10);
		int opcion, yearPublicacion, posicion;
		String nombre, artista, genero;
		Album album;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción (0 - 3)?");
			switch (opcion) {
			// Para salir del programa
			case 0:
			break;
			// Insertar un album en la colección
			case 1:
				nombre = Teclado.leerCadena("¿Nombre? ");
				artista = Teclado.leerCadena("¿Artista? ");
				yearPublicacion = Teclado.leerEntero("¿Año de publicación? ");
				genero = Teclado.leerCadena("¿Genero? ");
				album = new Album(nombre, artista, yearPublicacion, genero);
				if(coleccion.insertar(album)) {
					System.out.println("Se ha insertado un album en la colección");
				}
				else {
					System.err.println("Error al insertar: la colección esta llena");
				}
			break;
			// Consultar todos los albumes de la colección
			case 2:
				System.out.println(coleccion.toString());
			break;
			// Eliminar un album, por posicion, de la colección
			case 3:
				posicion = Teclado.leerEntero("¿Posición? ");
				if(coleccion.eliminar(posicion)) {
					System.out.println("Se ha eliminado un album de la colección. ");
				}
				else {
					System.err.println("Error al eliminar: colección vacía o " + "la posición es invalidad. ");
				}
			break;
			
			default:
				System.out.println("La opción de menu debe estar comprendido entre 0 y 3");
			}
		}
		while(opcion != 0);

	}

}
