package UD06;

public class Persona {
	
	// Atributos
	private String dni;
	private String nombre;
	
	// Constructor
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public String obtenerEstado() {
		return "DNI = " + dni + ", Nombre = " + nombre;
	}

	@Override
	public String toString() {
		return "Persona [DNI = " + dni + ", Nombre = " + nombre + "]";
	}
	
}
