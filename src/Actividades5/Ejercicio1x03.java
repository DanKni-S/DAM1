package Actividades5;

import java.util.Random;

public class Ejercicio1x03 {
	
	public static void generarVector(int [] vector, int minimo, int maximo) {
		Random aleatorio = new Random();
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = aleatorio.nextInt(maximo - minimo + 1) + minimo;
		}
	}
	
	public static void escribirVector(int[] v) {
		System.out.println("[ ");
		for (int pos = 0 ; pos < v.length ; pos++) {
			if (pos == v.length - 1) {
				System.out.println(v[pos] + ", ");
			}
			else {
				System.out.println(v[pos] + ", ");
			}
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		final int LONGITUD = 15;
		int[] vector = new int [LONGITUD];
		
		generarVector(vector, -100, 100);
		System.out.println("VECTOR: ");
		escribirVector(vector);
		
		int contadorNumeroNegativo = 0;
		int contadorNumeroNeutro = 0;
		int contadorNumeroPositivos = 0;
		for(int posicion = 0 ; posicion < vector.length ; posicion++) {
			if (vector[posicion] < 0) {
				contadorNumeroNegativo++;
			}
			else if(vector[posicion] > 0) {
				contadorNumeroPositivos++;
			}
			else {
				contadorNumeroNeutro++;
			}
		}

	}

}
