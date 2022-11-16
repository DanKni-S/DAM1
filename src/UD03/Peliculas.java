package UD03;

public class Peliculas {

	// atributos
	private String nombre;
	private int duracion;
	private boolean dobladaCastellano;
	private double puntuacion;

	// Contructor

	public Peliculas(String nombre, int duracion, boolean dobladaCastellano, double puntuacion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.dobladaCastellano = dobladaCastellano;
		this.puntuacion = puntuacion;
	}

	// método de acceso a atributo (getters) (para obtenerlos)
	public String getNombre() {
		return nombre;
	}

	// método de acceso a atributo (setters) (para modificarlos)
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean getdobladaCastellano() {
		return dobladaCastellano;
	}

	public void setdobladaCastellano(boolean dobladaCastellano) {
		this.dobladaCastellano = dobladaCastellano;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	// Devuelve una cadena de caracteres con el estado del objeto
	public String obtenerEstado() {
		return
			"Peliculas [Nombre = " + nombre +", Duración = " + duracion + ", DobladaCastellano = " + dobladaCastellano + ", Puntuación = " + puntuacion + "]";
	}
}
