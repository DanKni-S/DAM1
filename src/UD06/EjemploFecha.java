package UD06;

public class EjemploFecha {
	
	private int dia;
	private int mes;
	private int year;
	
	public EjemploFecha(int dia, int mes, int year) {
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Fecha [día = " + dia + ", mes = " + mes + ", año = " + year + "]";
	}
}
