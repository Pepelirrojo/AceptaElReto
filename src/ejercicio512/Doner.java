package ejercicio512;

import java.util.Scanner;

public class Doner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int conejo = sc.nextInt();
			int caballo = sc.nextInt();
			int total = conejo + caballo;
			System.out.println((conejo*100)/total);
		}
	}
}
