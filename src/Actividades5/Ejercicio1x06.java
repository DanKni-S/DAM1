package Actividades5;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Ejercicio1x06 {
	
	public static int[] rellenar(int longitud, int minimo, int maximo) {
		int [] vector = new int [longitud];
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for(int posicion = 0 ; posicion < vector.length ; posicion++) {
			vector[posicion] = aleatorio.nextInt(anchuraIntervalo) + minimo;
		}
		return vector;
	}
	public static int[] fusionar(int [] vector1, int[] vector2) {
		int[] vectorFusion = new int [vector1.length + vector2.length];
		int posicionResultado = 0;
		for(int posicion = 0 ; posicion < vector1.length ; posicion++) {
			vectorFusion[posicionResultado] = vector1[posicion];
			posicionResultado++;
		}
		for(int posicion = 0 ; posicion < vector2.length ; posicion++) {
			vectorFusion[posicionResultado] = vector2[posicion];
			posicionResultado++;
		}
		return vectorFusion;
	}

	public static void main(String[] args) {
		
		int longitudA = Teclado.leerNatural("¿Longitud del vector A? ");
		int longitudB = Teclado.leerNatural("¿Longitud del vector A? ");
		int [] vectorA = rellenar(longitudA, -1000, 1000);
		int [] vectorB = rellenar(longitudB, -1000, 1000);
		
		System.out.println("Vector A: ");
		System.out.println(Arrays.toString(vectorA));
		System.out.println("Vector B: ");
		System.out.println(Arrays.toString(vectorB));
		
		int[] vectorFusion = fusionar(vectorA, vectorB);
		System.out.println("Vector Fusion: ");
		System.out.println(Arrays.toString(vectorFusion));
	}

}
