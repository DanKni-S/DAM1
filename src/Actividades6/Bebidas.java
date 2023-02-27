package Actividades6;

public abstract class Bebidas {
	private static int total = 0;
	protected int codigo;
	protected String nombre;
	
	public Bebidas(String nombre) {
		total++;
		this.codigo = total;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Bebidas [Codigo = " + codigo + ", Nombre = " + nombre + "]";
	}
	
	public abstract double Precio();
}
