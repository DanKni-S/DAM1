package Actividades5;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Ejercicio2x02 {
	// Rellena con numeros aleatorios
	public static void rellenar(int[][] matriz, int minimo, int maximo){
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = aleatorio.nextInt(anchuraIntervalo) + minimo;
			}
		}
	}
	// Escribir en cosola una matriz de numeros enteros
	// Indicando cada elemento de la matriz con 3 digitos numéricos
	public static void escribirMatriz(int [][] matriz) {
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.print("[");
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				System.out.printf("%3d", matriz[fila][columna]);
				if(columna != matriz[fila].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		final int INI = 8;
		final int END = 8;
		int [][] matriz = new int [INI][END];
		
		rellenar(matriz, 1, 100);
		System.out.println("MATRIZ: ");
		escribirMatriz(matriz);
		
		int suma;
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			suma = 0;
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				suma += matriz[fila][columna];
			}
			System.out.println("Suma de Fila " + fila + ": " + suma);
		}
		for(int columna = 0 ; columna < END ; columna++) {
			suma = 0;
			for(int fila = 0 ; fila < matriz.length ; fila++) {
				suma += matriz[fila][columna];
			}
			System.out.println("Suma de Columna " + columna + ": " + suma);
		}
	}

}
