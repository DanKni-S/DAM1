package Libreria;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Libreria {

	private String nombre;
	private List<Libro> listaLibros;

	public Libreria(String nombre) {
		this.nombre = nombre;
		this.listaLibros = new LinkedList<Libro>();

	}

	@Override
	public String toString() {
		String cadena = "";
		if (listaLibros.isEmpty()) {
			cadena = "La librería esta vacía. ";
		} else {
			for (int pos = 0; pos < listaLibros.size(); pos++) {
				Libro libro = listaLibros.get(pos);
				cadena = cadena + "(" + pos + ")" + libro.toString() + "\n";
			}
			cadena = cadena + listaLibros.size() + " Libros consultados. ";
		}
		return cadena;
	}
	public Libro consultar(String isbn) {
		Libro libro = null;
		Libro lirboBuscar = new Libro(isbn);
		int posicion = listaLibros.indexOf(lirboBuscar);
		if(posicion != 1) {
			libro = listaLibros.get(posicion);
		}
		return libro;
	}
	
	public boolean insertar(Libro libro) {
		return listaLibros.add(libro);
	}
	public boolean eliminar(String isbn) {
		Libro libroBuscar = new Libro (isbn);
		return listaLibros.remove(libroBuscar);
	}
	public List<Libro> ordernarPorPrecio() {
		List<Libro> listaLibroAux = new LinkedList<Libro>();
		listaLibroAux.addAll(listaLibros);
		Collections.sort(listaLibroAux, new ordernarLibroPorPrecio());
		return listaLibroAux;
	}

//	public Libro consulta2(String isbn) {
//		for(Libro libro : listaLibros) {
//			if(libro.getIsbn().equals(isbn)) {
//				
//			}
//		}
//	}
}
