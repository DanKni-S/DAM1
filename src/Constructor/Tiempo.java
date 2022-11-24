package Constructor;

public class Tiempo {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
//	public Tiempo() {
//		random aleatorio = new Random();
//	}
	public String obtenerEstado() {
		return String.format("%02d : %02d : %02d", this.horas, this.minutos, this.segundos);
	}
	public boolean sumar(Tiempo otro) {
		
	}
	public static boolean esValido(int horas, int minutos, int segundos) {
		if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 59 && segundos >= 0 && segundos < 59) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
