package Actividades;

import java.util.Scanner;

public class Ejercicio3x2 {

	public static void main(String[] args) {
		//
		int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Mes?");
		mes = teclado.nextInt();
		if (mes < 1 || mes > 12) {
			System.out.println("El mes debe estar comprendido entre 1 y 12");
		} else if (mes == 2) {
			System.out.println("28 días");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("30 días");
		} else {
			System.out.println("31 días");
		}
	}

}
