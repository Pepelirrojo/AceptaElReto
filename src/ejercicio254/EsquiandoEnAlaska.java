package ejercicio254;

import java.util.Scanner;

public class EsquiandoEnAlaska {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c = sc.nextInt();
		while (c!=0) {
			int alt [] = new int [c];
			for (int j = 0; j < alt.length-1; j++) {
				alt[c]=sc.nextInt();
				c++;
			}
			int longEsq [] = new int [c];
			for (int j = 0; j < longEsq.length-1; j++) {
				longEsq[c] = sc.nextInt();
				
			}
		}
	}
}
