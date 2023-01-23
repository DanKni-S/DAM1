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
	public boolean insertar(Alumno alumno) {
		if (indice < alumnos.length) {
			alumnos[indice] = alumno;
			indice++;
			return true;
		} else {
			return false;
		}
	}
	public Calificacion[] consultarCalificacionesAlu(String numeroExpediente) {
		if(indice == 0) {
			return null;
		}
		else {
			Calificacion[] calificaciones = null;
			boolean encontrado = false;
			for(int pos = 0 ; pos < indice ; pos++) {
				Alumno alumno = alumnos[pos];
				if(alumno.getNumeroExpediente().equals(numeroExpediente)) {
					calificaciones = alumno.getCalificaciones();
					encontrado = true;
				}
			}
			return calificaciones;
		}
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
		
		Calificacion[] calificaciones = grupo.consultarCalificacionesAlu("1");
		if(calificaciones == null) {
			System.out.println("No hay");
		}
		else {
			
		}
	}
	
}
