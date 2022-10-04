package Actividades;

import java.util.Scanner;

public class Ejercicio2x3 {

	public static void main(String[] args) {
		//
		double numA;
		System.out.println("Dime un número: ");
		Scanner teclado = new Scanner(System.in);
		numA = teclado.nextDouble();
		if (numA == 0) {
			System.out.println("El número es neutro");
		}
		else if (numA > 0) {
			System.out.printf("Cuadrado de " + (numA*numA));
			double resultado = Math.sqrt(numA);
			System.out.printf("\nLa raíz cuadrada es " + resultado);
			
		}
		else if(numA < 0) {
			System.out.println("El número real debe ser mayor o igual a 0");
			
		}

	}

}
