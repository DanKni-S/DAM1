package Actividades2;

import java.util.Scanner;

public class Ejercicio1x3 {

	public static int Invertido(int numA) {
		int numInvertir = 0;
		int digito;
		while (numA > 0) {
			digito = numA % 10;
			numInvertir = numInvertir * 10 + digito;
			numA /= 10;
		}
		return numInvertir;
	}

	public static boolean esCapicua(int numA) {
		int numInvertir = Invertido(numA);
		if (numA == numInvertir) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		//
		int numA, numIni, numFinal, numCapicuas, contadorCapicuas;
		boolean error;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Número Inicial? ");
		numIni = teclado.nextInt();
		
		System.out.println("¿Número Final? ");
		numFinal = teclado.nextInt();

		error = false;
		if (numIni <= 0) {
			System.out.println("El número incial debe ser positivo. ");
			error = true;
		}
		if (numFinal <= 0) {
			System.out.println("El número final debe ser positivo. ");
			error = true;
		}
		if (numIni <= numFinal) {
			System.out.println("El número inicial debe ser menor o igual que " + " el número final. ");
			error = true;
		}
		if (!error) {
			contadorCapicuas = 0;
			for (numA = numIni; numA <= numFinal; numA++) {
				
			}
		}

	}

}
