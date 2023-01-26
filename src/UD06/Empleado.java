package UD06;

public class Empleado extends Persona {
	// Atributos
	private String profesion;
	private boolean tieneCargo;
	private double salario;
	
	public Empleado(String dni, String nombre, String profesion, boolean tieneCargo, double salario) {
		super(dni, nombre);
		this.profesion = profesion;
		this.tieneCargo = tieneCargo;
		this.salario = salario;
	}
	
	@Override
	public String obtenerEstado() {
		return super.obtenerEstado() + ", Profesion = " + profesion + ", Tiene Cargo = " + tieneCargo + ", Salario = " + String.format("%.2f", salario);
	}
	
	@Override
	public String toString() {
		return "Empleado [" + super.obtenerEstado() + ", Profesion = " + profesion + ", Tiene Cargo = " + tieneCargo + ", Salario = " + String.format("%.2f", salario) + "]";
	}
}
