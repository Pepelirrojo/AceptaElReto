package ejercicio124;

import java.util.Scanner;

public class CuantasMeLlevo3 {
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
		String num1 = num[0];
		String num2 = num[1];
		if (num[0].length() > num[1].length()) {
			contVez = num[1].length()-1;
		} else {
			contVez = num[0].length()-1;
		}
		for (int j = contVez; j != -1; j--) {
			int rest1 = Character.getNumericValue(num1.charAt(j));
			if (masUno) {
				rest1++;
				masUno = false;
			}
			int rest2 = Character.getNumericValue(num2.charAt(j));
			if (rest1 + rest2 > 9 || rest1 > 9) {
				cont++;
				masUno = true;
			}
		}
		System.out.println(cont);
		return true;
	}
}
