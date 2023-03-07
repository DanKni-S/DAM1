package Ejercicio_UsuariosWeb;

import java.util.Comparator;

public class OrdenUsuarioPorNombreAsc implements Comparator<Usuarios> {
	
	@Override
	public int compare(Usuarios usuario1, Usuarios usuario2) {
		
		String nombre1 = usuario1.getNombre();
		String nombre2 = usuario2.getNombre();
		return nombre1.compareTo(nombre2);
	}
}
