package Actividades6;

public class Limpiador extends Empleado {
	
	// Atributos
	private boolean limpiaOficina;
	private boolean limpiaAutobus;
	private boolean limpiaGaraje;
	
	public Limpiador(String nif, String nombre, String fechaNacimiento, String direccion, int telefono, String email, boolean limpiaOficina, boolean limpiaAutobus, boolean limpiaGaraje) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		this.limpiaOficina = limpiaOficina;
		this.limpiaAutobus = limpiaAutobus;
		this.limpiaGaraje = limpiaGaraje;
	}
}
