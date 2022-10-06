package Actividades;

import java.util.Scanner;

public class Ejercicio3x9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nMinimo, nMaximo;
		double numero1, numero2, numero3;

		System.out.println("Introduce un número: ");
		Scanner teclado = new Scanner(System.in);
		numero1 = teclado.nextDouble();

		System.out.println("Introduce un número: ");
		numero2 = teclado.nextDouble();

		System.out.println("Introduce un número: ");
		numero3 = teclado.nextDouble();

		if (numero1 > numero2 && numero1 > numero3) {
			nMaximo = numero1;
			System.out.println("Máximo: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			nMaximo = numero2;
			System.out.println("Máximo: " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			nMaximo = numero3;
			System.out.println("Máximo: " + numero3);
		}
		if (numero1 < numero2 && numero1 < numero3) {
			nMinimo = numero1;
			System.out.println("Máximo: " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			nMinimo = numero2;
			System.out.println("Máximo: " + numero2);
		} else if (numero3 < numero1 && numero3 < numero2) {
			nMinimo = numero3;
			System.out.println("Máximo: " + numero3);
		}
	}
}
