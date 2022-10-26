package Actividades2;

public class Ejercicio1x2 {

//	Devuelve verdadero si el numero es Par
//	Devuelve falso en caso contrario

	public static boolean esPar(int numA) {
		if (numA % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esMultiplo(int dividiendo, int divisor) {
		if (dividiendo % divisor == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		//
		final int Limite = 20;
		int numA;

		System.out.println("Números pares entre 1 y " + Limite + ":");
		for (numA = 1; numA <= Limite; numA++) {
			if (esPar(numA)) {
				System.out.println(numA + " ");
			}
		}
		System.out.println();

		System.out.println("Números múltiplos de 3 entre 1 y " + Limite + ":");
		for (numA = 1; numA <= Limite; numA++) {
			if (esMultiplo(numA, 3)) {
				System.out.println(numA + " ");
			}
		}
		System.out.println();
		
		System.out.println("Números múltiplos de 5 entre 1 y " + Limite + ":");
		for (numA = 1 ; numA <=Limite ; numA++) {
			if (esMultiplo(numA, 5)) {
				System.out.println(numA + " ");
			}
			System.out.println();
		}
	}

}
