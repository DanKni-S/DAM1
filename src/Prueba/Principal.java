package Prueba;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println("");
		System.out.println("(0) Salir de programa ");
		System.out.println("(1) Insertar un producto en la primera posicion del inventario ");
		System.out.println("(2) Buscar un producto por codigo ");
		System.out.println("(3) Consultar todos los productos perecederos del invetario sin caducar ");
		System.out.println("");
	}
	
	public static String pasoLetras(int letras) {
		String numeroCadena = "";
		for(int pos = 0 ; pos < letras ; pos++) {
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(97, 123);
			char caracter = (char) numero;
			numeroCadena += caracter;
		}
		return numeroCadena;
	}
	
	public static void main(String[] args) {
		String nombre;
		int diasCaducar; 
		int opcion; 
		int capMax; 
		int posicion, letras;
		Producto producto;
		Producto[] vectorProducto;
		
		capMax = Teclado.leerEntero("¿Capacidad máxima? ");
		Inventario inventario = new Inventario(capMax);
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Opcion (0 - 3)");
			switch(opcion) {
			case 0:
				break;
			case 1:
				letras = Teclado.leerEntero("Número de letras del producto: ");
				nombre = pasoLetras(letras);
				diasCaducar = Teclado.leerEntero("¿Días de caducar? ");
				producto = new Producto(nombre, diasCaducar);
				if(inventario.insertar(producto)) {
					System.out.println("Se ha insertado un producto en el inventario. ");
				}
				else {
					System.out.println("Error al insertar un producto. ");
					System.out.println("El inventario esta lleno. ");
				}
				break;
			case 2:
				posicion = Teclado.leerEntero("¿Posicion? ");
				producto = inventario.consultar(posicion);
				if(producto == null) {
					System.out.println("No hay ningún producto en la posción del inventario. ");
				}
				else {
					System.out.println(producto);
				}
				break;
			case 3:
				vectorProducto = inventario.recorrerProducto();
				System.out.println(Arrays.toString(vectorProducto));
				break;
			}
			
		}while(opcion != 0);
		
	}
}
