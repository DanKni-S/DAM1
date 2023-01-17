package UD06;

public class EjemploPersona {
	
	private String nombre;
	private EjemploFecha fechaNacimiento;
	
	public EjemploPersona(String nombre, int dia, int mes, int year) {
		this.nombre = nombre;
		this.fechaNacimiento = new EjemploFecha(dia,mes,year);
	}
	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + "]";
	}
}
