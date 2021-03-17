package calentamientoNavideno;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int num1 = sc.nextInt(), num2 = sc.nextInt();
			int peso = num2 - num1;
			System.out.println(peso);
		}
		sc.close();
	}
}
