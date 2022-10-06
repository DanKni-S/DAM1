package Actividades;

import java.util.Scanner;

public class Ejercicio3x10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numA, numB, numC;
		System.out.println("Introduce un número: ");
		Scanner teclado = new Scanner(System.in);
		numA = teclado.nextDouble();
		System.out.println("Introduce un número: ");
		numB = teclado.nextDouble();
		System.out.println("Introduce un número: ");
		numC = teclado.nextDouble();

		if (numA < numB && numA < numC) {
			if (numB < numC) {
				System.out.println(numA + " < " + numB + " < " + numC);
			}
		if (numB < numA && numB < numC) {
			if (numA < numC) {
					System.out.println(numB + " < " + numA + " < " + numC);
				}
		if (numC < numA && numC < numB) {
			if (numA < numB) {
						System.out.println(numC + " < " + numB + " < " + numA);
					}
				}
			}

		}

	}
}
