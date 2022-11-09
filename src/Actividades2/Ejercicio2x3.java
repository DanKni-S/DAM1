package Actividades2;

import java.util.Scanner;

public class Ejercicio2x3 {

	public static void dibujarRectangulo(int numA, int numB, boolean b) {
		int alto, ancho, alto2, ancho2;
		if (b = true) {
			for (alto = 1; alto <= numA; alto++) {
				for (ancho = 1; ancho <= numB; ancho++) {
					System.out.print('*');
				}
				System.out.println("");
			}
		} else {
			for (alto = 1; alto <= numA; alto++) {
				for (ancho = 1; ancho <= numB; ancho++) {
					System.out.print('*');
				}
				System.out.println("");
				for (alto2 = 1 ; alto2 <= numA - 2 ; alto2++, alto++) {
					if (alto < numA) {
						System.out.print('*');
						for (ancho2 = 1 ; ancho2 <= numB - 2 ; ancho2++) {
							System.out.print(" ");
						}
						System.out.print('*');
						System.out.println();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		//
		int alto, ancho, salir;
		boolean valido;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("¿Altura del Rectángulo? ");
			alto = teclado.nextInt();

			System.out.println("¿Anchura del Rectángulo? ");
			ancho = teclado.nextInt();
			valido = true;

			if (alto <= 0) {
				System.err.println("La altura del rectángulo debe ser positivo ");
				valido = false;
			}
			if (ancho <= 0) {
				System.err.println("La anchura del rectángulo debe ser positivo ");
				valido = false;
			}
			if (valido) {
				System.out.println("RECTÁNGULO CON BORDES E INTERIOR");
				dibujarRectangulo(alto, ancho, true);
				System.out.println("RECTÁNGULO SOLO CON BORDES");
				dibujarRectangulo(alto, ancho, false);
			}
			System.out.println("¿Desea procesar otro rectángulo (0 para salir)? ");
			salir = teclado.nextInt();
			System.out.println();
		} while (salir > 0);
	}

}
