package ConjuntosEjemplo;

import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {
	
	public static void main(String[] args) {
		LinkedHashSet<String> conjunto = new LinkedHashSet<String>();
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
