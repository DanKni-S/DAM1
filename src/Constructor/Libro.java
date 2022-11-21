package Constructor;

public class Libro {

	private String titulo;
	private int numeroEjemplar;
	private double precio;

	// Constructor con 3 parámetros
	public Libro(String titulo, int numeroEjemplar, double precio) {
		this.titulo = titulo;
		this.numeroEjemplar = numeroEjemplar;
		this.precio = precio;
	}

	public String obtenerEstado() {
		return "Libro [ Título = " + titulo + ", NúmeroEjemplares = " + numeroEjemplar + ", Precio = "
				+ String.format("%.2f", precio) + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumeroEjemplar() {
		return numeroEjemplar;
	}

	public double getPrecio() {
		return precio;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroEjemplar(int numeroEjemplar) {
		this.numeroEjemplar = numeroEjemplar;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
