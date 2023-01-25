package UD06;

public class PrincipalHE {

	public static void main(String[] args) {
		Persona p1 = new Persona("12345678X", "Oliver");
		
		Estudiante e1 = new Estudiante("22334455F", "Sebastian", 1, "Programación");
		Estudiante e2 = new Estudiante("99887766T", "Chester", 2, "Música");
		
		System.out.println(p1.toString());
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Empleado emp1 = new Empleado("55577798Y", "Vic", "cantante", true, 2650.20);
		Empleado emp2 = new Empleado("55577798Y", "Darel", "Programador", true, 1825.10);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());

	}

}
