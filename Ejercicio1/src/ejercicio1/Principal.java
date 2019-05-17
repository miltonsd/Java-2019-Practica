package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		int i;
		System.out.println("Los 10 primeros numeros enteros son");
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Ahora los 10 primeros numeros impares son");
		for(i=0;i<10;i++) {
			System.out.println(2*i+1);
		}
	}
}