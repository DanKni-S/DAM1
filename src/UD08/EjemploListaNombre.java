package UD08;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploListaNombre {

	public static void main(String[] args) {
		
		// Crear un arrayList por defecto
		ArrayList<String> lista = new ArrayList<String>();
		
		// añadir nombres a la lista
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Irene");
		lista.add("Isabel");
		lista.add("Jaime");
		if(lista.add("Elena")) {
			System.out.println("Elena añadida");
		}
		
		System.out.println();
		lista.add("Manolo");
		
		// Recorrer por posicion
		System.out.println("Recorrer por posición: ");
		for(int pos = 0 ; pos < lista.size() ; pos++) {
			String elem = lista.get(pos);
			System.out.println(elem);
		}
		
		System.out.println();
		// Recorrer con un iterador
		System.out.println("Recorrer con un iterador: ");
		Iterator<String> iterador = lista.iterator();
		while(iterador.hasNext()) {
			String elem = iterador.next();
			System.out.println(elem);
		}
		
		System.out.println();
		// Recorrer con un bucle for-each
		System.out.println("Recorrer con un bucle for-each: ");
		for(String elem : lista) {
			System.out.println(elem);
		}
		
		System.out.println();
		// Visualizar con el metodo toString
		System.out.println("Visualizar con metodo toString: ");
		System.out.println(lista.toString());
		
		System.out.println();
		// Buscar por nombre
		System.out.println("Buscar por nombre: ");
		if(lista.contains("Elena")) {
			System.out.println("Elena ecnontrada ");
		}
		else {
			System.err.println("Elena no encontrada ");
		}
		
		System.err.println();
		// Buscar la posición
		int pos = lista.indexOf("Elena");
		if(pos == 1) {
			System.out.println("No encontrado");
		}
		else {
			System.out.println("Encontrado en la posición " + pos);
		}
		
		System.out.println();
		// Eliminar
		if (lista.remove("Jaime")){
			System.out.println("Primer Jaime eliminado ");
		}
		else {
			System.out.println("Jaime no encontrado");
		}
	}

}
