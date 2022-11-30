package Actividades3;

import Constructor.Tiempo;
import entrada.Teclado;

public class Ejercicio2x03 {
	public static void menuOpciones() {
		System.out.println();
		System.out.println("0) Salir del programa ");
		System.out.println("1) Leer pro teclado un tiempo válido ");
		System.out.println("2) Visualizar en consola el tiempo ");
		System.out.println("3) Sumar al tiempo otro tiempo ");
		System.out.println("4) Restar al tiempo otro tiempo ");
		System.out.println();
	}

	public static Tiempo leerTimeValido() {
		int horas = Teclado.leerEntero("¿Horas? ");
		int minutos = Teclado.leerEntero("¿minutos? ");
		int segundos = Teclado.leerEntero("¿Segundos? ");
		while (!Tiempo.esValido(horas, minutos, segundos)) {
			System.out.println("Los datos del tiempo no son válidos: ");
			System.out.println("La hora debe estar comprendida entre 0 y 23 ");
			System.out.println("Los minutos debe estar comprendidos entre 0 y 59 ");
			System.out.println("Los segundos deben estar compredidos entre 0 y 59 ");
			horas = Teclado.leerEntero("¿Horas? ");
			minutos = Teclado.leerEntero("¿minutos? ");
			segundos = Teclado.leerEntero("¿Segundos? ");
		}
//		Tiempo tiempo = new Tiempo (horas, minutos, segundos);
//		return Tiempo;
		return new Tiempo(horas, minutos, segundos);
	}

	public static void main(String[] args) {
		int opcion, horas, minutos, segundos;
		Tiempo tiempo = null;
		Tiempo otroTime = null;

		do {
			menuOpciones();
			opcion = Teclado.leerEntero("¿Opciones (0 - 5)?");
			switch (opcion) {

			case 0:
				break;
			case 1:
//				horas = Teclado.leerEntero("¿Horas? ");
//				minutos = Teclado.leerEntero("¿minutos? ");
//				segundos = Teclado.leerEntero("¿Segundos? ");
//				while(! Tiempo.esValido(horas, minutos, segundos)) {
//					System.out.println("Los datos del tiempo no son válidos: ");
//					System.out.println("La hora debe estar comprendida entre 0 y 23 ");
//					System.out.println("Los minutos debe estar comprendidos entre 0 y 59 ");
//					System.out.println("Los segundos deben estar compredidos entre 0 y 59 ");
//					horas = Teclado.leerEntero("¿Horas? ");
//					minutos = Teclado.leerEntero("¿minutos? ");
//					segundos = Teclado.leerEntero("¿Segundos? ");
//				}
//				tiempo = new Tiempo (horas, minutos, segundos);
//				System.out.println("Se ha creado un tiempo válido ");
				break;
			case 2:
				if (tiempo == null) {
					System.out.println("No existe ningún tiempo válido ");
				} else {
					System.out.println(tiempo.obtenerEstado());
				}
				break;
			case 3:
				if (tiempo == null) {
					System.out.println("No existe ningún tiempo válido ");
				} else {
					otroTime = leerTimeValido();
					System.out.println("Se ha creado otro tiempo válido ");
					System.out.println(tiempo.obtenerEstado() + " + " + otroTime.obtenerEstado());
				}
				if (tiempo.sumar(otroTime)) {
					System.out.println(tiempo.obtenerEstado());
				} else {
					System.out.println("Error al sumar el tiempo más otro tiempo ");
					System.out.println("La suma debe ser igual o inferior a 23h:59m:59s ");
				}
				break;
			case 4:
				if (tiempo == null) {
					System.out.println("No existe ningún tiempo válido ");
				} else {
					otroTime = leerTimeValido();
					System.out.println("Se ha creado otro tiempo válido ");
					System.out.println(tiempo.obtenerEstado() + " - " + otroTime.obtenerEstado());
				}
				if (tiempo.restar(otroTime)) {
					System.out.println(tiempo.obtenerEstado());
				} else {
					System.out.println("Error al restar el tiempo más otro tiempo ");
					System.out.println("La resta debe ser igual o superior a 00h:00m:00s ");
				}
				break;
			default:
				System.out.println("La opción del menú debe estar comprendida entre (0 - 4) ");
				break;
			}
		} while (opcion != 0);

	}

}
