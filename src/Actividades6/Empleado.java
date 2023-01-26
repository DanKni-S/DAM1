package Actividades6;

public class Empleado {
	
	// Atributos
	private String nif;
	private String nombre;
	private String fechaNacimiento;
	private String direccion;
	private int telefono;
	private String email;
	
	// Constructor
	public Empleado(String nif, String nombre, String fechaNacimiento, String direccion, int telefono, String email) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String obtenerEstado() {
		return "NIF = " + nif + ", Nombre = " + nombre + ", Fecha de Nacimiento = " + fechaNacimiento + ", Dirección = " + direccion + ", Teléfono = " + telefono + ", Email = " + email;
	}

	@Override
	public String toString() {
		return "Empleado [nif = " + nif + ", nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + ", direccion = "
				+ direccion + ", telefono = " + telefono + ", email = " + email + "]";
	}
	
}
