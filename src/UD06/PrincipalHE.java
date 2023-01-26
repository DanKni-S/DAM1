package UD06;

public class PrincipalHE {

	public static void main(String[] args) {
		Persona p1 = new Persona("12345678X", "Oliver");
		
		Estudiante e1 = new Estudiante("22334455F", "Sebastian", 1, "Programación");
		Estudiante e2 = new Estudiante("99887766T", "Chester", 2, "Música");
		// System.out.println(p1.toString());
		// System.out.println(e1.toString());
		// System.out.println(e2.toString());
		
		Empleado emp1 = new Empleado("55577798Y", "Vic", "cantante", true, 2650.20);
		Empleado emp2 = new Empleado("55577798Y", "Darel", "Programador", true, 1825.10);
		// System.out.println(emp1.toString());
		// System.out.println(emp2.toString());
		
		Delegado d1 = new Delegado("22266784R", "Alissa", 3,"Informatica", "DAW1");
		// System.out.println(d1.toString());
		
		jefeDepartamento jd1 = new jefeDepartamento("11155667O", "Andy", "Administrador BD", true, 2400.30, "Sistemas" );
		// System.out.println(jd1.toString());
		
		
		// vector de personas
		Persona[] personas = new Persona[7];
		personas[0] = p1;
		personas[1] = e1;
		personas[2] = e2;
		personas[3] = emp1;
		personas[4] = emp2;
		personas[5] = d1;
		personas[6] = jd1;
		
		for(int pos = 0 ; pos < personas.length ; pos++) {
			if(personas[pos] instanceof Delegado) {
				System.out.println("Es un delegado. ");
			}
			else if(personas[pos] instanceof jefeDepartamento) {
				System.out.println("Es un jefe de departamento. ");
			}
			else if(personas[pos] instanceof Estudiante) {
				System.out.println("Es un estudiante. ");
			}
			else if(personas[pos] instanceof Empleado) {
				System.out.println("Es un empleado. ");
			}
			else {
				System.out.println("Es una persona. ");
			}
			System.out.println(personas[pos].toString());
		}
	}

}
