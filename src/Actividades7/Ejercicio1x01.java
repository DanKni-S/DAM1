package Actividades7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1x01 {

	public String solicitarCadena(String mensaje) throws IOException {
		String cadena = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		System.out.println(mensaje);
		cadena = teclado.readLine();
		return cadena;
	}

	public static int solicitarEnteroCorto(String mensaje, int numMaxEntero) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadena ="";
		short numE = 0;
		boolean error = true;
		int contadorError = 0;
		while(error && contadorError <= numMaxEntero ) {
			try {
				System.out.println(mensaje);
				numE = Short.parseShort(cadena);
				error = false;
			}
			catch (NumberFormatException nfe) {
				contadorError++;
				System.out.println("El dato introducido no tiene formato de entero. ");
				System.out.println(nfe.toString());
				System.out.println("Error número " + contadorError + ".");
			}
		}
		if(contadorError > numMaxEntero) {
			System.out.println("Se ha superado el numero de errores permitidos");
		}
		return numE;
	}

	public static void main(String[] args) {
		try {
			short dividendo = solicitarEnteroCorto("Dividendo? ", 6);
			short divisor = solicitarEnteroCorto("Diviror? ", 5);
			if(dividendo % divisor == 0) {
				System.out.println(dividendo + " es divisible enter " + divisor);
			}
			else {
				System.err.println(dividendo + " no es divisible entre " + divisor);
			}
			System.out.println("cociente: " + (dividendo / divisor));
			System.out.println("resto: " + (dividendo % divisor));
		}
		catch(ArithmeticException ex) {
			System.out.println("Error aritmético: ");
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
		catch(IOException ioe) {
			System.out.println();
			System.out.println(ioe.toString());
		}
	}
}
