package UD03;

public class Peliculas {

	//atributos
	private String nombre;
	private int duracion;
	private boolean dobladaCastellano;
	private double puntuacion;
	
	public String getTitulo() {
		return nombre;
	}
	public void setTitulo(String titulo) {
		this.nombre = titulo;
	}
	public int getMinutosDuracion() {
		return duracion;
	}
	public void setMinutoDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean getdobladoCastellano() {
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
}
