package UD01;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinero, articulo = 1, suma = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el dinero que tiene disponible ");
		dinero = teclado.nextInt();
		while (articulo != -1) {
			System.out.println("Introduzca el precio del articulo ");
			articulo = teclado.nextInt();
			if (articulo != -1) {
				suma = suma + articulo;
				if (suma > dinero) {
					System.out.println("Sobrepasa el limite del dinero");
					suma = suma - articulo;
				}

			}
		}
		System.out.println("Total: " + suma);
	}

}
