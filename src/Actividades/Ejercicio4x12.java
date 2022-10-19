package Actividades;

public class Ejercicio4x12 {

	public static void main(String[] args) {
		//
		double gradosC, gradosF, gradosK;
		System.out.println("Celsius Fahrenheit Kelvin");
		for (gradosC = -20.0; gradosC <= 100.0; gradosC += 10) {
			gradosF = gradosC * (9.0 / 5.0) + 32.0;
			gradosK = gradosC + 273.15;
			System.out.printf(" %6.2f     %6.2f %6.2f\n", gradosC, gradosF, gradosK);
		}
	}

}
