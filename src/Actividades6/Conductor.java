package Actividades6;

public class Conductor extends Empleado {
	
	// Atributos
	private int numeroCarnet;
	private int yearcap;
	
	public Conductor(String nif, String nombre, String fechaNacimiento, String direccion, int telefono, String email) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		this.numeroCarnet = numeroCarnet;
		this.yearcap = yearcap;
	}

	@Override
	public String toString() {
		return "Conductor [" + super.obtenerEstado() +"numeroCarnet = " + numeroCarnet + ", yearcap = " + yearcap + "]";
	}
	
}
