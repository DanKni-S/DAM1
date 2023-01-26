package UD06;

public class jefeDepartamento extends Empleado{
	
	// Atributos
	private String departamento;
	
	// Constructor
	public jefeDepartamento(String dni, String nombre, String profesion, boolean tieneCargo, double salario, String departamento) {
		super(dni, nombre, profesion, tieneCargo, salario);
		this.departamento = departamento;
	}
	// Devuelve una cadena con el estado del jefe de departamento
	@Override
	public String toString() {
		return "jefeDepartamento [" + super.obtenerEstado() + ", Departamento = " + departamento + "]";
	}
	
}
