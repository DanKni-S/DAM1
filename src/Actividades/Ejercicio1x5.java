package Actividades;

import java.util.Scanner;

public class Ejercicio1x5 {

	public static void main(String[] args) {
		//
		double numA, numB;
		System.out.println("Introduce un numero: ");
		Scanner numero1 = new Scanner(System.in);
		numA = numero1.nextDouble();
		System.out.println("Introduce un numero: ");
		Scanner numero2 = new Scanner(System.in);
		numB = numero2.nextDouble();
		
		System.out.println("Números con dos dígitos decimales");
		System.out.printf("A = %.2f\n", numA);
		System.out.printf("B = %.2f\n", numB);
		
		System.out.println("\nNúmeros con un digito");
		System.out.printf("A = %.1f\n", numA);
		System.out.printf("B = %.1f\n", numB);
		
		System.out.println("\nNúmero con ningún digito decimal");
		System.out.printf("A = %.0f\n", numA);
		System.out.printf("A = %.0f\n", numB);
	}

}
