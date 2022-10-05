package Actividades;

import java.util.Scanner;

public class Ejercicio2x7 {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		double numA, numB, numC, x1, x2, x;
		System.out.println("Coeficiente A: ");
		numA = teclado.nextDouble();
		System.out.println("Coeficiente B: ");
		numB = teclado.nextDouble();
		System.out.println("Coeficiente C: ");
		numC = teclado.nextDouble();
		if (((numB * numB) - (4 * numA * numC)) > 0) {
			x1 = (-numB + Math.sqrt((numB * numB) - (4 * numA * numC))) / 2 * numA;
			x2 = (-numB - Math.sqrt((numB * numB) - (4 * numA * numC))) / 2 * numA;
			System.out.println("La ecuacion tiene dos soluciones reales: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			if (((numB * numB) - (4 * numA * numC)) == 0) {
				x = (-numB + Math.sqrt((numB * numB) - (4 * numA * numC))) / 2 * numA;
				System.out.println("La ecuacion tiene una unica solucion real: ");
			} else {
				if (((numB * numB) - (4 * numA * numC)) < 0)
					;
				System.out.println("La ecuacion no tiene solucion real");
			}
		}
	}

}
