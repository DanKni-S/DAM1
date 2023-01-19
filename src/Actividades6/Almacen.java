package Actividades6;

public class Almacen {
	
	private Videojuego[] vectorJuego;
	private int indice;
	
	public Almacen(int capacidad) {
		vectorJuego = new Videojuego[capacidad];
		indice = 0;
	}
	@Override
	public String toString () {
		String cadena = "";
		if(indice == 0) {
			cadena = "El almacen está vacío. ";
		}
		else {
			Videojuego videojuego;
			for(int posicion = 0 ; posicion < indice ; posicion++) {
				videojuego = vectorJuego[posicion];
				cadena = cadena + "(" + posicion + ")" + videojuego.toString() + "\n";
			}
			cadena = cadena + "Se han consultado " + indice + " videojuego del almacén. ";
		}
		return cadena;
	}
	public boolean insertar(Videojuego videojuego) {
		boolean insertado = false;
		if(indice < vectorJuego.length) {
			vectorJuego[indice] = videojuego;
			indice++;
			insertado = true;
		}
		return insertado;
	}
	
	public boolean eliminar(int posicion) {
		boolean eliminado = false;
		if(posicion >= 0 && posicion < indice) {
			while(posicion < indice -1) {
				vectorJuego[posicion] = vectorJuego[posicion + 1];
				posicion++;
			}
			vectorJuego[posicion] = null;
			indice--;
			eliminado = true;
		}
		return eliminado;
	}
	public Videojuego consultar(int posicion) {
		Videojuego juegoPosicion = null;
		if(posicion >= 0 && posicion < indice) {
			juegoPosicion = vectorJuego[posicion];
		}
		return juegoPosicion;
	}
}
