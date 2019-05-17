package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> nros= new ArrayList<Integer>();
		ArrayList<Integer> lista= new ArrayList<Integer>();
		
		System.out.println("Ingresar un numero");
		int nro = teclado.nextInt();
		System.out.println();
		for (int i=0;i<20;i++) {
			System.out.println("Ingresar el "+(i+1)+"º numero");
			nros.add(teclado.nextInt());
		}
		System.out.println();
		for (int i=0;i<nros.size();i++) {
			if (nros.get(i)>nro) {
				lista.add(nros.get(i));	
			}
		}
		System.out.println();
		System.out.println("Los números mayores a "+nro+" son:");
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		teclado.close();
	}
}