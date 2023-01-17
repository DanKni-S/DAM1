package UD06;

public class Coleccion {

	// Atributos
	private Album[] vectorAlbum;
	private int contadorAlbum;
	// El numero de albumes guardados en el vector
	// La primera posición libre del vector

	// Crear una coleccion vacia
	public Coleccion(int capacidad) {
		vectorAlbum = new Album[capacidad];
		contadorAlbum = 0;
	}

	// Devuelve una cadena de caracteres con el estado de la coleccion
	@Override
	public String toString() {
		String cadena = "";
		if (contadorAlbum == 0) {
			cadena = "La colección no tiene álbumes.";
		} else {
			for (int posicion = 0; posicion < contadorAlbum; posicion++) {
				Album album = vectorAlbum[posicion];
				cadena = cadena + "(" + posicion + ")" + album.toString() + "\n";
			}
		}
		return cadena;
	}

	// Inserta un album en la coleción
	// Devuelve verdadero si el album se ha insertado correctamente
	// Devuelve falso si el vector esta lleno
	public boolean insertar(Album album) {
		if (contadorAlbum < vectorAlbum.length) {
			vectorAlbum[contadorAlbum] = album;
			contadorAlbum++;
			return true;
		} else {
			return false;
		}
	}

	// Elimina un album, por posición, de la colección
	// Devuelve verdadero si el album se ha eliminado
	// Devuelve falso si el vector esta vacíon o si la posición es errónea
	public boolean eliminar(int posicion) {
		if (posicion < contadorAlbum && posicion >= 0) {
			while (posicion < contadorAlbum) {
				vectorAlbum[posicion] = vectorAlbum[posicion + 1];
				posicion++;
			}
			vectorAlbum[posicion] = null;
			contadorAlbum--;
			return true;
		} else {
			return false;
		}
	}
}
