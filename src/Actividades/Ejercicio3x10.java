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
		if (numA == numB || numB == numC || numC == numA) {
			System.out.println();
		}
}
}
