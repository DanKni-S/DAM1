package Actividades2;

import java.util.Scanner;

public class Ejercicio2x2 {

	public static void dibujarRectangulo(int numA, int numB) {
		int ancho, alto;
		boolean forma;
		for (alto = 0; alto <= numA; alto++) {
			for (ancho = 0; ancho <= numB; ancho++) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
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
				dibujarRectangulo(alto, ancho);
			} 
			System.out.println("¿Desea procesar otro rectángulo (0 para salir)? ");
			salir = teclado.nextInt();
			System.out.println();
		} while (salir > 0);
	}
}
