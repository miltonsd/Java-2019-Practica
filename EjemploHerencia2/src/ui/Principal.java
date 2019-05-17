package ui;

import entidades.Alumno;
import entidades.Persona;

public class Principal {

	public static void main(String[] args) {
//Si no se utiliza constructor con parámetros
		Persona p= new Persona("12121212","Juan","Perez");
		System.out.println(p.getDetalle());
		System.out.println("---------");
		
		Alumno a= new Alumno("13131313","Doe","John",666);
		System.out.println(a.getDetalle());
		System.out.println("---------");
		
		Persona p1= new Alumno("15151515","Lobo","vestido de oveja",1234567890); // SE PUEDE
//		p2.getLegajo(); // No se puede invocar el método
		System.out.println(p1.getDetalle()); // Imprime el del alumno, JAVA HACE CASO AL OBJETO, NO A LA VARIABLE (Binding dinámico)
		System.out.println(((Alumno)p1).getDetalleAlumno());
//                         ((Alumno)p1).getDetalleAlumno() ; // CASTING -> Se puede invocar el método
//		Alumno a1= new Persona(); // NO SE PUEDE
	}
}
