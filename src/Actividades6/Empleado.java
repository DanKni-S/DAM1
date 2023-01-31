package Actividades6;

public class Empleado {
	
	// Atributos
	private String nif;
	private String nombre;
	private String fechaNacimiento;
	private String direccion;
	private String telefono;
	private String email;
	
	// Constructor
	public Empleado(String nif, String nombre, String fechaNacimiento, String direccion, String telefono, String email) {
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
