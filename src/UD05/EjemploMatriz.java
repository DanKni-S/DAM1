package UD05;

import java.util.Arrays;
import java.util.Random;

public class EjemploMatriz {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		// Matriz 3x4 enteros
		int [][] matriz = new int [3][4];
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = aleatorio.nextInt(11) + 10; //Entero entre 10 y 20
			}
		}
		System.out.println("Matriz: ");
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.println(Arrays.toString(matriz[fila]));
		}
	}

}
