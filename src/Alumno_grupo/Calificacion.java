package Alumno_grupo;

public class Calificacion {
	
	private String modulo;
	private double nota;
	
	public Calificacion(String modulo, double nota) {
		this.modulo = modulo;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Calificacion [modulo=" + modulo + ", nota=" + nota + "]";
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
