package Actividades3;

import Constructor.Personas;
import entrada.Teclado;

public class Ejercicio1x02 {

	public static void main(String[] args) {
		
		String nombre, apellido;
		int edad;
		double altura;
		boolean activo;
		
		nombre = Teclado.leerCadena("¿Nombre? ");
		apellido = Teclado.leerCadena("¿Apellido? ");
		edad = Teclado.leerNatural("¿Edad? ");
		altura = Teclado.leerReal("¿Altura? ");
		activo = Teclado.leerBooleano("¿Está en Activo? ");
		
		Personas persona1 = new Personas (nombre, apellido, edad, altura, activo);
		System.out.println(persona1.obtenerEstado());
		
		nombre = Teclado.leerCadena("¿Nombre? ");
		apellido = Teclado.leerCadena("¿Apellido? ");
		edad = Teclado.leerNatural("¿Edad? ");
		altura = Teclado.leerReal("¿Altura? ");
		
		Personas persona2 = new Personas (nombre, apellido, edad, altura);
		System.out.println(persona2.obtenerEstado());
		
		
		Personas persona3 = new Personas ();
		System.out.println(persona3.obtenerEstado());
	}

}
