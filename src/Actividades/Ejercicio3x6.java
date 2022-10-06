package Actividades;

import java.util.Scanner;

public class Ejercicio3x6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ica;
		System.out.println("Introduce la calidad de aire: ");
		Scanner teclado = new Scanner(System.in);
		ica = teclado.nextInt();
		if (ica >= 0 || ica <= 500) {
			if (ica <= 50) {
				System.out.println("Bueno");
			} else if (ica <= 100) {
				System.out.println("Moderado");
			} else if (ica <= 150) {
				System.out.println("No saludable para Grupos sensibles");
			} else if (ica <= 200) {
				System.out.println("No saludable para todos");
			} else if (ica <= 300) {
				System.out.println("Insalubre");
			} else {
				System.out.println("Peligroso");
			}
		}
	}

}
// && = Y
// || = o
