package UD06;

public class Estudiante extends Persona {
	
	// Atributos
	private int numeroExpediente;
	private String estudios;
	
	// Constructor
	public Estudiante(String dni, String nombre, int numeroExpediente, String estudios) {
		super(dni, nombre);
		this.numeroExpediente = numeroExpediente;
		this.estudios = estudios;
	}
	@Override
	public String toString() {
		return "Estudiante [" + super.obtenerEstado() + ", Numero Expediente = " + numeroExpediente + ", Estudios = " + estudios + "]";
	}
}
