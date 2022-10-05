package Actividades;

import java.util.Scanner;

public class Ejercicio2x9 {

	public static void main(String[] args) {
		//
		int turno, hdiarias, hextras;
		boolean turnoYHorasValidas;
		double salario;
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Turno de Trabajo (1-diurno, 2-vespertino?");
		turno = teclado.nextInt();
		System.out.println("¿Numero de horas ordinarias?");
		hdiarias = teclado.nextInt();
		System.out.println("¿Numero de horas extraordinarias?");
		hextras = teclado.nextInt();

		turnoYHorasValidas = true;
		if (turno < 1 || turno > 2) {
			System.out.println("El numero de trabajo " + " debe estar comprendido entre 1 y 2");
			turnoYHorasValidas = false;
		}
		if (hdiarias < 20 || hdiarias > 40) {
			System.out.println("El numero de horas ordinarias " + "debe estar comprendido entre 20 y 40");
			turnoYHorasValidas = false;
		}
		if (hextras < 0 || hextras > 0) {
			System.out.println("El numero de horas extraordinarias " + " debe esta comprendo");
			turnoYHorasValidas = false;
		}
		if (turnoYHorasValidas) {
			if (turno == 1) {
				salario = hdiarias * 5 + hextras * 7;
			} else {
				salario = hdiarias * 8 + hextras * 11;
			}
			System.out.printf("Salario semanal: %.2f euros\n", salario);
		}

	}
}