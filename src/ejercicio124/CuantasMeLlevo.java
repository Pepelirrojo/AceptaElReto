package ejercicio124;

import java.util.Scanner;

public class CuantasMeLlevo {
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
		if (num[0].length() >= num[1].length()) {
			for (int i = num[1].length()-1; i != -1; i--) {
				if (Character.getNumericValue(num[0].charAt(i)) + Character.getNumericValue(num[1].charAt(i)) > 9) {
					cont++;
				}
			}
		} else {
			for (int i = num[0].length(); i == 0; i--) {
				if (Character.getNumericValue(num[0].charAt(i)) + Character.getNumericValue(num[1].charAt(i)) > 9) {
					cont++;
				}
			}
		}
		System.out.println(cont);
		return true;
	}
}