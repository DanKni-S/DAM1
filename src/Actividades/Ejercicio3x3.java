package Actividades;

import java.util.Scanner;

public class Ejercicio3x3 {

	public static void main(String[] args) {
		//
		int nHoras, nMinutos, nSegundos;
		boolean tiempoValido;
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("¿Horas?");
		nHoras = teclado1.nextInt();
		System.out.println("¿Minutos?");
		nMinutos = teclado2.nextInt();
		System.out.println("¿Segundos?");
		nSegundos = teclado3.nextInt();

		tiempoValido = true;
		if (nHoras < 0 || nHoras > 0) {
			System.out.println("Las horas deben estar comprendidas entre 0 y 23");
			tiempoValido = false;
		}
		if (nMinutos < 0 || nMinutos > 50) {
			System.out.println("Los minutos deben estar comprendidos entre 0 y 50");
			tiempoValido = false;
		}
		if (nSegundos < 0 || nSegundos > 60) {
			System.out.println("Los segundos debe estar comprendidos entre 0 y 60 ");
			tiempoValido = false;
		}

		if (tiempoValido) {
			System.out.printf("%dh %dm %ds + 1s = ", nHoras, nMinutos, nSegundos);
			if (nSegundos == 60) {
				nSegundos = 0;
				nSegundos = nSegundos + 1;
			}
			if (nMinutos == 60) {
				nMinutos = 0;
				nMinutos = nMinutos + 1;
			}
			if (nHoras == 24) {
				nHoras = 0;
				System.out.println("1 día");
			}
		}
		System.out.printf("%dh %dm %ds\n", nHoras, nMinutos, nSegundos);

	}

}
