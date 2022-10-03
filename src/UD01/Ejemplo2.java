package UD01;

public class Ejemplo2 {

	public static void main(String[] args) {
		//
		int numeroEnteroA, numeroEnteroB;
		numeroEnteroA = 5;
		numeroEnteroB = 7;
		System.out.println("Número entero");
		
		System.out.printf("%d\n", numeroEnteroA);
		System.out.printf("%d %d\n", numeroEnteroA, numeroEnteroB);
		System.out.printf("%3d\n", numeroEnteroA);
		System.out.printf("%03d\n", numeroEnteroA);
		
		double numeroReal = 6.27;
		System.out.println("\nNúmeros reales");
		
		System.out.printf("%f\n", numeroReal);
		System.out.printf("%.2f\n", numeroReal);
		System.out.printf("%5.2f\n", numeroReal);
		System.out.printf("%05.2f\n", numeroReal);
	}

}
