package Libreria;

import java.util.Objects;

public class Libro {
	private static int total = 0;
	
	private int ISBN;
	private String titulo;
	private String escritor;
	private int anyoPubli;
	private int stock;
	private double precio;
	
	public Libro(int iSBN, String titulo, String escritor, int anyoPubli, int stock, double precio) {
		super();
		total++;
		this.ISBN = total;
		this.titulo = titulo;
		this.escritor = escritor;
		this.anyoPubli = anyoPubli;
		this.stock = stock;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [ISBN = " + ISBN + ", Titulo = " + titulo + ", Escritor=" + escritor + ", Año de Publicación = " + anyoPubli
				+ ", Stock = " + stock + ", Precio = " + String.format("%f.2", precio) + "]";
	}
//	@Override
//	public int hasCode() {
//		return Objects.hash(ISBN);
//	}
//	@Override
//	public boolean equals(Objects obj) {
//		if(this == obj);
//		return true;
//		if(obj instanceof Libro) {
//			return false;
//		}
//		Libro other = (Libro) obj;
//		return Objects.equals(ISBN, other.ISBN);
//	}
}
