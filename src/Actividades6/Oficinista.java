package Actividades6;

public class Oficinista extends Empleado {
	
	// Atributos
	private String titulo;
	private String turno;
	
	public Oficinista(String nif, String nombre, String fechaNacimiento, String direccion, String telefono, String email) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		this.titulo = titulo;
		if(turno.equals("diurno") || turno.equals("vespertino") || turno.equals("noturno")) {
			this.turno = turno;
		}
		else {
			this.turno = "diurno";
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if(turno.equals("diurno") || turno.equals("vespertino") || turno.equals("noturno")) {
			this.turno = turno;
		}
		else {
			this.turno = "diurno";
		}
	}
	
	@Override
	public String toString() {
		return "Oficinista [" + super.obtenerEstado() + "\n" + " Titulo = " + titulo + ", Turno = " + turno + "]";
	}
}
