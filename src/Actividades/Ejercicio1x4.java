package Actividades;

import java.util.Scanner;

public class Ejercicio1x4 {

	public static void main(String[] args) {
		//
		double numA, numB;
		System.out.println("Introduce un numero: ");
		Scanner numero1 = new Scanner(System.in);
		numA = numero1.nextDouble();
		System.out.println("Introduce un numero: ");
		Scanner numero2 = new Scanner(System.in);
		numB = numero2.nextDouble();

		//System.out.printf("Calculos entre los dos numeros %f %f\n", numA, numB);
		System.out.printf( "Suma = %.1f\n", numA + numB);
		System.out.printf("Resta = %.1f\n", numA - numB);
		System.out.printf("Multiplicación = %.2f\n", numA * numB);
		System.out.printf("Divición = %f", numA / numB);
	}

}
