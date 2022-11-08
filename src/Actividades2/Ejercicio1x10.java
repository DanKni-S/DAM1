package Actividades2;
import java.util.Scanner;
public class Ejercicio1x10 {
	
	public static double calcularCargoPorEstacionar(double horas) {
		double cargo = 2.0;
		if (horas == 24.0) {
			cargo = 10.0;
		}
		else if (horas > 3.0) {
			horas -= 3.0;
			while (horas >= 1.0) {
				cargo += 0.5;
				horas -= 1.0;
			}
			if (horas > 0.0) {
				cargo += 0.5;
			}
		}
		return cargo;
	}
	
//	public static double calcularCargoPorEstacionar(double horas) {
//		double cargo = 2.0;
//		int horasEnteras;
//		if (horas == 24.0) {
//			cargo = 10.0;
//		}
//		else if (horas > 3.0) {
//			horas -= 3.0;
//			horasEnteras = (int) horas;
//			if (horas - horasEnteras > 0.0) {
//				horasEnteras++;
//			}
//			cargo = cargo + horasEnteras + 0.5;
//		}
//		return cargo;
//	}

	public static void main(String[] args) {
		//
		int numeroConductores, contador;
		double tiempoHoras, cargoEstacionar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Número de Conductores? ");
		numeroConductores = teclado.nextInt();
		
		for (contador = 1 ; contador <= numeroConductores ; contador++) {
			System.out.println("Conductor " + contador + ": ");
			System.out.println("¿Tiempo en Horas? ");
			tiempoHoras = teclado.nextDouble();
			
			if (tiempoHoras >= 0.0 && tiempoHoras <= 24.0) {
				cargoEstacionar = calcularCargoPorEstacionar(tiempoHoras);
				System.out.printf("Cargo por Estacinar: %.2f euros\n", cargoEstacionar);
			}
			else {
				System.err.println("El tiempo tiene que estar comprendido entre 0 y 24");
			}
		}
	}

}
