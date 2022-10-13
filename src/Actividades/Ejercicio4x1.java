package Actividades;
import java.util.Scanner;
public class Ejercicio4x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA;
		numA = 1;
		Scanner teclado = new Scanner(System.in);
		//numA = teclado.nextInt();
		do {
			System.out.println("¿Número Entero (0 para salir): " );
			numA = teclado.nextInt();
		}while (numA != 0);
		//while (numA != 0) {
			//System.out.println("¿Número Entero (0 para salir): ");
				//numA = teclado.nextInt();
		//}
	}

}
