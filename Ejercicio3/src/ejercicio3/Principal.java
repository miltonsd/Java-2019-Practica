package ejercicio3;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String[] palabras = new String[10];
		String palabra;
		int i;
		for (i=0;i<palabras.length;i++) {
			System.out.println("Ingresa la "+(i+1)+"º palabra");
			palabras[i]=lector.nextLine();
		}
		System.out.println();
		System.out.println("Ingrese una palabra");
		palabra=lector.nextLine();
		for (i=0;i<palabras.length;i++) {
			if (palabras[i].equalsIgnoreCase(palabra)) {
				System.out.println();
				System.out.println("La palabra '"+palabra+"' ya fue ingresada anteriormente");
			}
		}
		lector.close();
	}
}