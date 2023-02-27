package EjemploInterfaz;

public class Circulo implements Figura {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2.0 * Math.PI * radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * radio;
	}

	@Override
	public String toString() {
		return "Circulo [Radio = " + radio + ", Perimetro = " + calcularPerimetro() + ", Área = " + calcularArea() + "]";
	}
	
}
