package Actividades;

import java.util.Scanner;

public class Ejercicio3x5 {

	public static void main(String[] args) {
		//
		int numero;
		System.out.println("Dime un numero: ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		if (numero < 0 || numero > 99999) {
			System.out.println("El número entero debe estar comprendido entre 0 y 99999");
		} else if (numero < 10) {
			System.out.println("El numero " + numero + " tiene 1 cifra.");
		} else if (numero < 100) {
			System.out.println("El numero " + numero + " tiene 2 cifra.");
		} else if (numero < 1000) {
			System.out.println("El numero " + numero + " tiene 3 cifra.");
		} else if (numero < 10000) {
			System.out.println("El numero " + numero + " tiene 4 cifra.");
		} else {
			System.out.println("El numero " + numero + " tiene 5 cifra.");
		}
	}

}
