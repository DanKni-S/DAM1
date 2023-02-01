package Prueba;

public class Inventario {
	private Producto[] productos;
	private Producto[] vectorCaducar;
	private int contadorProducto;
	
	public Inventario (int capacidadMax) {
		productos = new Producto[capacidadMax];
		vectorCaducar = new Producto[capacidadMax];
		contadorProducto = 0;
	}
	
	@Override
	public String toString() {
		if(contadorProducto == 0) {
			return ("El inventario esta vacio. ");
		}
		else {
			String cadena = "";
			for(int pos = 0 ; pos < contadorProducto ; pos++) {
				cadena += "(" + pos + ")" + productos[pos].toString() + "\n";
			}
			return cadena;
		}
	}
	
	public boolean insertar(Producto producto) {
		if(contadorProducto >= productos.length) {
			return false;
		}
		else {
			productos[contadorProducto] = producto;
			contadorProducto++;
			return true;
		}
	}
	
	public Producto consultar(int posicion) {
		if(posicion < productos.length && posicion >= 0) {
			Producto producto = productos[posicion];
			return producto;
		}
		else {
			return null;
		}
	}
	
	public Producto[] recorrerProducto() {
		int contador = 0;
		vectorCaducar = new Producto[contadorProducto];
		for(int pos = 0 ; pos < contadorProducto ; pos++) {
			Producto caducados = productos[pos];
			if(caducados.caducado()) {
				vectorCaducar[contador] = caducados;
				contador++;
			}
		}
		return vectorCaducar;
	}
}
