package Ejercicio_UsuariosWeb;

import java.util.List;

import entrada.Teclado;

public class Principal {

	public static void escribirMenu() {
		System.out.println();
		System.out.println("(1) Insertar un administrador en la colección. ");
		System.out.println("(2) Insertar un comprador en la colección. ");
		System.out.println("(3) Consultar todos los usuarios de la colección. ");
		System.out.println("(4) Consultar un usuario, por correo, de la colección. ");
		System.out.println("(5) Actualizar el nombre y la contraseña de un usurio, por correo, de la colección. ");
		System.out.println("(6) Eliminar un usuario, por correo, de la colección. ");
		System.out.println("(7) Consultar todos los usuarios de la colección, ordenados por nombre ascendente. ");
		System.out.println(
				"(8) Consultar los usuarios que tengan una contraseña débil (6 o menos caracteres), de la colección. ");
		System.out.println("(9) Consultar los compradores de la colección. ");
		System.out.println(
				"(10) Consultar los compradores que incluyan una ciudad en la dirección de envío, de la colección. ");
		System.out.println(
				"(11) Consultar los compradores con la lista de productos favoritos más larga de la colección. ");
		System.out.println("(12) Consultar los administradores de la colección. ");
		System.out.println("(13) Consultar los administradores de una categoría, de la colección. ");
		System.out.println("(14) Consultar los administradores que no revisan comentarios, de la colección. ");
		System.out.println(
				"(15) Añadir un producto a la lista de favoritos de un comprador, por correo, de la colección. ");
		System.out.println(
				"(16) Quitar un producto de la lista de favoritos de un comprador, por correo, de la colección. ");
		System.out.println();
	}
	public static void escribirLista(List<Usuarios> lista) {
		if (lista.isEmpty()) {
			System.out.println("");
		} else {
			for (Usuarios usu : lista) {
				System.out.println(usu.toString());
			}
		}
	}
	public static void main(String[] args) {
		Coleccion coleccion = new Coleccion(); // Fundamental
		int opcion;
		String nombre, correo, passwd, categoria, tarjeta, direccion;
		boolean revisaComentario;
		Usuarios usuario;
		List<Usuarios> listaAux;

		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Selecciona opción? ");
			switch (opcion) {
			case 0:
				// Salir de Programa
				break;
			case 1:
				// Insertar un administrador en la colección.
				correo = Teclado.leerCadena("Correo? ");
				usuario = coleccion.consultarPorCorreo(correo);
				
				if (usuario == null) {
					nombre = Teclado.leerCadena("Nombre? ");
					passwd = Teclado.leerCadena("Contraseña? ");
					categoria = Teclado.leerCadena("Categoria? ");
					revisaComentario = Teclado.leerBooleano("Revisa comentarios? ");
					usuario = new Administrador(nombre, correo, passwd, categoria, revisaComentario);
					if (coleccion.insertar(usuario)) {
						System.out.println("Administrador insertado. ");
					} else {
						System.err.println("Error al insertar un administrador. ");
					}
				} else {
					System.err.println("Usuario ecnontrado con correo identico. ");
				}
				break;
			case 2:
				// Insertar un comprador en la colección.
				correo = Teclado.leerCadena("Correo? ");
				usuario = coleccion.consultarPorCorreo(correo);
				if (usuario == null) {
					nombre = Teclado.leerCadena("Nombre? ");
					passwd = Teclado.leerCadena("Contraseña? ");
					tarjeta = Teclado.leerCadena("Tarjeta? ");
					direccion = Teclado.leerCadena("Dirección? ");
					usuario = new Comprador(nombre, correo, passwd, tarjeta, direccion);
					if (coleccion.insertar(usuario)) {
						System.out.println("Comprador insertado. ");
					} else {
						System.out.println("Error al insertar un comprador. ");
					}
				} else {
					System.out.println("Usuario encontradoc con correo identico. ");
				}
				break;
			case 3:
				// Consultar todos los usuarios de la colección.
				if (coleccion == null) {
					System.err.println("No hay usuarios en la lista. ");
				} else {
					System.out.println(coleccion.toString());
				}
				break;
			case 4:
				// Consultar un usuario, por correo, de la colección.
				if(coleccion == null) {
					System.out.println("No hay usuarios en la lista. ");
				}else {
					correo = Teclado.leerCadena("Correo? ");
					usuario = coleccion.consultarPorCorreo(correo);
					if(usuario == null) {
						System.out.println("No se ha encontrado ningun usuario con el correo indicado. ");
					}else {
						System.out.println(usuario.toString());
					}
				}
				break;
			case 5:
				// Actualizar el nombre y la contraseña de un usurio, por correo, de la colección.
				correo = Teclado.leerCadena("Correo? ");
				usuario = coleccion.consultarPorCorreo(correo);
				if(usuario == null) {
					System.out.println("No se ha encontrado ningun usuario con el correo indicado. ");
				}else {
					nombre = Teclado.leerCadena("Nombre? ");
					passwd = Teclado.leerCadena("Contraseña? ");
					coleccion.cambiarNC(nombre, passwd, usuario);
					System.out.println("Se han cambiado el nombre y contraseña del usuario. ");
					System.out.println(usuario.toString());
				}
				break;
			case 6:
				// Eliminar un usuario, por correo, de la colección.
				correo = Teclado.leerCadena("Correo? ");
				usuario = coleccion.consultarPorCorreo(correo);
				if(usuario == null) {
					System.out.println("No se ha encontrado ningun usuario con el correo indicado. ");
				}else {
					System.out.println(coleccion.eliminar(usuario));
					System.out.println("Se ha eliminado el usuario. ");
					System.out.println(usuario.toString());
				}
				break;
			case 7:
				// Consultar todos los usuarios de la colección, ordenados por nombre
				// ascendente.
				listaAux = coleccion.ordenarPorNombreAsc();
				escribirLista(listaAux);
				break;
			case 8:
				// Consultar los usuarios que tengan una contraseña débil (6 o menos caracteres), de la colección.
				
				break;
			case 9:
				// Consultar los compradores de la colección.
				if (coleccion == null) {
					System.err.println("No hay usuarios en la lista. ");
				} else {
					
				}
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
			case 16:
				break;
			}
		} while (opcion != 0);
	}

}
