package Actividades;

import java.util.Scanner;

public class Ejercicio4x7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TOTAL = 10;
		int numA, contador, mini, maxi;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Número Entero 0? ");
		numA = teclado.nextInt();
		
		contador = 1;
		mini = numA;
		maxi = numA;
		
		while (contador < TOTAL) {
			System.out.println("¿Número Entero " + contador + "?" );
			numA = teclado.nextInt();
			
			contador++;
			if (numA < mini) {
				mini = numA;
			}
			if (numA > maxi) {
				maxi = numA;
			}
		}
		System.out.println("Mínimo: " + mini);
		System.out.println("Máximo: " + maxi);
	}

}
