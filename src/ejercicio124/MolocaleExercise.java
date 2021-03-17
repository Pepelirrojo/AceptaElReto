package ejercicio124;

import java.util.Scanner;

public class MolocaleExercise {
	static Scanner in = new Scanner(System.in);

	public static boolean casoDePrueba() {
		String x = in.nextLine();
		if (x.equals("0 0"))
			return false;
		String[] datos1 = x.split(" ");
		String primer = datos1[0];
		String segundo = datos1[1];
		String[] nuevo = primer.split("");
		String[] nuevo1 = segundo.split("");
		int number1 = 0;
		int number2 = 0;
		int contador = 0;
		if (nuevo.length <= nuevo1.length) {

			for (int i = 0; i < nuevo.length; i++) {
				number1 = Integer.parseInt(nuevo[(nuevo.length - 1) - i]);
				number2 = Integer.parseInt(nuevo1[(nuevo1.length - 1) - i]);
				if (number1 + number2 > 9) {
					contador++;
				}
			}
		} else {
			for (int i = 0; i < nuevo1.length; i++) {
				number1 = Integer.parseInt(nuevo[(nuevo.length - 1) - i]);
				number2 = Integer.parseInt(nuevo1[(nuevo1.length - 1) - i]);

				if (number1 + number2 > 9) {
					contador++;
				}
			}
		}

		System.out.println(contador);

		return true;

	}

	public static void main(String args[]) {
		while (casoDePrueba())
			;

	}
}