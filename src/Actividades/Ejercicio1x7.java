package Actividades;

import java.util.Scanner;

public class Ejercicio1x7 {

	public static void main(String[] args) {
		//
		double nradio, naltura, pi = 3.14159265359;
		System.out.println("Introduce cantidad de radio: ");
		Scanner radio = new Scanner(System.in);
		nradio = radio.nextDouble();
		System.out.println("Introduce cantidad de altura: ");
		Scanner altura = new Scanner(System.in);
		naltura = altura.nextDouble();

		System.out.printf("Volumen: %.3f", pi * (nradio * nradio) * naltura);
	}

}
