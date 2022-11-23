package Actividades3;

import entrada.Teclado;
import Constructor.Cuenta;

public class Ejercicio2x01 {
	public static void opcionesMenu() {
		System.out.println();
		System.out.println("0) Para salir ");
		System.out.println("1) Visualizar en consola las dos cuenta ");
		System.out.println("2) Ingresar un importe en la cuenta 1 ");
		System.out.println("3) Retirar un importe de la cuenta 1 ");
		System.out.println("4) Ingresar un importe en la cuenta 2 ");
		System.out.println("5) Retirar un importe de la cuenta 2 ");
		System.out.println("6) Transferir un importe de la cuenta 1 a la cuenta 2 ");
		System.out.println("7) Transferir un importe de la cuenta 2 a la cuenta 1 ");
	}

	public static void main(String[] args) {
		
		int opcion;
		double importeIngresar, importeRetirar;
//		Cuenta cuenta1 = null, cuenta2 = null;
		
		Cuenta cuenta1 = new Cuenta(1, "Francisco Gómez");
		System.out.println("ha creado la cuenta bancaria 1 ");
		Cuenta cuenta2 = new Cuenta(2, "Victoria Serrano");
		System.out.println("ha creado la cuenta bancaria 2 ");
		
		do {
			opcionesMenu();
			opcion = Teclado.leerEntero("Opcion (0 - 7): ");
			switch (opcion) {
			
			case 0:
				break;
			case 1:
				System.out.println(cuenta1.obtenerEstado());
				System.out.println(cuenta2.obtenerEstado());
				break;
			case 2:
				importeIngresar = Teclado.leerReal("Ingresa un importe: ");
				if (cuenta1.ingresar(importeIngresar)) {
					System.out.println("Se ha ingresado un importe en la cuenta 1 ");
				}
				else {
					System.out.println("Error al ingresar un importe en la cuenta 1 ");
					System.out.println("El importe debe ser positivo ");
				}
				break;
			case 3:
				importeRetirar = Teclado.leerReal("Retire un importe: ");
				if (cuenta1.retirar(importeRetirar)) {
					System.out.println("Se ha retirardo un importe de la cuenta 1 ");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta 1 ");
					System.out.println("El importe debe ser positivo ");
					System.out.println("El importe debe ser menor o igual que el saldo de cuenta 1 ");
				}
				break;
			case 4:
				importeIngresar = Teclado.leerReal("Ingresa un importe: ");
				if (cuenta2.ingresar(importeIngresar)) {
					System.out.println("Se ha ingresado un importe en la cuenta 2 ");
				}
				else {
					System.out.println("Error al ingresar un importe en la cuenta 2 ");
					System.out.println("El importe debe ser positivo ");
				}
				break;
			case 5:
				importeRetirar = Teclado.leerReal("Retire un importe: ");
				if (cuenta2.retirar(importeRetirar)) {
					System.out.println("Se ha retirardo un importe de la cuenta 2 ");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta 2 ");
					System.out.println("El importe debe ser positivo ");
					System.out.println("El importe debe ser menor o igual que el saldo de cuenta 2 ");
				}
				break;
			case 6:
				importeRetirar = Teclado.leerReal("¿Importe?: ");
				if(cuenta1.tranferir(importeRetirar, cuenta2)) {
					System.out.println("Se ha transferido un importe de la cuenta 1 a la cuenta 2 ");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta 1 ");
					System.out.println("El importe debe ser positivo ");
					System.out.println("El importe debe ser menor o igual que el saldo de la cuenta 1 ");
				}
				break;
			case 7:
				importeRetirar = Teclado.leerReal("¿Importe?: ");
				if(cuenta2.tranferir(importeRetirar, cuenta1)) {
					System.out.println("Se ha transferido un importe de la cuenta 2 a la cuenta 1 ");
				}
				else {
					System.out.println("Error al retirar un importe en la cuenta 2 ");
					System.out.println("El importe debe ser positivo ");
					System.out.println("El importe debe ser menor o igual que el saldo de la cuenta 2 ");
				}
				break;
			}
			
		}
		while(opcion != 0);
		System.out.println("Programa finalizado sin errores. ");

	}

}
