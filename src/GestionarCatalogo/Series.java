package GestionarCatalogo;

public class Series extends Video {
	
	protected int anyoInicio;
	protected int anyoFin;
	protected int numTemporadas;
	protected int numCapitulos;
	
	public Series(String titulo, int anyoInicio, int anyoFin, int numTemporadas, int numCapitulos) {
		super(titulo);
		this.anyoInicio = anyoInicio;
		this.anyoFin = anyoFin;
		this.numTemporadas = numTemporadas;
		this.numCapitulos = numCapitulos;
	}

	@Override
	public String toString() {
		return "Series [Codigo = " + codigo + ", Título = " + titulo + ", Año de inicio = " + anyoInicio + ", Año de Fin  = " + anyoFin + ", Número de temporadas = " + numTemporadas
				+ ", Número de capítulos = " + numCapitulos + "]";
	}
	public int getAnyoInicio() {
		return anyoInicio;
	}
	public int getAnyoFin() {
		return anyoFin;
	}
}
