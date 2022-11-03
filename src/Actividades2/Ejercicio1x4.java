package Actividades2;

public class Ejercicio1x4 {

	public static void main(String[] args) {
		//
		for (int numA = 1; numA <= 9; numA++) {
			for (int numB = 2; numB <= 6; numB++) {
				System.out.printf(" %d ^ %d = %6d", numA, numB, elevar(numA, numB));
				System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static int elevar(int base, int exponente) {
		int operacion = 1;
		for (int numA = 0; numA < exponente; numA++) {
			operacion = operacion * base;
		}
		return operacion;
	}

}
