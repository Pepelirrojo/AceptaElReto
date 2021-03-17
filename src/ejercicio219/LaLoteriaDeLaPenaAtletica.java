package ejercicio219;

import java.util.Scanner;

public class LaLoteriaDeLaPenaAtletica {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int contador = 0;
			int numDecimos = sc.nextInt();
			int decimos [] = new int[numDecimos];
			for (int j = 0; j < numDecimos; j++) {
				decimos [j] = sc.nextInt();
			}
			for (int j = 0; j < decimos.length; j++) {
				if (decimos[j] % 2 == 0) {
					contador++;
				}
			}
			System.out.println(contador);
		}
	}
}