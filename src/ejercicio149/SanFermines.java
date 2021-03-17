package ejercicio149;

import java.util.Scanner;

public class SanFermines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int numToros = sc.nextInt();
			int toros [] = new int [numToros];
			int velocidad = 0;
			for (int i = 0; i < toros.length; i++) {
				toros[i]= sc.nextInt();
				if (toros[i]>velocidad) {
					velocidad = toros[i];
				}
			}
			System.out.println(velocidad);
		}
	}
}
