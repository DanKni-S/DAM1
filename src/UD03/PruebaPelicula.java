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
		
		String Nombre = Teclado.leerCadena("Introduce Nombre: ");
		int duracion = Teclado.leerEntero("Introduce la duración: ");
		boolean dobladaCastellano = Teclado.leerBooleano("Esta doblada al Castellano?");
		

	}

}