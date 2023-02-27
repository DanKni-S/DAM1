package GestionarCatalogo;

public class Peliculas extends Video {
	protected int anyoEstren;
	protected String director;
	
	public Peliculas(String titulo, int anyoEstreno, String director) {
		super(titulo);
		this.anyoEstren = anyoEstreno;
		this.director = director;
	}

	@Override
	public String toString() {
		return "Peliculas [Codigo = " + codigo + ", Título = " + titulo + ", Año de estreno = " + anyoEstren + ", Director = " + director + "]";
	}
	public String getDirector() {
		return director;
	}
}
