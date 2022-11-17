package Constructor;

public class Personas {

	private String nombre;
	private String apellido;
	private int edad;
	private int altura;
	private boolean activo;

	// Constructor 1
	public Personas(String nombre, String apellido, int edad, int altura, boolean activo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.activo = activo;
	}

	// Constructor 2
	public Personas(String nombre, String apellido, int edad, int altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.activo = false;
	}

	// Constructor 3
	public Personas() {
		this.nombre = "Recién";
		this.apellido = "Nacido";
		this.edad = 0;
		this.altura = 50;
		this.activo = false;
	}

	public String obtenerEstado() {
		return "Persona [Nombre = " + nombre + ", Apellido = " + apellido + ", Edad = " + edad + ", Altura = " + altura
				+ ", Activo = " + activo + "]";
	}

}
