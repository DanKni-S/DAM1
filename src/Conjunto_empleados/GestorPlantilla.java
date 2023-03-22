package Conjunto_empleados;

import java.util.Set;
import entrada.Teclado;

public class GestorPlantilla {

	public static void escribirMenuOpciones() {
		System.out.println(" ");
		System.out.println("(0) Salir del programa.");
		System.out.println("(1) Insertar un empleado en la plantilla. ");
		System.out.println("(2) Consultar todos los empleados de la plantilla, por DNI ascendente. ");
		System.out.println("(3) Consultar todos los empleados, ordenados por salario descendente, de la plantilla. ");
		System.out.println("(4) Eliminar un empleado, por DNI, de la plantilla. ");
		System.out.println("(5) Consultar los empleados de un departamento de la plantilla. ");
		System.out.println("(6) Consultar los empleados, por nombre y/o apellido, de la plantilla. ");
		System.out.println("(7) Consultar el número de empleados de cada departamento de la plantilla. ");
		System.out.println("(8) Consultar el/los empleado/s que más cobra/n de cada departamento de la plantilla. ");
		System.out.println("(9) Consultar todos los empleados, ordenados por departamento ascendente y nombre ascendente, de la plantilla. ");
		System.out.println("(10) Insertar una cantidad de empleados con datos aleatorios en la plantilla. ");
		System.out.println("(11) Incrementar un 5% el salario a los empleados de un departamento de la plantilla. ");
		System.out.println("(12) Mover los empleados con el DNI finalizado con una terminación de 3 dígitos a un departamento de la plantilla. ");
		System.out.println("(13) Eliminar los empleados de un departamento de la plantilla. ");
		System.out.println("(14) Eliminar los empleados con un salario inferior a un cantidad de la plantilla. ");
		System.out.println("(15) Eliminar los empleados con un salario inferior a la media de los salarios de la plantilla. ");
		System.out.println(" ");
	}
	
	public static void escribirConjuntoEmpleados
							(Set<Empleado> conjuntoEmpleados) {
		for (Empleado emp : conjuntoEmpleados) {
			System.out.println(emp.toString());
		}
		System.out.println(conjuntoEmpleados.size() + 
							" empleados consultados");
	}
	
	public static void main(String[] args) {
		Plantilla plantilla = new Plantilla();
		Empleado empleado;
		int opcion;
		String dni, nombre, departamento;
		double salario;
		do {
			escribirMenuOpciones();
			opcion = Teclado.leerEntero("�Opci�n? ");
			switch (opcion) {
			// Salir del programa.
			case 0:
				break;
				
			case 1:
				// Insertar un empleado en la plantilla.
				dni = Teclado.leerCadena("�DNI? ");
				if (plantilla.buscarPorDni(dni)) {
					System.out.println("Se ha encontrado otro empleado con ese DNI.");
				}
				else {
					nombre = Teclado.leerCadena("�Nombre? ");
					salario = Teclado.leerReal("�Salario? ");
					departamento = Teclado.leerCadena("�Departamento? ");
					empleado = new Empleado(dni, nombre, departamento, salario);
					if (plantilla.insertar(empleado)) {
						System.out.println("Se ha insertado un empleado");
					}
				}
				break;
				
			case 2:
				// Consultar todos los empleados de la plantilla, por DNI ascendente.
				if (plantilla.estaVacia()) {
					System.out.println("plantilla vac�a");
				}
				else {
					escribirConjuntoEmpleados(plantilla.obtenerEmpleados());
				}
				break;
			case 3:
				// Consultar todos los empleados, ordenados por salario descendente, de la plantilla.
				break;
			case 4:
				// Eliminar un empleado, por DNI, de la plantilla.
				
				break;
			case 5:
				// Consultar los empleados de un departamento de la plantilla.
				break;
			case 6:
				// Consultar los empleados, por nombre y/o apellido, de la plantilla.
				break;
			case 7:
				// Consultar el número de empleados de cada departamento de la plantilla.
				break;
			case 8:
				// Consultar el/los empleado/s que más cobra/n de cada departamento de la plantilla.
				break;
			case 9:
				// Consultar todos los empleados, ordenados por departamento ascendente y nombre ascendente, de la plantilla.
				break;
			case 10:
				// Insertar una cantidad de empleados con datos aleatorios en la plantilla.
				break;
			case 11:
				// Incrementar un 5% el salario a los empleados de un departamento de la plantilla.
				break;
			case 12:
				// Mover los empleados con el DNI finalizado con una terminación de 3 dígitos a un departamento de la plantilla.
				break;
			case 13:
				// Eliminar los empleados de un departamento de la plantilla.
				break;
			case 14:
				// Eliminar los empleados con un salario inferior a un cantidad de la plantilla.
				break;
			case 15:
				// Eliminar los empleados con un salario inferior a la media de los salarios de la plantilla.
				break;
			default:
				System.out.println("La opción no es válida. ");
				break;
			}
		}
		while (opcion != 0);
		System.out.println("Programa finalizado.");
	}

}
