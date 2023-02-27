package Actividades6;

import java.util.Random;

public class Fermentada extends Alcoholica{
	
	protected static final String[] NOMBRES = {"sidras", "cerveza", "vino", "sake", "hidromiel"};

	public Fermentada (String nombre, double graduacionAlcohol) {
		super(nombre, graduacionAlcohol);
	}
	public Fermentada() {
		super(generarNombre(), generarGraduacion());
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES [aleatorio.nextInt(NOMBRES.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		// entre 3.5 y 15
		return aleatorio.nextDouble() * (15 - 3.5) + 3.5;
	}
	
	@Override
	public String toString() {
		return "Destilada [codigo = " + codigo + ", nombre = " + nombre + ", graduacionAlcohol = " + String.format("%f.1", graduacionAlcohol) + "]";
	}
	public double Precio() {
		return 5 + (graduacionAlcohol / 10);
	}
}
