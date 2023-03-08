package Ejercicio_UsuariosWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Coleccion {
	
	private List<Usuarios> listaUsuarios;

	public Coleccion() {
		this.listaUsuarios = new ArrayList<Usuarios>();
	}
	// Consultar todos los usuarios
	public String toString() {
		String cadena = "";
		if(listaUsuarios.isEmpty()) {
			cadena = "La lista esta vacía. ";
		}else {
			for(int pos = 0 ; pos < listaUsuarios.size() ; pos++) {
				Usuarios usuario = listaUsuarios.get(pos);
				cadena = cadena + "(" + pos + ")" + usuario.toString() + "\n";
			}
			cadena = cadena + listaUsuarios.size() + " Usuarios consultados. ";
		}
		return cadena;
	}
	
	// insertar un usuario
	public boolean insertar(Usuarios usuario) {
		return listaUsuarios.add(usuario);
	}
	
	// Verificar un usuario por correo
	public Usuarios consultarPorCorreo(String correo) {
		for(int pos = 0 ; pos < listaUsuarios.size() ; pos++) {
			Usuarios usuario = listaUsuarios.get(pos);
			if(usuario.getCorreo().equals(correo)) {
				return usuario;
			}
		}
		return null;
	}
	
	// Ordenados por nombre con una lista auxiliar
	public List<Usuarios> ordenarPorNombreAsc() {
		List<Usuarios> listaAux = new LinkedList<Usuarios>();
		listaAux.addAll(listaUsuarios);
		Collections.sort(listaAux, new OrdenUsuarioPorNombreAsc());
		return listaAux;
	}
	
	// Cambiar nombre y contraseña del usuario
	public Usuarios cambiarNC(String nombre, String passw, Usuarios usuario) {
		Usuarios usuarioZ = usuario;
		usuarioZ.setNombre(nombre);
		usuarioZ.setPassw(passw);
		return usuarioZ;
	}
	
	// Eliminar un usuario
	public boolean eliminar(Usuarios usuario) {
		Usuarios usuarioB = usuario;
		if (listaUsuarios.remove(usuarioB)) {
			return true;
		}
		return false;
	}
	
	
}
