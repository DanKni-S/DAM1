package Actividades;
import java.util.Scanner;
public class Ejercicio4x2 {

	public static void main(String[] args) {
		// 
		int numA = 1;
		Scanner teclado = new Scanner(System.in);
		//numA = teclado.nextInt();
		do {
			System.out.println("¿Número Entero (Número entre 1 y 5 para salir)");
			numA = teclado.nextInt();
		}while (numA < 1 || numA > 5);
			System.out.println("Finaliza el bucle");
	}

}
