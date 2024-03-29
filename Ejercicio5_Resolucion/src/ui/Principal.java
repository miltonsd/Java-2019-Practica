package ui;

import java.util.Scanner;

import entities.Administrativo;
import entities.Empleado;
import entities.Vendedor;

public class Principal {
	static Scanner s;
	
	public static void main(String[] args) {
		s= new Scanner(System.in);
		Empleado [] emps = new Empleado[3];
		
		boolean continua= true;
		int cargados= 0;
		for(int i=0; continua && i<emps.length;i++) {
			System.out.println("�Carga (A)dministrativo o (V)endedor?");
			String tipo= s.nextLine();
			if(tipo.equalsIgnoreCase("A")) {
				Administrativo adm= new Administrativo();
				cargaDatos(adm);
				emps[cargados]= adm;
			}else {
				Vendedor vend= new Vendedor();
				cargaDatos(vend);
				emps[cargados]= vend;
			}
			cargados++;
			if(cargados<3) {
				System.out.println("Desea continuar? (S/N)");
				continua=(s.nextLine().equalsIgnoreCase("S"));
			}
		}
		
		for(int i=0; i<cargados; i++) {
			System.out.println(emps[i].getDni()+": "+emps[i].getApellido()+", "+emps[i].getNombre()+" - Sueldo: "+emps[i].getSueldo());
		}
		
		s.close();
	}
	
	public static void cargaDatos(Administrativo a) {
		cargaDatos((Empleado)a);
		System.out.println("Ingrese horas extra: ");
		a.setHsExtra(Double.parseDouble(s.nextLine()));
		System.out.println("Ingrese horas del mes: ");
		a.setHsMes(Double.parseDouble(s.nextLine()));
	}
	
	public static void cargaDatos(Vendedor v) {
		cargaDatos((Empleado)v);
		System.out.println("Ingrese porcentaje de comision: ");
		v.setPorcenComision(Double.parseDouble(s.nextLine()));
		System.out.println("Ingrese total de ventas: ");
		v.setTotalVtas(Double.parseDouble(s.nextLine()));
	}
	
	public static void cargaDatos(Empleado e) {
		System.out.println("Ingrese dni: ");
		e.setDni(s.nextLine());
		System.out.println("Ingrese nombre: ");
		e.setNombre(s.nextLine());
		System.out.println("Ingrese apellido: ");
		e.setApellido(s.nextLine());
		System.out.println("Ingrese email: ");
		e.setEmail(s.nextLine());
		System.out.println("Ingrese sueldo base: ");
		e.setSueldoBase(Double.parseDouble(s.nextLine()));
	}
}
