package ui;

import entidades.*;

public class Principal {

	public static void main(String[] args) {
//Si no se utiliza constructor con parámetros
		Persona p= new Persona();
		p.setDni("12121212");
		p.setNombre("Juan");
		p.setApellido("Perez");
		
		Persona p1= new Persona();
		
		System.out.println(p.getDetalle());
		System.out.println(p1.getDetalle());
		System.out.println(p1.getDetalle(false));
		
		Alumno a= new Alumno();
		
//		Alumno a1= new Alumno("13131313","John","Doe",666);
		System.out.println(a.getDetalle());
//		System.out.println(a1.getDetalle());
		
		Persona p2= new Alumno();
		
		System.out.println(p2.getDetalle());
		
//		System.out.println(a1.getDetalleAlumno());
		System.out.println(((Alumno)p2).getDetalleAlumno());
	}
}
