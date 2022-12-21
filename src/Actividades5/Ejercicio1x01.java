package Actividades5;

import entrada.Teclado;

public class Ejercicio1x01 {
	
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
	
	// Devuelve el minimo de un vector entero
	public static int obtenerMinimo(int[] v) {
		int minimo = v[0];
		for (int pos = 1 ; pos < v.length ; pos++) {
			if (v[pos] < minimo) {
				minimo  = v[pos];
			}
		}
		return minimo;
	}
	
	// Devuelve el maximo de un vector entero
	public static int obtenerMaximo(int[] v) {
		int maximo = v[0];
		for (int pos = 1 ; pos < v.length ; pos++) {
			if (v[pos] > maximo) {
				maximo  = v[pos];
			}
		}
		return maximo;
	}
	
	// Devuelve la posicion de un elemento en un vector entero
	// Devuelve -1 si el elemento no esta en el vetor
	public static int buscarPosicion(int elemento, int[] v) {
		int posicion = -1;
		boolean encontrado = false;
		for (int i = 0 ; i < v.length && !encontrado ; i++) {
			if (v[i] == elemento) {
				posicion = i;
			}
		}
		return posicion;
	}

	public static void main(String[] args) {
		
		int [] num = new int [10];
		
		int pos;
		for (pos = 0 ; pos < num.length ; pos++) {
			num[pos] = Teclado.leerEntero("¿Número Entero " + pos + "? ");
		}
		
		escribirVector(num);
		
		int min = obtenerMinimo(num);
		int max = obtenerMaximo(num);
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		
		int posMin = buscarPosicion(min, num);
		int posMax = buscarPosicion(max, num);
		System.out.println("Posición mínimo: " + posMin);
		System.out.println("Posición máximo: " + posMax);
	}

}
