package Actividades;

import java.util.Scanner;

public class Ejercicio1x2 {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		System.out.println("Introduce un numero: ");
			Scanner numero1 = new Scanner(System.in);
			numeroA = numero1.nextInt();
		System.out.println("Introduce un numero: ");
			Scanner numero2 = new Scanner(System.in);
			numeroB = numero2.nextInt();
		System.out.println("Introduce un numero: ");
			Scanner numero3 = new Scanner(System.in);
			numeroC = numero3.nextInt();
		System.out.println("Numeros Alineados por la Derecha");
			System.out.printf("%5d\n", numeroA);
			System.out.printf("%5d\n", numeroB);
			System.out.printf("%d\n", numeroC);
		System.out.println("Numeros Alineados por la Izquierda");
			System.out.printf("%d\n", numeroA);
			System.out.printf("%d\n", numeroB);
			System.out.printf("%d\n", numeroC);
	}

}
