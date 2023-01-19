package Actividades6;

import entrada.Teclado;

public class Ejercicio1x01 {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0)  ");
		System.out.println("(1)  ");
		System.out.println("(2)  ");
		System.out.println("(3)  ");
		System.out.println("(4)  ");
		System.out.println();
	}

	public static void main(String[] args) {
		int opcion, posicion;
		double precio;
		String titulo;
		Videojuego videojuego;
		Almacen almacen = new Almacen(20);
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción (0 - 4)?");
			switch(opcion) {
			case 0:
				break;
			case 1:
				titulo =  Teclado.leerCadena("¿Título? ");
				precio =  Teclado.leerReal("¿Precio? ");
				videojuego = new Videojuego(titulo, precio);
				if(almacen.insertar(videojuego)) {
					System.out.println("Se ha insertado el videojuego en el almacén con éxito.  ");
				}
				else {
					System.err.println("Error al inserar: almacén lleno. ");
				}
				break;
			case 2:
				posicion = Teclado.leerEntero("¿Posición? ");
				if(almacen.eliminar(posicion)) {
					System.out.println("Se ha eliminado el videojuego del almacén con éxito. ");
				}
				else {
					System.out.println("Error al eliminar: almacén vacío o posición no indica videojuego en el almacén. ");
				}
				break;
			case 3:
				posicion = Teclado.leerEntero("¿Posicion?" );
				videojuego = almacen.consultar(posicion);
				if(videojuego == null) {
					
				}
				break;
			case 4:
				System.out.println(almacen.toString());
				break;
			default:
				System.out.println("La opción de menu debe estar comprendido entre 0 y 4");
				break;
			}
			
		}while(opcion != 0);

	}

}
