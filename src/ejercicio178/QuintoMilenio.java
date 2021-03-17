package ejercicio178;

import java.util.Scanner;

public class QuintoMilenio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numCasos; i++) {

			int c = 0;
			String frase = sc.nextLine().toLowerCase().replace(" ", "");
			String findFrase = sc.nextLine().toLowerCase().replace(" ", "");

			for (int j = 0; j < frase.length() && c < findFrase.length(); j++) {

				char letraX = findFrase.charAt(c);
				char letraY = frase.charAt(j);

				if (letraX == letraY) {
					c++;
				}
			}
			if (c == findFrase.length()) {

				System.out.println("SI");

			} else {

				System.out.println("NO");

			}
		}
	}
}
