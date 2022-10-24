package Actividades;
import java.util.Scanner;
public class Ejercicio5x2 {

	public static void main(String[] args) {
		// 
		int altura, i, j;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Altura del Triángulo? ");
		altura = teclado.nextInt();
		
		if (altura <= 0) {
			System.out.println("La altura del triángulo debe ser positivo");
		}
		else {
			for (i = 1 ; i <= altura ; i++) {
				for (j = i ; j <= i ; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}
