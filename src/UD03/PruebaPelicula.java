package UD03;

import entrada.Teclado;

public class PruebaPelicula {

	public static void main(String[] args) {

//		Peliculas pelicula1 = new Peliculas();
//		System.out.println(pelicula1.getNombre());
//		System.out.println(pelicula1.getDuracion());
//		System.out.println(pelicula1.getdobladaCastellano());
//		System.out.println(pelicula1.getPuntuacion());
//		
//		pelicula1.setNombre("El señor de los Anillos: El Retorno del Rey");
//		pelicula1.setDuracion(250);
//		pelicula1.setdobladaCastellano(true);
//		pelicula1.setPuntuacion(9.7);
//		
//		System.out.println(pelicula1.getNombre());
//		System.out.println(pelicula1.getDuracion());
//		System.out.println(pelicula1.getdobladaCastellano());
//		System.out.println(pelicula1.getPuntuacion());

		String nombre = Teclado.leerCadena("Introduce Nombre: ");
		int duracion = Teclado.leerEntero("Introduce la duración: ");
		boolean dobladaCastellano = Teclado.leerBooleano("Esta doblada al Castellano? ");
		double puntuacion = Teclado.leerReal("Introduce la puntuacicón: ");

		Peliculas pelicula2 = new Peliculas(nombre, duracion, dobladaCastellano, puntuacion);
		System.out.println(pelicula2.getNombre());
		System.out.println(pelicula2.getDuracion());
		System.out.println(pelicula2.getdobladaCastellano());
		System.out.println(pelicula2.getPuntuacion());

	}

}
