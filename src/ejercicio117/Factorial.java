package ejercicio117;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVeces = sc.nextInt();
		for (int i = 0; i < numVeces; i++) {
			int factorial = sc.nextInt();
			int resultado = 1; 
			for (int j = 1; j < factorial + 1; j++) {
				resultado = j * resultado;
			}
			String aux2[] = (resultado + "").split("");
			System.out.println(aux2[aux2.length - 1]);
		}
	}
}
