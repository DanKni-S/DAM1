package Conjunto_turismo;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import entrada.Teclado;

public class GestionConjuntoTurismo {

	public static void escribirMenu() {
		System.out.println("");
		System.out.println("(0) Salir de programa");
		System.out.println("(1) Insertar un turismo en el conjunto. ");
		System.out.println("(2) Consultar todos los turimso del conjunto por order de insercion. ");
		System.out.println("(3) Eliminar un turimos, por matricula, del conjunto. ");
		System.out.println("(4) Ordenar el conjunto por matricula ascendente. ");
		System.out.println("(5) Ordenar el conjunto por precio descendente. ");
		System.out.println("");
	}

	public static void main(String[] args) {
		Set<Turismo> conjunto = new LinkedHashSet<Turismo>();
		int opcion, agno;
		String matricula, marca, modelo;
		double precio;
		Turismo turismo;

		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Elije una opción? ");
			switch (opcion) {
			case 0:
				// Salir de programa
				break;
			case 1:
				// Insertar un turismo en el conjunto.
				matricula = Teclado.leerCadena("Matricula? ");
				turismo = new Turismo(matricula, "", "", 0, 0.0);
				if (conjunto.contains(turismo)) {
					System.out.println("Se ha encontrado un turismo con esa matricula. ");
				} else {
					marca = Teclado.leerCadena("Marca? ");
					modelo = Teclado.leerCadena("Modelo? ");
					agno = Teclado.leerEntero("Año? ");
					precio = Teclado.leerReal("Precio? ");
					turismo = new Turismo(matricula, marca, modelo, agno, precio);
					if (conjunto.add(turismo)) {
						System.out.println("Turismo insertado en el conjunto. ");
					} else {
						System.err.println("No se ha podido insertar el turismo. ");
					}

				}
				break;
			case 2:
				// Consultar todos los turimso del conjunto por order de insercion.
				if (conjunto.isEmpty()) {
					System.out.println("Conjunto vacío. ");
				} else {
					for (Turismo t : conjunto) {
						System.out.println(t.toString());
					}
					System.out.println(conjunto.size() + "turismos consultados. ");
				}
				break;
			case 3:
				// Eliminar un turimos, por matricula, del conjunto.
				matricula = Teclado.leerCadena("");
				turismo = new Turismo(matricula, "", "", 0, 0.0);
				if (conjunto.remove(turismo)) {
					System.out.println("Turismo eliminado del conjunto. ");
				} else {
					System.out.println("No hay ningun turismo con esa matricula. ");
				}
				break;
			case 4:
				// Ordenar el conjunto por matricula ascendente.
				break;
			case 5:
				// Ordenar el conjunto por precio descendente.
				break;
			default:
				System.err.println("Opcion no validad. ");
				break;
			}

		} while (opcion != 0);
		System.err.println("Programa Finalizado. ");
	}

}
