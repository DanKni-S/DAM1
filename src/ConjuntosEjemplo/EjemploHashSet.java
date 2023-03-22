package ConjuntosEjemplo;

import java.util.HashSet;

public class EjemploHashSet {
	
	public static void main(String[] args) {
		// Crear un hash set de cadenas
		HashSet<String> conjunto = new HashSet<String>();
		conjunto.add("Jaime");
		conjunto.add("Tobias");
		conjunto.add("Alvaro");
		conjunto.add("Pedro");
		conjunto.add("Jaime");
		
		/* for(String nombre : conjunto) {
			System.out.println(nombre);
		} */
		System.out.println(conjunto.toString());
	}
}
