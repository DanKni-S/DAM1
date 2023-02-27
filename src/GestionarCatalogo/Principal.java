package GestionarCatalogo;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir de programa. ");
		System.out.println("(1) Insertar una película. ");
		System.out.println("(2) Insertar una serie. ");
		System.out.println("(3) Consultar todos los vídeos. ");
		System.out.println("(4) Consultar las películas de un director. ");
		System.out.println("(5) Consultar las series por el año de inicio de emisión. ");
		System.out.println("(6) Eliminar un vídeo por código ");
		System.out.println("(7) Reorganizar el catálogo de forma que primero estén las películas y luego las series. ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		int opcion, contarPeli, contarSerie;
		int anyoEstreno, anyoInicio, anyoFin, numTemporadas, numCapitulos;
		String director;
		String titulo;
		Catalogo catalogo = new Catalogo(20);
		Peliculas pelicula;
		Series serie;
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opcion (0 - 7)?" );
			switch(opcion) {
			case 0:
				
				break;
			case 1:
				titulo = Teclado.leerCadena("¿Título? ");
				anyoEstreno = Teclado.leerEntero("¿Año de estreno? ");
				director = Teclado.leerCadena("¿Director? ");
				pelicula = new Peliculas(titulo, anyoEstreno, director);
				if(catalogo.insertar(pelicula)) {
					System.out.println("Película insertada correctamente. ");
				}
				else {
					System.err.println("Película no insertada. ");
				}
				break;
			case 2:
				titulo = Teclado.leerCadena("¿Título? ");
				anyoInicio = Teclado.leerEntero("¿Año de inicio? ");
				anyoFin = Teclado.leerEntero("¿Año de fin? ");
				numTemporadas = Teclado.leerEntero("¿Número de temporadas? ");
				numCapitulos = Teclado.leerEntero("¿Número de capítulos? ");
				serie = new Series(titulo, anyoInicio, anyoFin, numTemporadas, numCapitulos);
				if(catalogo.insertar(serie)) {
					System.out.println("Serie insertada correctamente. ");
				}
				else {
					System.out.println("Serie no insertada. ");
				}
				break;
			case 3:
				if(catalogo.estaVacio()) {
					System.err.println("El catalogo esta vació. ");
				}
				else {
					System.out.println();
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}
		}while(opcion != 0);
	}
	
}
