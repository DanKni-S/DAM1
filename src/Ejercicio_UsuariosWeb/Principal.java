package Ejercicio_UsuariosWeb;

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
		System.out.println("(8) Consultar los usuarios que tengan una contraseña débil (6 o menos caracteres), de la colección. ");
		System.out.println("(9) Consultar los compradores de la colección. ");
		System.out.println("(10) Consultar los compradores que incluyan una ciudad en la dirección de envío, de la colección. ");
		System.out.println("(11) Consultar los compradores con la lista de productos favoritos más larga de la colección. ");
		System.out.println("(12) Consultar los administradores de la colección. ");
		System.out.println("(13) Consultar los administradores de una categoría, de la colección. ");
		System.out.println("(14) Consultar los administradores que no revisan comentarios, de la colección. ");
		System.out.println("(15) Añadir un producto a la lista de favoritos de un comprador, por correo, de la colección. ");
		System.out.println("(16) Quitar un producto de la lista de favoritos de un comprador, por correo, de la colección. ");
		System.out.println();
	}

	public static void main(String[] args) {
		int opcion;
		
		do {
			opcion = Teclado.leerEntero("");
			escribirMenu();
			switch(opcion) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
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
		}while(opcion != 0);
	}

}
