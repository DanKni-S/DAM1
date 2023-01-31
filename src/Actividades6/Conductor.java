package Actividades6;

public class Conductor extends Empleado {
	
	private static int numeroMaximoCap = 15;
	// Atributos
	private int numeroCarnet;
	private int yearcap;
	
	public Conductor(String nif, String nombre, String fechaNacimiento, String direccion, String telefono, String email) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		if(numeroCarnet > 0 && numeroCarnet <= numeroMaximoCap) {
			this.numeroCarnet = numeroCarnet;
		}
		else {
			this.numeroCarnet = 0;
		}
		this.yearcap = yearcap;
	}

	public int getNumeroCarnet() {
		return numeroCarnet;
	}

	public void setNumeroCarnet(int numeroCarnet) {
		if(numeroCarnet >= 0 && numeroCarnet <= numeroMaximoCap) {
			this.numeroCarnet = numeroCarnet;
		}
		else {
			this.numeroCarnet = 1;
		}
	}

	public int getYearcap() {
		return yearcap;
	}

	public void setYearcap(int yearcap) {
		this.yearcap = yearcap;
	}
	
	@Override
	public String toString() {
		return "Conductor [" + super.obtenerEstado() + "\n" + "Numero de Carnet = " + numeroCarnet + ", Año de CAP = " + yearcap + "]";
	}
}
