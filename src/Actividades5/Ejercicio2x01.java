package Actividades5;

import java.util.Arrays;

import entrada.Teclado;

public class Ejercicio2x01 {
	
	public static void leerMatriz(int [][] matriz) {
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = Teclado.leerEntero("¿Número Entero (" + fila + "," + columna + ")? ");
			}
		}
	}
	
	public static void escribirMatriz(int [][] matriz) {
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.println(Arrays.toString(matriz[fila]));
//			System.out.println("[");
//			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
//				System.out.println(matriz[fila][columna]);
//				if(columna != matriz[fila].length - 1) {
//					System.out.println(", ");
//				}
//			}
		}
	}

	public static void main(String[] args) {
//		final int NUMERO_FILA = 4;
//		final int NUMERO_COLUMNA = 4;
		int [][] matriz = new int [4][4];
		
		leerMatriz(matriz);
		System.out.println("MATRIZ: ");
		escribirMatriz(matriz);
		
		int minimo = matriz[0][0];
		int filaMinimo = 0;
		int columnaMinimo = 0;
		int maximo = matriz[0][0];
		int filaMaximo = 0;
		int columnaMaximo = 0;
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				if(matriz[fila][columna] < minimo) {
					minimo = matriz[fila][columna];
					filaMinimo = fila;
					columnaMinimo = columna;
				}
				if(matriz[fila][columna] > maximo) {
					maximo = matriz[fila][columna];
					filaMaximo = fila;
					columnaMaximo = columna;
				}
			}
		}
		System.out.println("Minimo: " + minimo);
		System.out.println("Primera posición del mínimo: (" + filaMinimo + "," + columnaMinimo + ")");
		System.out.println("Máximo: " + maximo);
		System.out.println("Primera posición del máximo: (" + filaMaximo + "," + columnaMaximo + ")");
	}

}
