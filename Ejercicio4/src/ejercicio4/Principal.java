package ejercicio4;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nro;
		int[] lista = new int[20];
		int[] nrosMayores = new int[lista.length];
		System.out.println("Ingresar un numero");
		nro = teclado.nextInt();
		System.out.println();
		for (int i=0;i<lista.length;i++) {
			System.out.println("Ingresar el "+(i+1)+"º numero");
			lista[i] = teclado.nextInt();
		}
		System.out.println();
		int j=0;
		for (int i=0;i<lista.length;i++) {
			if (lista[i] > nro) {
				nrosMayores[j] = lista[i];
				j++;			
			}
		}
		System.out.println();
		System.out.println("Los números mayores a "+nro+" son:");
		for (int i=0;i<=j-1;i++) {
			System.out.println(nrosMayores[i]);
		}
		teclado.close();
	}
}
