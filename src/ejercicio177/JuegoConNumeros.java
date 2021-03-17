package ejercicio177;

import java.util.Scanner;

public class JuegoConNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int zipi[] = new int[8];
		while (num != 0) {
			for (int i = 0; i < zipi.length; i++) {
				zipi[i] = num;
				if (i != 7) {
					num = sc.nextInt();
				}
			}
			System.out.println("hola");
		}
	}
}
