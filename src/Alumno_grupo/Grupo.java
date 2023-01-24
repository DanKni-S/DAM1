package Alumno_grupo;

import UD06.Album;

public class Grupo {
	
	private String nombre;
	private Alumno[] alumnos;
	private int indice;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.alumnos = new Alumno[30];
		this.indice = 0;
	}
	@Override
	public String toString() {
		String cadena = "Grupo [nombre = " + nombre + "]: ";
		if (indice == 0) {
			cadena = cadena + "El grupo no tiene alumnos.";
		} else {
			for (int posicion = 0; posicion < indice; posicion++) {
				Alumno alumno = alumnos[posicion];
				cadena = cadena + "(" + posicion + ")" + alumno.toString() + "\n";
			}
		}
		return cadena;
	}
	public boolean insertar(Alumno alumno) {
		if (indice < alumnos.length) {
			alumnos[indice] = alumno;
			indice++;
			return true;
		} else {
			return false;
		}
	}
	public Alumno consultarAlumno(String numeroExpediente) {
		Alumno alumnoEncontrado = null;
		boolean encontrado = false;
		for(int pos = 0 ; pos < indice && !encontrado ; pos++) {
			Alumno alumno = alumnos[pos];
			if(alumno.getNumeroExpediente().equals(numeroExpediente)) {
				alumnoEncontrado = alumno;
				encontrado = true;
			}
		}
		return alumnoEncontrado;
	}
	public static void main(String[] args) {
		Grupo grupo = new Grupo("DAM1B");
		Alumno alumno = new Alumno("Juan", "001");
		alumno.insertar(new Calificacion("P", 7));
		alumno.insertar(new Calificacion("BD", 7));
		alumno.insertar(new Calificacion("SI", 5));
		alumno.insertar(new Calificacion("ED", 6));
		alumno.insertar(new Calificacion("LM", 6));
		alumno.insertar(new Calificacion("FOL", 8));
		alumno.insertar(new Calificacion("I", 9));
		grupo.insertar(alumno);
		
		Alumno alumno2 = new Alumno("Maria", "002");
		alumno2.insertar(new Calificacion("P", 7));
		alumno2.insertar(new Calificacion("BD", 7));
		alumno2.insertar(new Calificacion("SI", 5));
		alumno2.insertar(new Calificacion("ED", 6));
		alumno2.insertar(new Calificacion("LM", 6));
		alumno2.insertar(new Calificacion("FOL", 8));
		alumno2.insertar(new Calificacion("I", 9));
		grupo.insertar(alumno2);
		
		Alumno alumnoBuscar = grupo.consultarAlumno("001");
		if(alumnoBuscar == null) {
			System.out.println("No encontrado");
		}
		else {
			System.out.println(alumnoBuscar.toString());
		}
	}
	
}
