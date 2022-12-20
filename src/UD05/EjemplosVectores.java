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
	// Rellena un vector de enteros con numeros aleatorios
	// entre un minimo y maximo
	public static void generaVector(int capacidad, int minimo, int maximo) {
		Random aleatorio = new Random();
		int[] v = new int [capacidad];
		for (int pos = 0 ; pos < v.length ; pos++) {
			v[pos] = aleatorio.nextInt(maximo - minimo + 1) + minimo;
		}
		return v;
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
		// calcular la media del vector
		int suma = 0;
		for(int pos = 0 ; pos < notas.length ;pos++) {
			suma += notas[pos];
		}
		double media = suma / notas.length;
		System.out.println("Media: " + media);
		
		int[] numeros = generaVector(20, -10, 10);
		escribirVector(notas);
	}

}
