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
	// consultar album, por posicion, de la colección
	// Devuelve null si la posicion no es valida o si el vector esta vacio
	public Album consultar(int posicion) {
		if(posicion < contadorAlbum && posicion >= 0) {
			return vectorAlbum[posicion];
		}
		else {
			return null;
		}
	}
	// Consultar album, por posicion, de la colección
	// Se supone que el nombre no esta repetido en la colección
	// Devolvera null cuando no hay ningun album con el nombre buscado
	public Album consultarNombre(String nombre) {
		boolean encontrado = false;
		Album albumEncontrado = null;
		Album album;
		for(int posicion = 0 ; posicion < contadorAlbum && !encontrado ; posicion++) {
			album = vectorAlbum[posicion];
			if(nombre.equals(album.getNombre())) {
				encontrado = true;
				albumEncontrado = album;
			}
		}
		return albumEncontrado;
	}
}
