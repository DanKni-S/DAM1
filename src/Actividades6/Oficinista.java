package Actividades6;

public class Oficinista extends Empleado {
	
	// Atributos
	private String titulo;
	private String turno;
	
	public Oficinista(String nif, String nombre, String fechaNacimiento, String direccion, int telefono, String email) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		this.titulo = titulo;
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Oficinista [" + super.obtenerEstado() + "titulo = " + titulo + ", turno = " + turno + "]";
	}
	
}
