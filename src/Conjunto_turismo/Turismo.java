package Conjunto_turismo;

import java.util.Objects;

public class Turismo {

	private String matricula;
	private String marca;
	private String modelo;
	private int agno;
	private double precio;
	
	public Turismo(String matricula, String marca, String modelo, int agno, double precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.agno = agno;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Turismo [Matricula = " + matricula + ", Marca = " + marca + 
				", Modelo = " + modelo + ", Año = " + agno + ", Precio = " + String.format("2.f\n", precio) + "]";
	}
	
	public String getMatricula() {
		return matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Turismo)) {
			return false;
		}
		Turismo other = (Turismo) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
}
