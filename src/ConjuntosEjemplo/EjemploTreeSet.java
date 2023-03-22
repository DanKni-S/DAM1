package ConjuntosEjemplo;

import java.util.TreeSet;

public class EjemploTreeSet {

	public static void main(String[] args) {
		TreeSet<String> conjunto = new TreeSet<String>();
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
