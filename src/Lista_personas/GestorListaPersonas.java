package Lista_personas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import entrada.Teclado;

public class GestorListaPersonas {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa ");
		System.out.println("(1) Insertar una persona en la lista ");
		System.out.println("(2) Consultar todas las personas de las lista ");
		System.out.println("(3) Eliminar una persona, por DNI, de la lista ");
		System.out.println("(4) Consultar personas, por nombre, de la lista ");
		System.out.println("(5) Ordenar la lista por edad descendente ");
		System.out.println("(6) Ordenar la lista por apellidos y nombres ascendente ");
		System.out.println();
	}

	public static void escribirLista(List<Persona> lista) {
		for (Persona p : lista) {
			System.out.println(p.toString());
		}
		System.out.println(lista.size() + " personas consultadas");
	}

	public static void main(String[] args) {

		// Crear una lista de personas
		List<Persona> lista = new LinkedList<Persona>();
		List<Persona> listAux;
		String dni, nombres, apellidos;
		int opcion, edad, contPersonas;
		Persona persona;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion? ");
			switch (opcion) {
			case 0:
				// Salir del programa
				break;
			case 1:
				// Insertar una persona en la lista
				dni = Teclado.leerCadena("DNI? ");
				persona = new Persona(dni, "", "", 0);
				if (lista.contains(persona)) {
					System.err.println("Ya existe una persona con ese DNI en la lista. ");
				} else {
					nombres = Teclado.leerCadena("Nombre? ");
					apellidos = Teclado.leerCadena("Apellidos? ");
					edad = Teclado.leerEntero("Edad?");
					persona = new Persona(dni, nombres, apellidos, edad);
					if (lista.add(persona)) {
						System.out.println("Se ha insertado una persona en la lista. ");
					}
				}
				break;
			case 2:
				// Consultar todas las personas de la lista
				if (lista.isEmpty()) {
					System.err.println("La lista esta vacía. ");
				} else {
					escribirLista(lista);
				}
				break;
			case 3:
				// Eliminar una persona, por DNI, de la lista
				dni = Teclado.leerCadena("DNI? ");
				persona = new Persona(dni, "", "", 0);
				if (lista.remove(persona)) {
					System.out.println("Se ha eliminado una persona de la lista. ");
				} else {
					System.err.println("No se ha esncontrado ninguna persona con ese DNI. ");
				}
				break;
			case 4:
				// Consultar personas, por nombres, de la lista
				nombres = Teclado.leerCadena("Nombre? ");
				listAux = new LinkedList<Persona>();
				for (Persona p : lista) {
					if (p.getNombres().equalsIgnoreCase(nombres)) {
						listAux.add(p);
					}
					if (listAux.isEmpty()) {
						System.out.println("No se ha encontrado ninguna persona con ");
					} else {
						escribirLista(listAux);
					}
				}
				break;
			case 5:
				// Ordenar la lista por edad descendente
				listAux = new LinkedList<Persona>();
				listAux.addAll(lista);
				
				Collections.sort(listAux, new OrdenPersonaPorEdad());
				
				if (listAux.isEmpty()) {
					System.err.println("La lista esta vacía. ");
				} else {
					escribirLista(listAux);
				}
				
				break;
			case 6:
				// Ordenar por apellidos y nombres ascendentes
				listAux = new LinkedList<Persona>();
				listAux.addAll(lista);
				
				Collections.sort(listAux, new OrdenPersonaPorApellido());
				
				if (listAux.isEmpty()) {
					System.err.println("La lista esta vacía. ");
				} else {
					escribirLista(listAux);
				}
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		} while (opcion != 0);
	}
}
