package ejercicio136;

import java.util.Scanner;

public class Ejercicio136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int aux = 0, aux2 = 0, c1 = 0, c11 = 0, c111 = 0, c2 = 0, c22 = 0, c222 = 0;
			int[] tir1 = new int[n];
			for (int i = 0; i < tir1.length; i++) {
				tir1[i] = sc.nextInt();
				if (tir1[i] == aux) {
					c1++;
				} else if (tir1[i] > aux) {
					aux = tir1[i];
					c11 = c1;
					c1 = 0;
				}
			}
			if (c1 > c11) {
				c111 = c1;
			} else {
				c111 = c11;
			}
			int[] tir2 = new int[n];
			for (int i = 0; i < tir2.length; i++) {
				tir2[i] = sc.nextInt();
				if (tir2[i] == aux) {
					c2++;
				} else if (tir2[i] > aux) {
					aux = tir2[i];
					c22 = c2;
					c2 = 0;
				}
			}
			if (c2 > c22) {
				c222 = c2;
			} else {
				c222 = c22;
			}
			if (c111 > c222) {
				System.out.println("PRIMERO");
			} else if (c222 > c111) {
				System.out.println("SEGUNDO");
			} else {
				System.out.println("NO HAY DIFERENCIA");
			}
			n = sc.nextInt();
		}
	}
}
