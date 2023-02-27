package UD08;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjemploLista {

	public static void main(String[] args) {

		// Crear un arrayList por defecto
		ArrayList<String> lista = new ArrayList<String>();

		// añadir nombres a la lista
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Irene");
		lista.add("Isabel");
		lista.add("Jaime");
		lista.add("Nagi");
		lista.add("Bibi");
		lista.add("Isagi");
		lista.add("Bachira");
		
		// Crear un linked list con los datos del arrays list
		LinkedList<String> lista2 = new LinkedList<String>(lista);
		
		// Visualiza con el metodo toString
		System.out.println("Visualizar con el metodo toString: ");
		System.out.println(lista.toString());
	}

}
