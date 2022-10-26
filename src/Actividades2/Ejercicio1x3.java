package Actividades2;

import java.util.Scanner;

public class Ejercicio1x3 {
	
	public static int Invertido(int numA) {
		int numInvertir = 0;
		int digito;
		while (numA > 0) {
			digito = numA % 10;
			numInvertir = numInvertir * 10 + digito;
			numA /= 10;
		}
		return numInvertir;
	}

	public static void main(String[] args) {
		//
		int numA, numB, resto = 0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Número Inicial? ");
		numA = teclado.nextInt();

		System.out.println("¿Número Final? ");
		numB = teclado.nextInt();

		if (numA >= numB) {
			System.out.println("El número inicial debe ser menor o igual que el número final. ");
			if (Invertido(numA)) {
				System.out.println(numA + " ");
			}
		}
		System.out.println();
	}

}
