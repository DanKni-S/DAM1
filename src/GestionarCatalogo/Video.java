package GestionarCatalogo;

public abstract class Video {
	private static int total = 0;
	protected int codigo;
	protected String titulo;
	
	
	public Video(String titulo) {
		total++;
		this.codigo = total;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Video [Codigo = " + codigo + ", Título = " + titulo + "]";
	}
	public int getCodigo() {
		return codigo;
	}
}
