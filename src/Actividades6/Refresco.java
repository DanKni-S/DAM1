package Actividades6;

import java.util.Random;

public class Refresco extends Bebidas{
	
	protected boolean tieneGas;
	protected double cantidadAzucar;
	
	protected static final String[] NOMBRES = {"limonada", "cola", "gaseoasa", "te helado", "granizado", "ponche"};
	
	public Refresco(String nombre, boolean tieneGas, double cantidadAzucar) {
		super(nombre);
			
		this.tieneGas = tieneGas;
		this.cantidadAzucar = cantidadAzucar;
	}
	
	public Refresco() {
		super(generarNombre());
		Random aleatorio = new Random();
		// Entre 4 y 35
		this.cantidadAzucar = aleatorio.nextDouble() * (35 - 4) + 4;
		this.tieneGas = aleatorio.nextBoolean();
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES [aleatorio.nextInt(NOMBRES.length)];
	}

	@Override
	public String toString() {
		return "Refresco [codigo = " + codigo + ", nombre = " + nombre +  ", tieneGas = " + tieneGas + ", cantidadAzucar = " + String.format("%f.1", cantidadAzucar) + "]";
	}
	
	@Override
	public double Precio() {
		return 1+ (cantidadAzucar / 10);
	}
	public boolean esGaseosos() {
		return tieneGas;
	}
}
