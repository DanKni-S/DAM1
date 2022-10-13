package Actividades;

public class Ejercicio4x4 {

	public static void main(String[] args) {
		//
		int suma = 0;
		int numA = 0;

		while (numA <= 50) {
			suma = suma + 1;
			numA = numA + 1;
			suma = suma + numA;
		}
		System.out.printf("Suma de los primeros 50 números " + suma );

//		for (int numB = 0; numB <= 50 ; numB++ ) {
//			System.out.println("Suma = " + numA + " + " + numB);
//			numA = numA + numB;
//		}
//		System.out.printf("Suma de los primeros 50 números %d\n", numA);
	}

}
