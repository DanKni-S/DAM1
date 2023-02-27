package Actividades6;

public abstract class Alcoholica extends Bebidas {
	
	protected double graduacionAlcohol;

	public Alcoholica(String nombre, double graduacionAlcohol) {
		super(nombre);
		this.graduacionAlcohol = graduacionAlcohol;
	}

	@Override
	public String toString() {
		return "Alcoholica [codigo = " + codigo + ", nombre = " + nombre + "graduacionAlcohol = " + String.format("%f.1", graduacionAlcohol) + "]";
	}
	
}
