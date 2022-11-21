package Constructor;

public class Videojuego {

	// Atributos
	private String nombre;
	private String desarrollador;
	private int year;
	private int maxJugadores;

	// Constructor 1
	public Videojuego(String nombre, String desarrollador, int year, int maxJugadores) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.year = year;
		this.maxJugadores = maxJugadores;
	}

	// Construcotr 2
	public Videojuego(String nombre, String desarrollador, int year) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.year = year;
		this.maxJugadores = 1;
	}
	// Constructor 3
	public Videojuego(String nombre, String desarrollador) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.year = 2021;
		this.maxJugadores = 1;
	}
	// Devulve una cadena de caracteres con el estador del Videojuego
	public String obtenerEstado() {
		return "Videojuego [Nombre = " + nombre + ", Desarrollador = " + desarrollador + ", Año = " + year
				+ ", Número Maximo de Jugadores = " + maxJugadores + "]";
	}
}
