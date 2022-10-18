package Actividades;

import java.util.Scanner;

public class Ejercicio4x8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB, suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Número Natural N: ");
		numA = teclado.nextInt();
		if (numA <= 0) {
			System.out.println("El número natural N debe ser positivo. ");
		} else {
			numB = 1;
			suma = 0;
			System.out.println("Números impares menores o iguales que " + numA + " , ");
			while (numB <= numA) {
				System.out.println(numB + " , ");
				suma += numB;
				numB += 2;
			}

		}

		System.out.println("\nSuma de números impares menores o iguales que " + numA + " : " + suma);
	}
}
