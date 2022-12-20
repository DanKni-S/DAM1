package UD05;

import java.util.Random;

public class EjemplosVectores {
		
		// Escribe en consola un vector de enteros
	public static void escribirVector(int[] v) {
		System.out.println("[ ");
		for(int pos = 0 ; pos < v.length ; pos++) {
			if(pos == v.length - 1) {
			System.out.println(v[pos] + ", ");
			}
			else {
				System.out.println(v[pos] + ", ");
			}
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		
		// Declara un vector de 10 numeros enteros
		// int [] vector;
		// Instanciar el vector con 10 posiciones
		// vector = new int [10];
		
		// int [] vector2 = new int [20];
		// double[] vectorReales = new double[12];
		// String[] vectorCadenas = new String[];
		
		// int [] notas = {7, 8, 4, 3, 5, 10};
		// String [] nombres = {"Juan", "Maria", "Pablo", "Isabel"};
		
		// for (int pos = 0 ; pos < notas.length ; pos++) {
			// System.out.println(notas[pos] + " ");
		// }
		// System.out.println("");
		
		// notas[0] = 9;
		// notas[1] = 9;
		// for (int pos = 0 ; pos < notas.length ; pos++) {
			// System.out.println(notas[pos] + " ");
		// }
		
		Random aleatorio = new Random();
		int [] notas = {7, 8, 4, 5, 10};
		for (int pos = 0 ; pos < notas.length ; pos++) {
			System.out.println(notas[pos] + "");
		}
		System.out.println("");
		// Rellena el vector de modo aleatorio
		for (int pos = 0 ; pos < notas.length ; pos++) {
			notas[pos] = aleatorio.nextInt(11);
		}
		escribirVector(notas);
		
		System.out.println("");
		// recorrer el lector al reves
		for (int pos = notas.length - 1 ; pos >= 0 ; pos--) {
			System.out.println(notas[pos] + "");
		}
	}

}
