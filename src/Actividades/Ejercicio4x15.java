package Actividades;
import java.util.Scanner;
public class Ejercicio4x15 {

	public static void main(String[] args) {
		//
		final int TOTALALUMNOS = 10;
		int contadorAlumnos = 0;
		int contadorNotaFinal = 0;
		double notaTeoria, notaProblemas, notaPracticas;
		double sumaNotaFinal = 0, notaFinal = 0;
		boolean notasValidas;
		Scanner teclado = new Scanner(System.in);
		while (contadorAlumnos < TOTALALUMNOS) {
			System.out.println("Alumno " + (contadorAlumnos++));
			System.out.println("¿Nota de Teoría ");
			notaTeoria = teclado.nextDouble();
			System.out.println("¿Nota de Problemas? ");
			notaProblemas = teclado.nextDouble();
			System.out.println("¿Nota de Prácticas? ");
			notaPracticas = teclado.nextDouble();
			
			notasValidas = true;
			if (notaTeoria < 0 || notaTeoria > 10) {
				System.out.println("La nota de Teoría debe estar comprendida " + " entre 0 y 10.");
				notasValidas = false;
			}
			if (notaProblemas < 0 || notaProblemas > 10) {
				System.out.println("La nota de Problemas debe estar comprendida " + " entre 0 y 10.");
				notasValidas = false;
			}
			if (notaPracticas < 0 || notaPracticas > 10) {
				System.out.println("La nota de Prácticas debe estar comprendida " + " entre 0 y 10.");
				notasValidas = false;
			}
			if (notasValidas) {
				System.out.printf("Nota de Teoría.   %5.2f\n", notaTeoria);
				System.out.printf("Nota de Problemas:    %5.2f\n", notaProblemas);
				System.out.printf("Nota de Prácticas:   %5.2f\n", notaPracticas);
				notaFinal = notaTeoria + 0.3 + notaProblemas + 0.2 + notaPracticas + 0.5;
				System.out.printf("Nota Final:    %5.2f\n", notaFinal);
			}
			System.out.println();
			contadorAlumnos++;
		}
		System.out.println("Resumen");
		if (contadorNotaFinal == 0) {
			System.out.println("No hay ningún alumno con nota final " + " calculada correctamente. ");
		}
		else {
			System.out.printf("Alumnos con Nota final:    %d\n", contadorNotaFinal);
			System.out.printf("Suma de nota final:  %.2f\n", sumaNotaFinal);
			System.out.printf("Media Aritmética de notas finales:  %.2f\n", (sumaNotaFinal / contadorNotaFinal));
		}
	}

}
