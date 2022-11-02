package Actividades2;

public class Ejercicio1x4 {

	public static void main(String[] args) {
		//
		for (int a = 1; a <= 9; a++) {
			for (int b = 2; b <= 6; b++) {
				System.out.printf(" %d ^ %d = %6d", a, b, elevar(a, b));
				System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static int elevar(int base, int exponente) {
		int operacion = 1;
		for (int a = 0; a < exponente; a++) {
			operacion = operacion * base;
		}
		return operacion;
	}

}
