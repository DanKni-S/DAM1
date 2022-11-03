package Actividades2;

import java.util.Scanner;

public class Ejercicio1x6 {
	
	public static int contarNumDivisor(int numA) {
		int cuenta = 0;
		for (int num = 1 ; num <= numA; num++) {
			if (numA % num == 0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	public static boolean esPrimo(int numA) {
		if (contarNumDivisor(numA) == 2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numIni, numFinal, cuenta = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Número inicial?");
		numIni = teclado.nextInt();
		System.out.println("¿Número Final?");
		numFinal = teclado.nextInt();
		
		for (int num = numIni ; num < numFinal ; num++) {
			if (esPrimo(num)) {
				System.out.println(num + " ");
				cuenta++;
			}
		}
		System.out.println("\nNúmeros primos: " + cuenta);
		
	}

}
