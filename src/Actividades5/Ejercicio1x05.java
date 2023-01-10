package Actividades5;

import java.util.Random;

public class Ejercicio1x05 {
	
	public static int [] generaVector(int longitud, int minimo, int maximo) {
		int [] vector = new int [longitud];
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for (int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = aleatorio.nextInt(anchuraIntervalo) + minimo;
		}
		return vector;
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
		
		final int LONGITUD = 8;
		int [] vectorA = generaVector(LONGITUD, 1, 5);
		int [] vectorB = generaVector(LONGITUD, 1, 5);
		
		System.out.println("Vector A: ");
		escribirVector(vectorA);
		System.out.println("Vector B: ");
		escribirVector(vectorB);
		
		for(int posicionA = 0 ; posicionA < vectorA.length ; posicionA++) {
			int contador = 0;
			for(int posicionB = 0 ; posicionB < vectorB.length ; posicionB++) {
				if(vectorA[posicionA] == vectorB[posicionB]) {
					contador++;	
				}
			}
			System.out.println("El elemeto en la posicón " + posicionA + " del vector A aparece " + contador + " veces en el vector B. ");
		}
	}

}
