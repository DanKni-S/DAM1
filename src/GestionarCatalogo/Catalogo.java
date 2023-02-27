package GestionarCatalogo;

import Actividades6.Bebidas;

public class Catalogo {

	private Video[] videos;
	private int indice;

	public Catalogo(int capacidad) {
		this.videos = new Video[capacidad];
		this.indice = 0;
	}

	public boolean estaVacio() {
		return (indice == 0);
	}

	public boolean estaLleno() {
		return (indice == videos.length);
	}

	public boolean insertar(Video video) {
		if (indice < videos.length) {
			videos[indice] = video;
			indice++;
			return true;
		} else {
			return false;
		}
	}
	public int obtenerNumeroVideo() {
		return indice;
	}

	@Override
	public String toString() {
		String cadena = "";
		for (int pos = 0; pos < indice; pos++) {
			Video video = videos[pos];
			cadena = cadena + "(" + pos + ")" + videos.toString() + "\n";
		}
		return cadena;
	}
	
//	public Catalogo consultarPelicula(String director) {
//		Catalogo consultarPeli = new Catalogo(videos.length);
//		for(int pos = 0 ; pos < indice ; pos++) {
//			Peliculas pelicula = (Peliculas) videos;
//			if(pelicula instanceof Video) {
//				
//			}
//		}
//	}
}
