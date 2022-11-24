package Constructor;

public class Cuenta {
	
	// Atributos 
	private int numero;
	String cliente;
	private double saldo;
	
//	Codifica una clase Cuenta que incluya los datos y las operaciones siguientes:
//	Información de una cuenta: número, cliente y saldo.
//	Un constructor que reciba como parámetros un número y un cliente y que indique por defecto que el saldo es 0.
	
	public Cuenta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.0;
	}
//	Un método de objeto obtenerEstado que devuelva el estado de la cuenta como cadena de caracteres, indicando el saldo con 2 dígitos decimales.
	public String obtenerEstado() {
		return "CuentaBancaria [Número = " + numero + ", Cliente = " + cliente + ", saldo " + String.format("%.2f", saldo) + "]";
	}
//	Un método de objeto ingresar que tenga como parámetro un importe a ingresar en la cuenta, 
//	que realice la operación cuando este importe sea positivo, y que devuelva un booleano indicando si el
//	ingreso se ha realizado con éxito o no.
	
	public boolean ingresar(double importeIngresar) {
		boolean ingresar = false;
		if (importeIngresar > 0) {
			this.saldo += importeIngresar;
			return true;
		}
		else {
			return false;
		}
	}
//	Un método de objeto retirar que tenga como parámetro un importe a retirar de la cuenta, que realice la operación cuando este importe
//	sea positivo y sea menor o igual que el saldo, y que devuelva un booleano indicando si la retirada se ha realizado con éxito o no.
	
	public boolean retirar(double importeRetirar) {
		if(importeRetirar > 0 && importeRetirar <= saldo) {
			return true;
		}
		else {
			return false;
		}
	}
//	Un método de objeto transferir que tenga como parámetros un importe a transferir y una cuenta destino, 
//	que realice la operación cuando este importe sea positivo y sea menor o igual que el saldo de la cuenta origen,
//	y que devuelva un booleano indicando si la transferencia se ha realizado con éxito o no.
	
	public boolean tranferir(double importeTransferir, Cuenta cuentaDestino) {
		if (importeTransferir > 0 && importeTransferir <= saldo) {
			saldo -= importeTransferir;
			cuentaDestino.saldo += importeTransferir;
			return true;
		}
		else {
			return false;
		}
	}
}
