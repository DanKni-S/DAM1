package Lista_personas;

import java.util.Comparator;

public class OrdenPersonaPorEdad implements Comparator<Persona> {
	
	// Compara dos personas por la edad de forma descendente
	@Override
	public int compare(Persona persona1, Persona persona2) {
		Integer edad1 = persona1.getEdad();
		Integer edad2 = persona2.getEdad();
		return edad2.compareTo(edad1);
	}
}
