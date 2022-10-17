package Actividades;

public class Ejercicio4x4 {

	public static void main(String[] args) {
		//
//		int suma = 0, numA = 1;
		int suma = 0, numA = 0;

//		while (numA <= 50) {
//			System.out.println(numA);
//			suma = suma + numA;
//			numA = numA + 1;
//		}
//		System.out.printf("Suma de los primeros 50 números " + suma );
		
//		do {
//			System.out.println("Suma total: " + suma + "+" + numA);
//			suma = suma + numA;
//			numA = numA + 1;
//		}while (numA <= 50);
//		System.out.println(suma);

		for (int numB = 0; numB <= 50 ; numB++ ) {
			System.out.println("Suma = " + numA + " + " + numB);
			numA = numA + numB;
		}
		System.out.println(numA);
	}

}
