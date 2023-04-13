package Mapas;

import java.util.HashSet;
import java.util.LinkedHashMap;

import entrada.Teclado;

public class EjemploLinkedHashMap {

	public static void escribirMapa(LinkedHashMap<String, HashSet<String>> agenda) {
		if (agenda.isEmpty()) {
			System.out.println("El mapa no contiene ningún contacto. ");
		} else {
			for (String nombre : agenda.keySet()) {
				HashSet<String> conjuntoTelefonos = agenda.get(nombre);
				System.out.println("Nombre = " + nombre + " -> " + conjuntoTelefonos.toString());
			}
			System.out.println(agenda.size() + " nombres consultados. ");
		}
	}

	public static void main(String[] args) {

		int opcion;
		String nombre, telefono;
		LinkedHashMap<String, HashSet<String>> agenda = new LinkedHashMap<String, HashSet<String>>();
		HashSet<String> conjuntoTelefonos;
		do {
			System.out.println("(0) Salir ");
			System.out.println("(1) Escribir mapa ");
			System.out.println("(2) Insertar un nombre y un teléfono en el mapa ");
			System.out.println("(3) Eliminar nombre y sus telefonos del mapa ");
			System.out.println("(4) Eliminar un teléfono de un nombre del mapa ");
			opcion = Teclado.leerEntero("Opcion? ");
			switch (opcion) {
			case 0:
				// Salir
				break;
			case 1:
				// Escribir mapa
				escribirMapa(agenda);
				break;
			case 2:
				// Insertar un nombre y un teléfono en el mapa
				nombre = Teclado.leerCadena("Nombre? ");
				telefono = Teclado.leerCadena("Teléfono? ");
				if (agenda.containsKey(nombre)) {
					conjuntoTelefonos = agenda.get(nombre);
					if (conjuntoTelefonos.contains(telefono)) {
						System.out.println("Ese nombre tiene el telefono en el mapa. ");
					} else {

					}
				} else {
					conjuntoTelefonos = new HashSet<String>();
					conjuntoTelefonos.add(telefono);
					agenda.put(nombre, conjuntoTelefonos);
					System.out.println("Se ha añadido un nombre con un teléfono en el mapa. ");
				}
				break;
			case 3:
				// Eliminar nombre y sus telefonos del mapa
				nombre = Teclado.leerCadena("Nombre? ");
				if (agenda.remove(nombre) == null) {
					System.out.println("No se ha encontrado ese nombre en el mapa. ");
				} else {
					System.out.println("Se ha eliminado ese nombre y sus teléfonos del mapa. ");
				}
				break;
			case 4:
				nombre = Teclado.leerCadena("Nombre? ");
				telefono = Teclado.leerCadena("Teléfono? ");
				if(agenda.containsKey(nombre)) {
					conjuntoTelefonos = agenda.get(nombre);
					if(conjuntoTelefonos.remove(telefono)) {
						System.out.println("se ha eliminado ese teléfono del nombre en el mapa. ");
					}else {
						System.out.println("No se ha encontrado ese teléfono asociado a ningun nombre. ");
					}
				}else {
					System.out.println("No se ha encontrado ese nombre en el mapa. ");
				}
				break;
				
				default:
					System.out.println("La opcion no es válida. ");
					break;
			}
		} while (opcion != 0);
	}
}
