package ui;

import entidades.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empleado[] empleados = new Empleado[2];
		for (int i=0;i<empleados.length;i++) {
			System.out.println("Selecciona una opcion");
			System.out.println("1- El empleado es Administrativo\n2- El empleado es Vendedor");
			int opcion= teclado.nextInt();
			System.out.println();
			teclado.nextLine(); // Limpia el buffer de entrada cuando se pasa de un int a un string
			System.out.println("Ingresar DNI del empleado");
			String dni = teclado.nextLine();
			System.out.println("Ingresar nombre del empleado");
			String nombre = teclado.nextLine();
			System.out.println("Ingresar apellido del empleado");
			String apellido = teclado.nextLine();
			System.out.println("Ingresar email del empleado");
			String email = teclado.nextLine();
			System.out.println("Ingresar sueldo base del empleado");
			BigDecimal sueldoBase = teclado.nextBigDecimal();
			if (opcion == 1) {
				System.out.println("Ingresar cantidad de horas extras");
				BigDecimal hsExtras = teclado.nextBigDecimal();
				System.out.println("Ingresar cantidad de horas al mes");
				BigDecimal hsMes = teclado.nextBigDecimal();
				empleados[i] = new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtras, hsMes);
			}
			else if(opcion == 2) {
				System.out.println("Ingresar porcentaje de comisión");
				BigDecimal porcComision = teclado.nextBigDecimal();
				System.out.println("Ingresar cantidad total de ventas");
				BigDecimal ventas = teclado.nextBigDecimal();
				empleados[i] = new Vendedor(dni, nombre, apellido, email, sueldoBase, porcComision, ventas);
			}
			System.out.println();
		}
		for(int i=0;i<empleados.length;i++) {
			System.out.println(empleados[i].getDetalle());
		}
		teclado.close();
	}
}
