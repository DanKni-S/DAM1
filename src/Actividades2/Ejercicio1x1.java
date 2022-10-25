package Actividades2;

import java.util.Scanner;

public class Ejercicio1x1 {

	public static void main(String[] args) {
		//
		int numA, numB, numC;
		int minimo, maximo;
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Numero Entero A?");
		numA = teclado.nextInt();
		System.out.println("¿Numero Entero B?");
		numB = teclado.nextInt();
		System.out.println("¿Numero Entero C?");
		numC = teclado.nextInt();

		minimo = obtenerMinimo(numA, numB, numC);
		System.out.println("Minimo es " + minimo);

		maximo = obtenerMaximo(numA, numB, numC);
		System.out.println("Maximo es " + maximo);

	}

	public static int obtenerMinimo(int numA, int numB, int numC) {
		int minimo = numA;

		if (numB < minimo) {
			minimo = numB;
		}
		if (numC < minimo) {
			minimo = numC;
		}
		return minimo;
	}

	public static int obtenerMaximo(int numA, int numB, int numC) {
		int maximo = numA;
		if (numB > maximo) {
			maximo = numB;
		}
		if (numC > maximo) {
			maximo = numC;
		}
		return maximo;
	}

}
