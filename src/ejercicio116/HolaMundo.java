package ejercicio116;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println(comprobarDni("50334244D"));
	}

	public static boolean comprobarDni(String dni) {
		if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
			System.out.println("caracteres insuficientes" + dni);
			return false;
		}
		String letra = dni.substring(8).toUpperCase();
		String num = dni.substring(0, 8);
		if (soloNum(num) == true && letraDni(num).equals(letra)) {
			System.out.println(dni);
			return true;
		} else {
			System.out.println("error de comprobacion " + dni);
			return false;
		}
	}

	private static String letraDni(String num) {
		int numeros = Integer.parseInt(num);
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };
		int resto = numeros % 23;
		String miLetra = asignacionLetra[resto];
		return miLetra;
	}

	private static boolean soloNum(String numerosDni) {
		String num = "";
		String dni = "";
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < numerosDni.length() - 1; i++) {
			num = numerosDni.substring(i, i + 1);
			for (int j = 0; j < unoNueve.length; j++) {
				if (num.equals(unoNueve[j])) {
					dni += unoNueve[j];
				}
			}
		}
		if (dni.length() != 8) {
			return false;
		} else {
			return true;
		}
	}
}
