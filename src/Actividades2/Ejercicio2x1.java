package Actividades2;

import java.util.Scanner;

public class Ejercicio2x1 {
	
	public static void escribirTablaMultiplicar(int numA) {
		System.out.println("Tabla de Multiplicar del numero " + numA);
		int contador;
		for (contador = 0 ; contador <= 10 ; contador++) {
			System.out.printf("%2d * %2d = %2d\n", numA, contador, numA * contador);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Número? ");
		numA = teclado.nextInt();
		
		if (numA <= 0) {
			System.err.println("El número debe ser positivo");
		}
		else {
			escribirTablaMultiplicar(numA);
		}
		
	}

}
