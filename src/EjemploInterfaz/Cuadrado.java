package EjemploInterfaz;

public class Cuadrado implements Figura {
	
	private double lado;
	
	public Cuadrado(double lado) {
		
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [Lado = " + lado + ", Perimetro = " + calcularPerimetro() + ", Área = " + calcularArea() +  "]";
	}
	
}
