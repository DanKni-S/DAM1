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

	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "Comprador [Nombre = " + nombre + ", Correo = " + correo + ", Password = " + passw + ", Tarjeta = "
				+ tarjeta + ", Dirección = " + direccion + ", Lista Producto = " + listaProducto + "]";
	}

	public boolean insertar(String producto) {
		if (listaProducto.contains(producto)) {
			return false;
		} else {
			return listaProducto.add(producto);
		}
	}

	// En la clase correspondiente, porque es el que gestiona la lista
	public int obtenerTamanoLista() {
		return listaProducto.size();
	}

	public boolean eliminarProductoLista(String producto) {
		if (listaProducto.remove(producto)) {
			return true;
		} else {
			return false;
		}
	}
}
