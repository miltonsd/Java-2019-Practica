package ejercicio2;
import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[10];
		int i;
		for (i=0;i<palabras.length;i++) {
			System.out.println("Ingresar la "+(i+1)+"� palabra");
			palabras[i] = teclado.nextLine();
		}
		System.out.println("");
		System.out.println("Las palabras ingresadas son:");
// Usando FOR EACH
		for (String pal : palabras) {
			System.out.println(pal);
		}
		System.out.println();
		System.out.println("Las palabras ingresadas en orden inverso:");
		for (i=palabras.length-1;i>=0;i--) {
			System.out.println(palabras[i]);
		}
		teclado.close();
	}
}
