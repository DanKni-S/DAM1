package Actividades5;

import java.util.Random;

import entrada.Teclado;

public class Ejercicio2x03 {
	
	public static void rellenar(int [][] matriz, int minimo, int maximo) {
		Random aleatorio = new Random();
		int anchuraIntervalo = maximo - minimo + 1;
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				matriz[fila][columna] = aleatorio.nextInt(anchuraIntervalo) + minimo;
			}
		}
	}
	
	public static void escribirMatriz(int [][]matriz) {
		for(int fila = 0 ; fila < matriz.length ; fila++) {
			System.out.print("[");
			for(int columna = 0 ; columna < matriz[fila].length ; columna++) {
				System.out.printf("%3d", matriz[fila][columna]);
				if(columna != matriz[fila].length - 1) {
					System.out.print(",");
				}
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		final int NUMFILAS = 8;
		final int NUMCOLUMNAS = 8;
		int [][] matriz = new int [NUMFILAS][NUMCOLUMNAS];
		rellenar(matriz, 1, 100);
		
		System.out.println("Matriz antes de intercambiar dos filas: ");
		escribirMatriz(matriz);
		
		int fila1 = Teclado.leerEntero("¿Fila 1? ");
		while (fila1 < 0 || fila1 >= matriz.length) {
			System.out.println("La fila debe estar comprendida entre 0 y " + (matriz.length - 1) + ". ");
			fila1 = Teclado.leerEntero("¿Fila 1? ");
		}
		int fila2 = Teclado.leerEntero("¿Fila 2? ");
		while (fila2 < 0 || fila2 >= matriz.length) {
			System.out.println("La fila debe estar comprendida entre 0 y " + (matriz.length - 1) + ". ");
			fila2 = Teclado.leerEntero("¿Fila 2? ");
		}
		int elemento;
		for(int columna = 0; columna < NUMCOLUMNAS ; columna++) {
			elemento = matriz[fila1][columna];
			matriz[fila1][columna] = matriz[fila2][columna];
			matriz[fila2][columna] = elemento;
		}
		System.out.println("Matriz despues del intercambio de dos filas: ");
		escribirMatriz(matriz);
	}

}
