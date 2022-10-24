package Actividades;
import java.util.Scanner;
public class Ejercicio5x1 {

	public static void main(String[] args) {
		//
		int altura, ancho, i,j;
		boolean dimension;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Altura del rectángulo?");
		altura = teclado.nextInt();
		System.out.println("¿Anchura del rectángulo?");
		ancho = teclado.nextInt();
		
		dimension = true;
		
		if (altura <= 0) {
			System.out.println("La altura del rectángulo debe ser positivo");
			dimension = false;
		}
		if (ancho <= 0) {
			System.out.println("La anchura del rectángulo debe ser positivo");
			dimension = false;
		}
		if (dimension) {
//			Cada linea
			for (i = 1 ; i <= altura ; i++) {
//				Cada columna
				for (j = 1 ; j <= ancho ; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}

	}

}
