package Actividades;

import java.util.Scanner;

public class Ejercicio3x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Introduce un año: ");
		Scanner teclado = new Scanner(System.in);
		year = teclado.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || ((year % 400 == 0))) {
			System.out.println("El año " + year + " es bisieto");
		}
		else {
			System.out.println("El año " + year + " no es bisiesto");
		}
	}
}