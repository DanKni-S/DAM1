package Ejercicio_UsuariosWeb;

public class Administrador extends Usuarios {
	private String categoria;
	private boolean revisaComentarios;
	
	public Administrador(String nombre, String correo, String passw, 
			String categoria, boolean revisaComentarios) {
		super(nombre, correo, passw);
		this.categoria = categoria;
		this.revisaComentarios = revisaComentarios;
	}

	@Override
	public String toString() {
		return "Administrador [Nombre = " + nombre + ", Correo=" + correo + ", Password = " + passw + ", Categoria = "
				+ categoria + ", Revisar Comentarios = " + revisaComentarios + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	public boolean isRevisaComentarios() {
		return revisaComentarios;
	}
	
}
