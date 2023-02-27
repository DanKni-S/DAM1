package Lista_personas;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	
	private String dni;
	private String nombres;
	private String apellidos;
	private int edad;
	
	public Persona(String dni, String nombres, String apellidos, int edad) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [DNI = " + dni + ", Nombres = " + nombres + ", Apellidos = " + apellidos + ", Edad = " + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Persona) {
			return false;
		}
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
}
