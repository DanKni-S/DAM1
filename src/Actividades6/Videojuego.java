package Actividades6;

public class Videojuego {
	// Atributo de clase para contar Videojuegos
	private static int total = 0;
	
	private int codigo;
	private String titulo;
	private double precio;
	private int cantidad;
	
	public Videojuego(String titulo, double precio) {
		total++;
		this.codigo = total;
		this.titulo = titulo;
		this.precio = precio;
		this.cantidad = 10;
	}
	@Override
	public String toString() {
		return "Videojuego [Código = " + codigo + ", Título = " + titulo + ", Precio = " + String.format("%.2f", precio) + ", Cantidad = " + cantidad + "] ";
	}
}
