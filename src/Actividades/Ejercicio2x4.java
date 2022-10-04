package Actividades;

import java.util.Scanner;

public class Ejercicio2x4 {

	public static void main(String[] args) {
		//
		double numA, numB;
		System.out.println("Dime un número: ");
		Scanner teclado1 = new Scanner(System.in);
		numA = teclado1.nextDouble();
		System.out.println("Dime un número: ");
		Scanner teclado2 = new Scanner(System.in);
		numB = teclado2.nextDouble();
		if (numA > numB) {
			System.out.println(numA + " es mayor");
		} else if (numB > numA) {
			System.out.println(numB + " es mayor");
		} else if (numA == numB) {
			System.out.println(numA + " y " + numB + " son iguales");
		}
	}

}
