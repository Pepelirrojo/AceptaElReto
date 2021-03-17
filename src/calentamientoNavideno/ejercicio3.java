package calentamientoNavideño;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		while (c != 0) {
			int cubos[] = new int[c];
			for (int i = 0; i < c; i++) {
				cubos[i] = sc.nextInt();
			}
			Arrays.sort(cubos);
			System.out.println(cubos[(cubos.length) / 2] - cubos[((cubos.length) / 2) - 1]);
			c = sc.nextInt();
		}
	}
}
