package Actividades6;

public class Limpiador extends Empleado {
	
	// Atributos
	private boolean limpiaOficina;
	private boolean limpiaAutobus;
	private boolean limpiaGaraje;
	
	public Limpiador(String nif, String nombre, String fechaNacimiento, String direccion, String telefono, String email, boolean limpiaOficina, boolean limpiaAutobus, boolean limpiaGaraje) {
		super(nif, nombre, fechaNacimiento, direccion, telefono, email);
		this.limpiaOficina = limpiaOficina;
		this.limpiaAutobus = limpiaAutobus;
		this.limpiaGaraje = limpiaGaraje;
	}
	
	public boolean isLimpiaOficina() {
		return limpiaOficina;
	}
	
	public void setLimpiaOficina(boolean limpiaOficina) {
		this.limpiaOficina = limpiaOficina;
	}
	
	public boolean isLimpiaAutobus() {
		return limpiaAutobus;
	}
	
	public void setLimpiaAutobus(boolean limpiaAutobus) {
		this.limpiaAutobus = limpiaAutobus;
	}
	
	public boolean isLimpiaGaraje() {
		return limpiaGaraje;
	}
	
	public void setLimpiaGaraje(boolean limpiaGaraje) {
		this.limpiaGaraje = limpiaGaraje;
	}
	
	@Override
	public String toString() {
		return "Limpiador [" + super.obtenerEstado() + "\n" + " Limpia Oficina = " + limpiaOficina + ", Limpia Autobus = " + limpiaAutobus + ", Limpia Garaje = " + limpiaGaraje + "]";
	}
}
