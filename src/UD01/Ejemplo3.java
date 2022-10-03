package UD01;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// 
		Scanner teclado = new Scanner(System.in);
		int dato;
		System.out.println("Dime un número: ");
		dato = teclado.nextInt();
		System.out.println("El número que has escrito es: " + dato);
	}

}
