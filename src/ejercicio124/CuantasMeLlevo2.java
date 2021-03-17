package ejercicio124;

import java.util.Scanner;

public class CuantasMeLlevo2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (casoDePrueba())
			;
	}

	public static boolean casoDePrueba() {
		String linea = sc.nextLine();
		if (linea.equals("0 0")) {
			return false;
		}
		String[] num = linea.split(" ");
		int cont = 0;
		boolean masUno = false;
		int contVez;
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[1]);
		if (num[0].length() > num[1].length()) {
			contVez = num[0].length();
		} else {
			contVez = num[1].length();
		}
		while (contVez != 0) {
			int rest1 = num1 % 10;
			if (masUno) {
				rest1++;
				masUno = false;
			}
			int rest2 = num2 % 10;
			if (rest1 + rest2 > 9) {
				cont++;
				masUno = true;
			}
			num1 = num1 / 10;
			num2 = num2 / 10;
			contVez--;
		}
		System.out.println(cont);
		return true;
	}
}
