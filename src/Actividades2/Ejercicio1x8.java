package Actividades2;

public class Ejercicio1x8 {

	public static boolean sonAmigos(int numA, int numB) {
		int sumaA = 0, sumaB = 0;
		for (int i = 1; i < numA; i++) {
			if (numA % i == 0) {
				sumaA += i;
			}
		}
		for (int i = 1; i < numB; i++) {
			if (numB % i == 0) {
				sumaB += i;
			}
		}
		if (numA == sumaB && numB == sumaA) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		//
		final int LIMITE = 500;
		int i, a;
		for (i = 1 ; i <= LIMITE ; i++) {
			for (a = 1 ; a <= LIMITE ; a++) {
				if (sonAmigos(i, a)) {
					System.out.println("Los números " + i + " y " + a + " son amigos.");
				}
			}
		}
		}
	}

