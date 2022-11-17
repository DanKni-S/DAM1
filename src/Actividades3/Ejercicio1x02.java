package Actividades3;

import Constructor.Personas;
import entrada.Teclado;

public class Ejercicio1x02 {

	public static void main(String[] args) {

		String nombre, apellido;
		int edad, altura;
		boolean activo;
		System.out.println("Persona 1");
		nombre = Teclado.leerCadena("¿Nombre? ");
		apellido = Teclado.leerCadena("¿Apellido? ");
		edad = Teclado.leerNatural("¿Edad? ");
		altura = Teclado.leerNatural("¿Altura? ");
		activo = Teclado.leerBooleano("¿Está en Activo? ");

		Personas persona1 = new Personas(nombre, apellido, edad, altura, activo);
		System.out.println(persona1.obtenerEstado());

		System.out.println("Persona 2");
		nombre = Teclado.leerCadena("¿Nombre? ");
		apellido = Teclado.leerCadena("¿Apellido? ");
		edad = Teclado.leerNatural("¿Edad? ");
		altura = Teclado.leerNatural("¿Altura? ");

		Personas persona2 = new Personas(nombre, apellido, edad, altura);
		System.out.println(persona2.obtenerEstado());
		
		System.out.println("Persona 3");
		Personas persona3 = new Personas();
		System.out.println(persona3.obtenerEstado());
	}

}
