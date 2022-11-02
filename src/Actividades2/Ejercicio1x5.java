package Actividades2;

import java.util.Scanner;

public class Ejercicio1x5 {
	
	public static int contarDivisores(int numA) {
		int numeroDivisores = 0;
		int divisor;
		for (divisor = 1 ; divisor <= numA ; divisor++) {
			if (numA % divisor == 0) {
				System.out.println(divisor + " ");
			}
		}
		System.out.println();
		return numeroDivisores;
	}
	public static void main(String[] args) {
		// 
		int numero, numeroDivisores;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Número (0 para salir)? ");
		numero = teclado.nextInt();
		
		while (numero > 0) {
			System.out.println("Divisores del número " + numero + ": ");
			numeroDivisores = contarDivisores(numero);
			System.out.println("El número " + numero + " tiene " + numeroDivisores + " divisores. ");
			System.out.println("¿Número (0 para salir)? ");
			numero = teclado.nextInt();
		}
		

	}

}
