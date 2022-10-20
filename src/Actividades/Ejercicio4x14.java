package Actividades;

import java.util.Scanner;

public class Ejercicio4x14 {

	public static void main(String[] args) {
		//
		final int TOTAL = 5;
		int numA = 19, numB, contador;
		boolean acierto = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Número?");
//		numB = teclado.nextInt();
		for (contador = 1; contador <= TOTAL && !acierto; contador++) {
//			System.out.println("¿Número?");
			numB = teclado.nextInt();
			if (numB == numA) {
				System.out.println("Has acertado el número secreto. ");
				acierto = true;
			} else if (contador == 5) {
				System.out.println("Has fallado el número secreto");
				System.out.println("Has agotado los 5 intentos");
			} else if (numA > numB) {
				System.out.println("Has fallado el número secreto");
				System.out.println("El número " + numB + " es menor que el número secreto");
			} else if (numA < numB) {
				System.out.println("Has fallado el número secreto");
				System.out.println("El número " + numB + " es mayor que el número secreto");
			}
		}
	}

}
