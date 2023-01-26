package UD06;

public class Delegado extends Estudiante {
	
	// Atributos
	private String grupo;
	
	// Constructor
	public Delegado(String dni, String nombre, int numeroExpediente, String estudios, String grupo) {
		super(dni, nombre, numeroExpediente, estudios);
		this.grupo = grupo;
	}
	
	// Devuelve una cadena de caracteres con el estado del delegado
	
	@Override
	public String toString() {
		return "Delegado [" + super.obtenerEstado() + ", Grupo = " + grupo + "]";
	}
}
