package Ejercicio_UsuariosWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Libreria.Libro;

public class Coleccion {

	private List<Usuarios> listaUsuarios;

	public Coleccion() {
		this.listaUsuarios = new ArrayList<Usuarios>();
	}

	// Consultar todos los usuarios
	public String toString() {
		String cadena = "";
		if (listaUsuarios.isEmpty()) {
			cadena = "La lista esta vacía. ";
		} else {
			for (int pos = 0; pos < listaUsuarios.size(); pos++) {
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
		for (int pos = 0; pos < listaUsuarios.size(); pos++) {
			Usuarios usuario = listaUsuarios.get(pos);
			if (usuario.getCorreo().equals(correo)) {
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

	// Consultar con contraseña debil
	public List<Usuarios> consultarContraseniaDebil() {
		List<Usuarios> listAux = new LinkedList<Usuarios>();
		if (listaUsuarios.isEmpty()) {
			System.out.println("La lista esta vacia ");
		} else {
			for (Usuarios usuario : listaUsuarios) {
				if (usuario.getPassw().length() <= 8) {
					listAux.add(usuario);
				}
			}
		}
		return listAux;
	}

	// Consultar los compradores
	public List<Usuarios> consultarComprador() {
		List<Usuarios> listAux = new LinkedList<Usuarios>();
		if (listaUsuarios.isEmpty()) {
			System.out.println("La lista esta vacia ");
		} else {
			for (Usuarios usuario : listaUsuarios) {
				if (usuario instanceof Comprador comprador) {
					listAux.add(usuario);
				}
			}
		}
		return listAux;
	}

	// Consultar los Administradores
	public List<Usuarios> consultarAdmin() {
		List<Usuarios> listAux = new LinkedList<Usuarios>();
		if (listaUsuarios.isEmpty()) {
			System.out.println("La lista esta vacia ");
		} else {
			for (Usuarios usuario : listaUsuarios) {
				if (usuario instanceof Administrador admin) {
					listAux.add(usuario);
				}
			}
		}
		return listAux;
	}

	// consultar la ciudad
	public List<Usuarios> consultarCiudad(String ciudad) {
		List<Usuarios> listAux = new LinkedList<Usuarios>();
		for (Usuarios usuario : listaUsuarios) {
			if (usuario instanceof Comprador) {
				Comprador comprador = (Comprador) usuario;
				if (comprador.getDireccion().contains(ciudad)) {
					listAux.add(usuario);
				}
			}
		}
		return listAux;
	}

	// Consultar el tamaño de la lista
	public List<Usuarios> consultarTamanoListaP() {
		int tamanoMaximo = 0;
		for (Usuarios usuario : listaUsuarios) {
			if (usuario instanceof Comprador) {
				Comprador comprador = (Comprador) usuario;
				int tamanoLista = comprador.obtenerTamanoLista();
				if (tamanoLista > tamanoMaximo) {
					tamanoMaximo = tamanoLista;
				}
			}
		}
		List<Usuarios> listAux = new LinkedList<Usuarios>();
		for (Usuarios usuario : listaUsuarios) {
			if (usuario instanceof Comprador) {
				Comprador comprador = (Comprador) usuario;
				int tamanoLista = comprador.obtenerTamanoLista();
				if (tamanoLista == tamanoMaximo) {
					listAux.add(usuario);
				}
			}
		}
		return listAux;
	}
	
	// 13 -  Consultar los Administradores de una categoria
	public List<Usuarios> consultarAdministradoresCategoria(String categoria){
        List<Usuarios> listAux  = new LinkedList<Usuarios>();
        if (listaUsuarios.isEmpty()) {
            System.out.println("La lista esta vacia ");
        }
        else{ 
            for(Usuarios usuario : listaUsuarios) {
                if(usuario instanceof Administrador administrador && 
                        ((Administrador) usuario).getCategoria().equals(categoria)){
                    listAux.add(usuario);
                }
            }
        }
        return listAux;
    }
	
	// 14 - Para saber si los Administradores revisan comentarios
	public List<Usuarios> administradoresRevisan(){
        List<Usuarios> listAux  = new LinkedList<Usuarios>();
        if (listaUsuarios.isEmpty()) {
            System.out.println("La lista esta vacia ");
        }
        else{ 
            for(Usuarios usuario : listaUsuarios) {
                if(usuario instanceof Administrador administrador && 
                    ((Administrador) usuario).isRevisaComentarios() == false ){
                    listAux.add(usuario);
                }
            }
        }
        return listAux;
    }
}
