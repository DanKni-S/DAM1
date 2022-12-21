package Actividades5;

import entrada.Teclado;

public class Ejercicio1x02 {
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
		
		int [] numA = new int [10];
		int [] numB = new int [10];
		
		int pos;
		
		System.out.println("Vector A: ");
		for (pos = 0 ; pos < numA.length ; pos++) {
			numA[pos] = Teclado.leerEntero("¿Número entero " + pos + "? ");
		}
		System.out.println("");
		System.out.println("Vector B: ");
		for (pos = 0 ; pos < numB.length ; pos++) {
			numB[pos] = Teclado.leerEntero("¿Número entero " + pos + "? ");
		}
		
		escribirVector(numA);
		escribirVector(numB);
		

	}

}
