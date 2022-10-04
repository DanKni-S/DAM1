package Actividades;

import java.util.Scanner;

public class Ejercicio2x1 {

	public static void main(String[] args) {
		//
		int numA;
		System.out.println("Dime un número: ");
		Scanner teclado = new Scanner(System.in);
		numA = teclado.nextInt();
		if (numA % 2 == 0) {
			System.out.println("El número es Par");
		} else {
			System.out.println("El número no es Par");
		}
	}

}
