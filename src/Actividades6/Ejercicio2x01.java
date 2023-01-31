package Actividades6;

public class Ejercicio2x01 {
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) Salir del programa ");
		System.out.println("(1) Insertar un alumno en el grupo ");
		System.out.println("(2) Consultar un alumno del grupo ");
		System.out.println("(3) Insertar una calificación en un alumno del grupo ");
		System.out.println("(4) Consultar la calificación de un alumno del grupo ");
		System.out.println("(5) Actualizar una calificación de un alumno del grupo ");
		System.out.println("(6) Consultar la mejor calificación de un alumno del grupo ");
		System.out.println("(7) Consultar todos los alumnos del grupo ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Empleado empl1 = new Empleado("00000000A", "Juan", "12/12/1950", "C/. Naranja", "777888999", "juan@gmail.com");
		Empleado empl2 = new Empleado("11111111B", "Ana", "06/02/1985", "C/. Violeta", "777666555", "ana@gmail.com");
		
		Oficinista ofc1 = new Oficinista("22222222C", "Jorge", "30/07/1988", "C/. Azul", "777000444", "jorge@gmail.com");
		Oficinista ofc2 = new Oficinista("33333333D", "Isabel", "12/11/1999", "C/. Amarillo", "777222333", "isabel@gmail.com");
		Oficinista ofc3 = new Oficinista("44444444E", "Elena", "15/06/1998", "C/. Verde", "777111666", "elena@gmail.com");
		
		Conductor cond1 = new Conductor("55555555F", "Mateo", "25/09/1978", "C/. Rojo", "666111444", "mateo@gmail.com");
		Conductor cond2 = new Conductor("66666666G", "Teresa", "18/03/1959", "C/. Blanco", "666222333", "teresa@gmail.com");
		
		Empleado[] empleados = new Empleado[10];
		
	}
}
