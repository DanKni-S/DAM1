package Actividades6;

import java.util.Random;

import entrada.Teclado;

public class Ejercicio2x02 {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir de programacion ");
		System.out.println("(1) Insertar un refresco en el inventario ");
		System.out.println("(2) Insertar una bebida aleatoria en el inventario ");
		System.out.println("(3) Rellenar el inventario con bebidas aleatorias ");
		System.out.println("(4) Consultar todas las bebidas del inventario ");
		System.out.println("(5) Consultar un tipo de bebida del inventario ");
		System.out.println("(6) Consultar las bebidas entres 2 precios ");
		System.out.println("(7) Consultar el número de refrescos gaseoso del inventario ");
		System.out.println();
	}

	public static void main(String[] args) {
		int opcion, tipo, contRefr, contFerm, contDest;
		String nombre;
		double cantidadAzucar;
		boolean tieneGas;
		Inventario inventario = new Inventario(20);
		Random aleatorio = new Random();
		Bebidas bebida = null;
		Refresco refresco;
		Fermentada  fermentada;
		Destilada destilada;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción? ");
			switch(opcion) {
			
			case 0:
				break;
			case 1:
				// Insertar un refresco en el inventario
				nombre = Teclado.leerCadena("Introduce el nombre? ");
				cantidadAzucar = Teclado.leerReal("Cantidad de Azucar? ");
				tieneGas = Teclado.leerBooleano("Tiene Gas? ");
				refresco = new Refresco(nombre, tieneGas, cantidadAzucar);
				if(inventario.insertar(refresco)) {
					System.out.println("Refresco insertado. ");
				}
				else {
					System.err.println("Refresco no insertado. ");
				}
				break;
			case 2:
				
				tipo = aleatorio.nextInt(3);
				if(tipo == 0) {
					refresco = new Refresco();
					// inventario.insertar(refresco);
				}
				else if (tipo == 1) {
					fermentada = new Fermentada();
					// inventario.insertar(fermentada);
				}
				else {
					destilada = new Destilada();
					// inventario.insertar(destilada);
				}
				if(inventario.insertar(bebida)) {
					System.out.println("Bebida insertada. ");
				}
				else {
					System.err.println("Bebida no insertada. ");
				}
				
				break;
			case 3:
				contRefr = 0;
				contFerm = 0;
				contDest = 0;
				
				while(! inventario.estaLleno()) {
					tipo = aleatorio.nextInt(3);
					if(tipo == 0) {
						refresco = new Refresco();
						// inventario.insertar(refresco);
						if(inventario.insertar(bebida)) {
							contRefr++;
						}
					}
					else if (tipo == 1) {
						fermentada = new Fermentada();
						// inventario.insertar(fermentada);
						if(inventario.insertar(bebida)) {
							contFerm++;
						}
					}
					else {
						destilada = new Destilada();
						// inventario.insertar(destilada);
						if(inventario.insertar(bebida)) {
							contDest++;
						}
					}
					if(inventario.insertar(bebida)) {
						System.out.println("Bebida insertada. ");
					}
				}
				System.out.println(contRefr + " Refrescos insertados. ");
				System.out.println(contFerm + " Fermentadas insertadas. ");
				System.out.println(contDest + " Destiladas insertadas. ");
				break;
			case 4:
				if(inventario.estaVacio()) {
					System.out.println("Inventario vació.  ");
				}
				else {
					System.out.println(inventario.bebidaGuardada() + " Bebidas guardadas. ");
					System.out.println(inventario.toString());
				}
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				contRefr = inventario.contarGaseosos();
				System.out.println(contRefr + " Refrescos Gaseosos ");
				// Consultar el numero de refrescos graseosos del invnetario
				break;
			default:
				System.err.println("La opcion debe estar comprendida entre 0 y 7. ");
			}
		}while(opcion != 0);
			System.out.println("Programa finalizado");
	}

}
