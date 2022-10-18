package Actividades;

import java.util.Scanner;

public class Ejercicio4x9 {

	public static void main(String[] args) {
		//
		int numA, numB, numero = 0, contador = 1, suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Número Entero A? ");
		numA = teclado.nextInt();
		System.out.println("¿Número Entero B? ");
		numB = teclado.nextInt();
		if (numA > numB) {
			System.out.println("El número entero A debe ser menor o igual que el número B ");
		}

		else {
			numero = numA;
			suma = 0;
			System.out.println("Suma de Números Pares comprendidos entre " + numA + " y " + numB + ": ");
			
			while (numero <= numB) {
				if (numero % 2 == 0) {
					System.out.println(numero + " , ");
					suma += numero;
				}
				numero += 1;
			}
			System.out.println("Suma de Números Pares comprendidos entre " + numA + " y " + numB + ": " + suma);
		}
	}
}
