package ejercicio2;
import java.util.Scanner;

public class Principal1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[10];
		int i;
		for (i=0;i<palabras.length;i++) {
			System.out.println("Ingresar la "+(i+1)+"º palabra");
			palabras[i] = teclado.nextLine();
		}
		System.out.println("");
		System.out.println("Las palabras ingresadas son:");
// Usando bucle FOR NORMAL
		for (i=0;i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}
		System.out.println();
		System.out.println("Las palabras ingresadas en orden inverso:");
		for (i=palabras.length-1;i>=0;i--) {
			System.out.println(palabras[i]);
		}
		teclado.close();
	}
}
