package ejercicio413;

import java.util.Scanner;

public class Claras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int claras = 0;
			int oscuras = 0;
			int ancho = sc.nextInt();
			int alto = sc.nextInt();
			int total = ancho * alto;
			if (total % 2 != 0) {
				claras = (total/2)+1;
				oscuras = total/2;
			} else {
				claras = total/2;
				oscuras = total/2;
			}
			System.out.print(claras + " ");
			System.out.println(oscuras);
		}
	}
}
