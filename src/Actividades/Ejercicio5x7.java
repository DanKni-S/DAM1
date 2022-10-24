package Actividades;
import java.util.Scanner;
public class Ejercicio5x7 {

	public static void main(String[] args) {
		int numA, numB, a, b;
		boolean numeroValido;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Número A? ");
		numA = teclado.nextInt();
		System.out.println("¿Número B? ");
		numB =  teclado.nextInt();
		
		numeroValido = true;
		
		if (numA > numB) {
			System.out.println("El número A debe ser menor o igual que el número B. ");
			numeroValido = false;
		}
		if (numA <= 0) {
			System.err.println("El número A debe ser positivo. ");
			numeroValido = false;
		}
		if (numB <= 0) {
			System.err.println("El número B debe ser positivo");
			numeroValido = false;
		}
		if (numeroValido) {
			for (a = numA ; a <= numB ; a++) {
				System.out.println("Tabla de multiplicar del número: " + a);
				for (b = 0 ; b <= 10 ; b++) {
					System.out.printf("%2d * %2d = %3d\n", a, b, a * b);
				}
				System.out.println();
			}
		}
	}

}
