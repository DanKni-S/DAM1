package Actividades;
import java.util.Scanner;
public class Ejercicio4x13 {

	public static void main(String[] args) {
		// 
		final int TOTAL = 10;
		int numA, contador;
		int contadorC = 0, contadorP = 0, contadorN = 0;
		int sumaP = 0, sumaN = 0;
		double mediaP, mediaN;
		Scanner teclado = new Scanner(System.in);
		for (contador = 1 ; contador <= TOTAL ; contador++) {
			System.out.println("¿Número Entero " + (contador-1) + "? ");
			numA = teclado.nextInt();
			if (numA == 0) {
				contadorC++;
			}
			else if (numA > 0) {
				contadorP++;
				sumaP += numA;
			}
			else {
				contadorN++;
				sumaN += numA;
			}
		}
		System.out.println("Números de Ceros: " + contadorC);
		if (contadorP > 0) {
			mediaP = (double) sumaP / contadorP;
			System.out.printf("Media Aritmética de Números positivos: %.1f\n", + mediaP);
		}
		else {
			System.out.println("No hay media aritmética de numeros positivos");
		}
		if (contadorN > 0) {
			mediaN = (double) sumaN / contadorN;
			System.out.printf("Media Aritmética de Números negativos: %.1f\n", + mediaN);
		}
		else {
			System.out.println("No hay media aritmética de números negativos");
		}
	}

}
