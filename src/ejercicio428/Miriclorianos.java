package ejercicio428;

import java.util.Scanner;

public class Miriclorianos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCaso = sc.nextInt();
		for (int i = 0; i < numCaso; i++) {
			int mili = sc.nextInt();
			int cont = 0;
			boolean isDark = false;
			do {
				if (mili % 5 == 4)
					cont++;
				mili /= 5;
				if (mili == 4)
					cont++;
				isDark = cont >= 2;
			} while (!isDark && (mili >= 4));
			System.out.println(isDark ? "SI" : "NO");
		}

	}

}
