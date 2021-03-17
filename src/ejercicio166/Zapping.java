package ejercicio166;

import java.util.ArrayList;
import java.util.Scanner;

public class Zapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cEstoy = sc.nextInt();
		int cQuiero = sc.nextInt();
		ArrayList<Integer> canales = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			canales.add(i+1);
		}
		while (cEstoy != 0 || cQuiero != 0) {
			int c1 = 0;
			int c2 = 0;
			while (cQuiero == canales.get(cEstoy)) {
				
			}
			for (int i = cEstoy; i < 99; i++) {
				int aux = canales.get(i);
				c1++;
				if (aux == cQuiero) {
					i = 99;
					System.out.println(c1);
				}
			}
			for (int i = cEstoy; i > 99; i--) {
				int aux = canales.get(i);
				c2++;
				if (aux == cQuiero) {
					i = 99;
					System.out.println(c2);
				}
			}
			cEstoy = sc.nextInt();
			cQuiero = sc.nextInt();
		}
	}
}
