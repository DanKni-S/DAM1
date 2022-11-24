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
		while(! Tiempo.esValido(horas, minutos, segundos)) {
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
					System.out.println("No existe nigún tiempo válido ");
				}
				else {
					System.out.println(tiempo.obtenerEstado());
				}
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}while(opcion != 0);

	}

}
