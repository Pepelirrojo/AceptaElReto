package ejercicio337;

import java.util.Scanner;

public class Ejercicio337 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			boolean rspta = true;
			int dient1[] = new int[6];
			int dient2[] = new int[6];
			for (int j = 0; j < 6; j++) {
				dient1[j] = sc.nextInt();
			}
			for (int j = 0; j < 6; j++) {
				dient2[j] = sc.nextInt();
			}

			for (int j = 0; j < 6; j++) {
				if ((dient1[0] + dient2[0]) != (dient1[j] + dient2[j])) {
					rspta = false;
					break;
				}
			}
			System.out.println(rspta ? "SI" : "NO");

		}
	}
}
