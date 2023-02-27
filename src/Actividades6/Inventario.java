package Actividades6;

public class Inventario {
	private Bebidas[] bebidas;
	private int indice;
	
	public Inventario(int capacidad) {
		this.bebidas = new Bebidas[capacidad];
		this.indice = 0;
	}
	
	public boolean insertar(Bebidas bebida) {
		if(indice < bebidas.length) {
			bebidas[indice] = bebida;
			indice++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean estaVacio() {
		return (indice == 0);
	}
	public boolean estaLleno() {
		return (indice == bebidas.length);
	}
	public int bebidaGuardada() {
		return indice;
	}
	
//	public Inventario dosPrecios(double precioMin, double precioMax) {
//		
//	}
	
	public int contarGaseosos() {
		int contarGaseosos = 0;
		for(int pos = 0 ; pos < indice ; pos++) {
			Bebidas bebida = bebidas[pos];
			if(bebida instanceof Refresco) {
				Refresco refresco = (Refresco) bebida;
				if(refresco.esGaseosos()) {
					contarGaseosos++;
				}
			}
		}
		return contarGaseosos;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		for(int pos = 0 ; pos < indice ; pos++) {
			Bebidas bebida = bebidas[pos];
			cadena = cadena + "(" + pos + ")" + bebida.toString() + "\n" + "Precio = " + bebida.Precio() + "\n";
		}
		return cadena;
	}
}
