package Actividades;
import java.util.Scanner;
public class Ejercicio4x6 {

	public static void main(String[] args) {
		//
		int contador = -1;
		int suma = 0, numA = 0;
		double media;
		Scanner teclado = new Scanner(System.in);
//		System.out.println("¿Número Entero (0 para salir)? ");
//		numA = teclado.nextInt();
		
//		while (numA != 0) {
//			contador++;
//			suma += numA;
//			System.out.println("¿Número Entero (0 para salir)? ");
//			numA = teclado.nextInt();
//		}
//		if (contador == 0) {
//			System.out.println("No hay media aritmética. ");
//		}
//		else {
//			media = (double) suma / contador;
//			System.out.printf("Media Aritmética: %f\n", media);
//		}
		
		do {
			contador++;
			suma += numA;
			System.err.println("¿Número Entero (0 para salir)?");
			numA = teclado.nextInt();
		}while (numA !=0);
		
		if (contador == 0) {
			System.out.println("No hay media aritmética. ");
		}
		else {
			media = (double) suma / contador;
			System.out.printf("Media Aritmética: %.1f\n", media);
		}
	}

}
