package Ejercicio_UsuariosWeb;

import java.util.Objects;

public abstract class Usuarios {
	protected String nombre;
	protected String correo; // Identificador unico
	protected String passw;
	
	public Usuarios(String correo) {
		this.correo = correo;
	}
	
	public Usuarios(String nombre, String correo, String passw) {
		this.nombre = nombre;
		this.correo = correo;
		this.passw = passw;
	}
	@Override
	public String toString() {
		return "Usuarios [Nombre = " + nombre + ", Correo = " + correo + ", Password = " + passw + "]";
	}
	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public String getPassw() {
		return passw;
	}

	@Override
	public int hashCode() {
		return Objects.hash(correo);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Usuarios)) {
			return false;
		}
		Usuarios other = (Usuarios) obj;
		return Objects.equals(correo, other.correo);
	}
}
