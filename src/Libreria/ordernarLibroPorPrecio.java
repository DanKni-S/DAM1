package Libreria;

import java.util.Comparator;

public class ordernarLibroPorPrecio implements Comparator<Libro> {
	
	@Override
	public int compare(Libro libro1, Libro libro2) {
		double precio1 = libro1.getPrecio();
		double precio2 = libro2.getPrecio();
		return (int) ((precio1 - precio2) * 100);
	}
}
