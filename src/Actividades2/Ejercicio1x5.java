package Actividades2;

public class Ejercicio1x5 {
	
	public static int contarDivisores(int numA) {
		int numeroDivisores = 0;
		int divisor;
		for (divisor = 1 ; divisor <= numA ; divisor++) {
			if (numA % divisor == 0) {
				System.out.println(divisor + " ");
			}
		}
		System.out.println();
		return numeroDivisores;
	}
	public static void main(String[] args) {
		// 
		
		

	}

}
