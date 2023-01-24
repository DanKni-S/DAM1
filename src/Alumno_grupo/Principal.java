package Alumno_grupo;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa ");
		System.out.println("(1) Insertar un alumno en el grupo ");
		System.out.println("(2) Consultar un alumno del grupo ");
		System.out.println("(3) Insertar una calificación en un alumno del grupo ");
		System.out.println("(4) Consultar la calificación de un alumno del grupo ");
		System.out.println("(5) Actualizar una calificación de un alumno del grupo ");
		System.out.println("(6) Consultar la mejor calificación de un alumno del grupo ");
		System.out.println("(7) Consultar todos los alumnos del grupo ");
		System.out.println();
	}

	public static void main(String[] args) {
		Grupo grupo = new Grupo("DAM1B");
		Alumno alumno;
		Calificacion calificacion;
		int opcion;
		String nombre, numeroExpediente, modulo;
		double nota;
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("¿Opción? ");
			switch (opcion) {
			case 0:
				break;
			case 1:
				// Insertar un alumno en el grupo
				nombre = Teclado.leerCadena("¿Nombre? ");
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = new Alumno(nombre, numeroExpediente);
				if(grupo.insertar(alumno)) {
					System.out.println("Alumno insertado. ");
				}
				else {
					System.err.println("Error al insertar alumno. ");
				}
				break;
			case 2:
				// Consultar un alumno del grupo
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = grupo.consultarAlumno(numeroExpediente);
				if(alumno == null) {
					System.out.println("Alumno no encontrado");
				}
				else {
					System.out.println(alumno.toString());
				}
				break;
			case 3:
				// Insertar una calificación en un alumno del grupo
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = grupo.consultarAlumno(numeroExpediente);
				if(alumno == null) {
					System.out.println("Alumno no encontrado");
				}
				else {
					modulo = Teclado.leerCadena("¿Modulo? ");
					nota = Teclado.leerReal("¿Nota? ");
					calificacion = new Calificacion(modulo, nota);
					if(alumno.insertar(calificacion)){
						System.out.println("Calificacón insertada en el alumno ");
					}
					else {
						System.err.println("Error al insertar calificación en el alumno. ");
					}
				}
				break;
			case 4:
				// Consultar la calificación de un alumno del grupo
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = grupo.consultarAlumno(numeroExpediente);
				if(alumno == null) {
					System.out.println("Alumno no encontrado");
				}
				else {
					modulo = Teclado.leerCadena("¿Modulo? ");
					calificacion = alumno.consultarModulo(modulo);
					if(calificacion == null) {
						System.err.println("Calificación no encontrada ");
					}
					else {
						System.out.println(calificacion.toString());
					}
				}
				break;
			case 5:
				// Actualizar una calificación de un alumno del grupo
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = grupo.consultarAlumno(numeroExpediente);
				if(alumno == null) {
					System.out.println("Alumno no encontrado");
				}
				else {
					modulo = Teclado.leerCadena("¿Modulo? ");
					calificacion = alumno.consultarModulo(modulo);
					if(calificacion == null) {
						System.err.println("Calificación no encontrada ");
					}
					else {
						nota = Teclado.leerReal("¿Nota nueva? ");
						calificacion.setNota(nota);
						System.out.println("Calificación actualizada de un alumno ");
					}
				}
				break;
			case 6:
				// Consultar la mejor calificación de un alumno del grupo
				numeroExpediente = Teclado.leerCadena("¿Numero Expediente? ");
				alumno = grupo.consultarAlumno(numeroExpediente);
				if(alumno == null) {
					System.out.println("Alumno no encontrado");
				}
				else {
					calificacion = alumno.consultarMejor();
					if(calificacion == null) {
						System.err.println("El alumno no tiene calificaciones ");
					}
					else {
						System.out.println(calificacion.toString());
					}
				}
				break;
			case 7:
				// Consultar todos los alumnos del grupo
				System.out.println(grupo.toString());
				break;
			default:
				System.err.println("La opción de menú debe estar comprendida entre 0 y 6");
			}
		}while(opcion != 0);
		System.out.println("Programa Finalizado");
	}

}
