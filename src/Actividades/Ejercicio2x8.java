package Actividades;

import java.util.Scanner;

public class Ejercicio2x8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double ncompra, descuento, ndescuento;
		System.out.println("Importe de la compra: ");
		ncompra = teclado.nextDouble();
		if (ncompra < 0) {
			System.out.println("El importe de la compra debe ser positivo");
		} else {
			if (ncompra < 200) {
				System.out.println("\nRebaja: 0,00\n");
				System.out.printf("Importe con descuento: " + "%.2f\n", ncompra);
			} else {
				if (ncompra < 801 && ncompra > 199) {
					descuento = ncompra * 0.1;
					ndescuento = ncompra - descuento;
					System.out.printf("\nRebaja: " + "%.2f\n", descuento);
					System.out.printf("Importe con descuento: " + "%.2f\n", ndescuento);
				} else {
					descuento = ncompra * 0.15;
					ndescuento = ncompra * descuento;
					System.out.printf("\nRebaja: " + "%.2f\n", descuento);
					System.out.printf("Importe con descuento: " + "%.2f\n", ndescuento);
				}
			}
		}
	}

}
