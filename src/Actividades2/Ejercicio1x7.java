package Actividades2;

public class Ejercicio1x7 {
	
	public static boolean esPerfect(int numA) {
		int suma = 0;
		for (int numB = 1 ; numB < numA ; numB++) {
			if (numA % numB == 0) {
				suma += numB;
			}
		}
		if (suma == numA) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 
		int numB;
		for (numB = 1; numB <= 10000 ; numB++) {
			if (esPerfect(numB)) {
				System.out.println("El numero " + numB + " es perfecto.");
			}
		}
	}

}
