package ejercicio467;

import java.util.Scanner;

public class PoliEsPoli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < c; i++) {
			boolean tau = false;
			String frase = sc.nextLine().toLowerCase();
			String palabra[] = frase.split(" es ");
			if (palabra[0].equals(palabra[1])) {
				tau = true;
			}
			System.out.println(tau ? "TAUTOLOGIA" : "NO TAUTOLOGIA");
		}
	}
}