package Actividades;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//
		double nchicos, nchicas;
		System.out.println("Introduce numero de chicos");
		Scanner chicos = new Scanner(System.in);
		nchicos = chicos.nextInt();
		System.out.println("Introduce numero de chicas");
		Scanner chicas = new Scanner(System.in);
		nchicas = chicas.nextInt();

		System.out.printf("Porcentaje de chicos: %.2f\n", (nchicos * 100) / (nchicos + nchicas));
		System.out.printf("Porcentaje de chicas: %.2f", (nchicas * 100) / (nchicos + nchicas));
	}

}
