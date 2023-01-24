package Alumno_grupo;

import UD06.Album;

public class Alumno {

	private String nombre;
	private String numeroExpediente; // único ("Clave Primaria" cada alumno tiene su numero de expediente)

	private Calificacion[] calificaciones;
	private int indice;

	public Alumno(String nombre, String numeroExpediente) {
		this.nombre = nombre;
		this.numeroExpediente = numeroExpediente;
		this.calificaciones = new Calificacion[7];
		this.indice = 0;
	}
	@Override
	public String toString() {
		String cadena = "Alumno [nombre = " + nombre + ", Numero Expediente = " + numeroExpediente + "]: ";
		if (indice == 0) {
			cadena = cadena + "El alumno no tiene calificaciones.";
		} else {
			for (int posicion = 0; posicion < indice; posicion++) {
				Calificacion calif = calificaciones[posicion];
				cadena = cadena + "(" + posicion + ")" + calif.toString() + "\n";
			}
		}
		return cadena;
	}

	public boolean insertar(Calificacion calif) {
		if (indice < calificaciones.length) {
			calificaciones[indice] = calif;
			indice++;
			return true;
		} else {
			return false;
		}
	}
	

	public Calificacion consultarMejor() {
		if (indice == 0) {
			return null;
		} else {
			Calificacion mejorCalif = calificaciones[0];
			for (int pos = 1; pos < indice; pos++) {
				Calificacion calif = calificaciones[pos];
				if (mejorCalif.getNota() < calif.getNota()) {
					mejorCalif = calif;
				}
			}
			return mejorCalif;
		}
	}

	public Calificacion consultarModulo(String modulo) {
		Calificacion calif = null;
		boolean encontrada = false;
		for (int pos = 1; pos < indice && !encontrada; pos++) {
			Calificacion calificacion = calificaciones[pos];
			if (calificacion.getModulo().equals(modulo)) {
				calif = calificacion;
				encontrada = true;
			}
		}
		return calif;
	}

	public boolean actualizar(String modulo, double nuevaNota) {
		Calificacion calif = consultarModulo(modulo);
		if (calif != null) {
			calif.setNota(nuevaNota);
			return true;
		} else {
			return false;
		}
	}
	

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	

	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	// TODO
	public static void main(String[] args) {
		Alumno alumno = new Alumno("Juan", "001");
		alumno.insertar(new Calificacion("P", 7));
		alumno.insertar(new Calificacion("BD", 7));
		alumno.insertar(new Calificacion("SI", 5));
		alumno.insertar(new Calificacion("ED", 6));
		alumno.insertar(new Calificacion("LM", 6));
		alumno.insertar(new Calificacion("FOL", 8));
		alumno.insertar(new Calificacion("I", 9));

		Calificacion mejorCalif = alumno.consultarMejor();
		if (mejorCalif != null) {
			System.out.println(mejorCalif.toString());
		} else {
			System.out.println("No hay mejor calificación");
		}
		Calificacion calif = alumno.consultarModulo("7");
		if (calif != null) {
			System.out.println(mejorCalif.toString());
		} else {
			System.out.println("No hay calificación");
		}
		if (alumno.actualizar("P", 8.5)) {
			System.out.println("Actualizada");
			calif = alumno.consultarModulo("P");
		} else {
			System.out.println("No actualizado");
		}
	}
}
