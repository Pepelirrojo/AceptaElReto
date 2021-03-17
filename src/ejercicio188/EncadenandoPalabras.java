package ejercicio188;

import java.util.Scanner;

public class EncadenandoPalabras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] juego = sc.nextLine().split("\\s");
			boolean result = true;
			for (int i = 0; i < juego.length - 1 && result; i++) {
				if (!juego[i].substring(juego[i].length() - 2).equals(juego[i + 1].substring(0, 2))) {
					result = false;
				}
			}
			System.out.println(result ? "SI" : "NO");
		}
	}
}
