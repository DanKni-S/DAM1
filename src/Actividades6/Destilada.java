package Actividades6;

import java.util.Random;

public class Destilada extends Alcoholica{
	
	protected static final String[] NOMBRES = {"anis", "pacharan", "ginebra", "cognac", "ron", "vodka", "whisky", "tequila"};

	public Destilada (String nombre, double graduacionAlcohol) {
		super(nombre, graduacionAlcohol);
	}
	
	public Destilada() {
		super(generarNombre(), generarGraduacion());
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES [aleatorio.nextInt(NOMBRES.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		// entre 3.5 y 45
		return aleatorio.nextDouble() * (45 - 3.5) + 3.5;
	}
	
	@Override
	public String toString() {
		return "Destilada [codigo = " + codigo + ", nombre = " + nombre + ", graduacionAlcohol = " + String.format("%f.1", graduacionAlcohol) + "]";
	}
	public double Precio () {
		return 12 + (graduacionAlcohol / 10);
	}
}
