package Actividades;
import java.util.Scanner;
public class Ejercicio4x5 {

	public static void main(String[] args) {
		//
		final int TOTAL_NUMEROS = 10;
		int contador = 0;
		int numA, suma = 0;
		Scanner teclado = new Scanner(System.in);
		
//		while (contador < TOTAL_NUMEROS) {
//			System.out.println("¿Números Enteros: " + contador + "?");
//			numA = teclado.nextInt();
//			suma = suma + numA;
//			contador = contador + 1;
//		}
//		System.out.println("Suma: " + suma);
		
//		do {
//			System.out.println("¿Números Enteros: " + contador + "?");
//			numA = teclado.nextInt();
//			suma = suma + numA;
//			contador = contador + 1;
//		}while (contador < TOTAL_NUMEROS);
//		System.out.println("Suma: " + suma);
		
		for (contador = 0 ; contador < TOTAL_NUMEROS ; contador++) {
			System.out.println("¿Número Entero " +  contador + "?");
			numA = teclado.nextInt();
			suma += numA;
		}
		System.out.println("Suma: " + suma);

	}

}
