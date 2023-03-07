package Ejercicio_UsuariosWeb;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Coleccion {
	
	private List<Usuarios> listaUsuarios;

	public Coleccion() {
		this.listaUsuarios = new LinkedList<Usuarios>();
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
}
