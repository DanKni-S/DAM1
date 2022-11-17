package Constructor;

public class Videojuego {
	
	// Atributos
	private String nombre;
	private String desarrollador;
	private int year;
	private int maxJugadores = 1;
	
	// Constructor 1
	public Videojuego (String nombre, String desarrollador, int year, int maxJugadores) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.year = year;
		this.maxJugadores = maxJugadores;
	}
}
