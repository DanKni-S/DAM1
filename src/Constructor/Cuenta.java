package Constructor;

public class Cuenta {
	
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public String obtenerEstado() {
		return "Cuenta [Número = " + numero + ", saldo " + String.format("%.2f", saldo);
	}
}
