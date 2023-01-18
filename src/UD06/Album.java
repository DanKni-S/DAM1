package UD06;

public class Album {
		// Atributos
		private String nombre;
		private String artista;
		private int yearPublicacion;
		private String genero;
		
		// Crear un album a partir de parametros
		public Album(String nombre, String artista, int yearPublicacion, String genero) {
			this.nombre = nombre;
			this.artista = artista;
			this.yearPublicacion = yearPublicacion;
			this.genero = genero;
		}
		// Devuelve una cadena de caractares con el estado de Album
		@Override
		public String toString() {
			return "Album [Nombre = " + nombre + ", Artista = " + artista + ", Año Publicación = " + yearPublicacion + ", Genero = " + genero + "] ";
		}
		// Devuelve en nombre del album, cuando este esta en privado
		public String getNombre() {
			return nombre;
		}
}
