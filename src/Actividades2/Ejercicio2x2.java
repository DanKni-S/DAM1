package Actividades2;

import java.util.Scanner;

public class Ejercicio2x2 {
	
	public static void dibujarRectangulo(int numA, int numB) {
		int ancho, alto;
		for (alto = 0 ; alto <= numA ; alto++) {
			for (ancho = 0 ; ancho <= numB ; ancho++) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Altura del Rectángulo? ");
		numA = teclado.nextInt();
		
		System.out.println("¿Anchura del Rectángulo? ");
		numB = teclado.nextInt();
		
		if (numA <= 0) {
			System.err.println("La altura del rectángulo debe ser positivo ");
		}
		if (numB <= 0) {
			System.err.println("La anchura del rectángulo debe ser positivo ");
		}
		else {
			dibujarRectangulo(numA, numB);
		}
	}

}
