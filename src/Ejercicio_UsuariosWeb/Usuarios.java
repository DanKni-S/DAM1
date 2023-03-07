package Ejercicio_UsuariosWeb;

public abstract class Usuarios {
	protected String nombre;
	protected String correo; // Identificador unico
	protected String passw;
	
	public Usuarios(String nombre, String correo, String passw) {
		this.nombre = nombre;
		this.correo = correo;
		this.passw = passw;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}
	@Override
	public String toString() {
		return "Usuarios [Nombre = " + nombre + ", Correo = " + correo + ", Password = " + passw + "]";
	}
}
