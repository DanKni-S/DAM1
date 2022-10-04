package Actividades;

import java.util.Scanner;

public class Ejercicio2x2 {

	public static void main(String[] args) {
		//
		double numA;
		System.out.println("Dime un número: ");
		Scanner teclado = new Scanner(System.in);
		numA = teclado.nextDouble();

		if (numA == 0) {
			System.out.println("El número es neutro");
		} else if (numA < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}

}
