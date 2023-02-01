package Prueba;

public class Producto {
	private static int total = 0;
	
	private int codigo;
	private String nombre;
	private int diasCaducar;

	public Producto(String nombre, int diasCaducar) {
		total++;
		this.codigo = total;
		this.nombre = nombre;
		this.diasCaducar = diasCaducar;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	@Override
	public String toString() {
		return "Producto [Codigo = " + codigo + ", Nombre = " + nombre + ", Dias de Caducidad = " + diasCaducar + "]" + "\n";
	}
	
	public boolean caducado() {
		if(diasCaducar <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
}
