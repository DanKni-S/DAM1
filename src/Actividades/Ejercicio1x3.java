package Actividades;

import java.util.Scanner;

public class Ejercicio1x3 {

	public static void main(String[] args) {
		//
		int numeroA, numeroB;
		System.out.println("Introduce un numero: ");
		Scanner numero1 = new Scanner(System.in);
			numeroA = numero1.nextInt();
		System.out.println("Introduce un numero: ");
		Scanner numero2 = new Scanner(System.in);
			numeroB = numero2.nextInt();
		System.out.println("Antes del intercambio");
		System.out.printf("%d %3d\n", numeroA, numeroB);
		System.out.println("Despúes del intercambio");
		System.out.printf("%d %3d\n", numeroB, numeroA);
	}

}
