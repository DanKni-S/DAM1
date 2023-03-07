package Ejercicio_UsuariosWeb;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuarios {
	
	private String tarjeta;
	private String direccion;
	private List<String> listaProducto;
	
	public Comprador(String nombre, String correo, String passw, String tarjeta, String direccion) {
		super(nombre, correo, passw);
		this.tarjeta = tarjeta;
		this.direccion = direccion;
		this.listaProducto = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Comprador [Nombre = " + nombre + ", Correo = " + correo + ", Password = " + passw + ", Tarjeta = " + tarjeta
				+ ", Dirección = " + direccion + ", Lista Producto = " + listaProducto + "]";
	}
	
}
