package UD01;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinero, articulo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el dinero que tiene disponible ");
		dinero = teclado.nextInt();
		
		System.out.println("Introduzca el precio del articulo ");
		articulo = teclado.nextInt();
		
		for (articulo = 0 ; articulo <= dinero ; articulo++) {
			dinero = dinero - articulo;
			if (articulo <= dinero) {
				System.out.println("Introduzca el precio del articulo ");
				articulo = teclado.nextInt();
			}
			else {
				System.out.println("Sobrepasa el limite del dinero");
			}
		}

	}

}
