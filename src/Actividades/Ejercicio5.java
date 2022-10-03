package Actividades;

public class Ejercicio5 {

	public static void main(String[] args) {
		//
		double numA, numB;
		numA = 12.345;
		numB = 98.765;
		System.out.println("Números con dos dígitos decimales");
		System.out.printf("A = %.2f\n", numA);
		System.out.printf("B = %.2f\n", numB);
		
		System.out.println("\nNúmeros con un digito");
		System.out.printf("A = %.1f\n", numA);
		System.out.printf("B = %.1f\n", numB);
		
		System.out.println("\nNúmero con ningún digito decimal");
		System.out.printf("A = %.0f\n", numA);
		System.out.printf("A = %.0f\n", numB);
	}

}
