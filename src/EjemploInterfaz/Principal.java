package EjemploInterfaz;

public class Principal {
	
	public static void main(String[] args) {
		
		Circulo cir1 = new Circulo(7.2);
		Circulo cir2 = new Circulo(14.5);
		
		Cuadrado cua1 = new Cuadrado(3.7);
		Cuadrado cua2 = new Cuadrado(11.3);
		
//		Figura figura = new Cuadrado(7);
		Figura[] figuras = new Figura[4];
		figuras[0] = cir1;
		figuras[1] = cir2;
		figuras[2] = cua1;
		figuras[3] = cua2;
		
		for(int pos  = 0 ; pos < figuras.length ; pos++) {
			Figura figura = figuras[pos];
			System.out.println(figura.toString());
		}
	}
}
