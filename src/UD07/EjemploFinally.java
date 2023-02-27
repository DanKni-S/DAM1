package UD07;

import entrada.Teclado;

public class EjemploFinally {
	
	public static double dividir(int dividendo, int divisor) {
		double cociente = 0.0;
		try {
			cociente = (double) dividendo / divisor;
		}
		catch(ArithmeticException ex) {
			System.out.println("Error aritmético: ");
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
		finally {
			System.out.println("Fin de dividir. ");
		}
		return cociente;
	}
	public static void main(String[] args) {
		int a = Teclado.leerEntero("Número A? ");
		int b = Teclado.leerEntero("Número B? ");
		double c = dividir(a,b);
		
		System.out.println("Cociente " + c);
	}
}
