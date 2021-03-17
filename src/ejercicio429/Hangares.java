package ejercicio429;

import java.util.Arrays;
import java.util.Scanner;

public class Hangares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numHangares = sc.nextInt();
		while (numHangares != 0) {
			boolean func = true;
			int[] hang = new int[numHangares];
			for (int i = 0; i < hang.length; i++) {
				hang[i] = sc.nextInt();
			}
			int numNaves = sc.nextInt();
			int[] nav = new int[numNaves];
			for (int i = 0; i < nav.length; i++) {
				nav[i] = sc.nextInt();
			}
			int c = 0;
			while ( c < numNaves) {
				Arrays.sort(hang);
				hang[hang.length - 1] -= nav[c];
				if (hang[hang.length - 1] < 0) {
					func = false;
					break;
				}
				c++;
			}
			System.out.println(func ? "SI" : "NO");
			numHangares = sc.nextInt();
		}

	}
}
