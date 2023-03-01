package Libreria;

import java.util.Objects;

public class Libro {
	private static int total = 0;
	
	private String isbn;
	private String titulo;
	private String escritor;
	private int anyoPubli;
	private int stock;
	private double precio;
	
	public Libro(String isbn) {
		this.isbn = isbn;
	}
	
	public Libro(String isbn, String titulo, String escritor, int anyoPubli, int stock, double precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.escritor = escritor;
		this.anyoPubli = anyoPubli;
		this.stock = stock;
		this.precio = precio;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String iSBN) {
		isbn = isbn;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [ISBN = " + isbn + ", Titulo = " + titulo + ", Escritor=" + escritor + ", Año de Publicación = " + anyoPubli
				+ ", Stock = " + stock + ", Precio = " + String.format("%f.2", precio) + "]";
	}
}
