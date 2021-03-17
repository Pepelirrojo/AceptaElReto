package ejercicio476;

import java.util.Scanner;

public class LuchaDeEgos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		while (s != 0) {
			int nvl[] = new int[s];
			for (int i = 0; i < s; i++) {
				nvl[i]=sc.nextInt();
				System.out.print(nvl[i] + " ");
			}
			String cont[] = new String[s];
			for (int i = 0; i < s; i++) {
				cont[i]=sc.next();
				System.out.print(cont[i] + " ");
			}
			for (int i = 0; i < s; i++) {
				char sign = cont[i].charAt(i);
			}
			s = sc.nextInt();
		}
	}
}
