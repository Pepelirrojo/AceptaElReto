package ejercicio100;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ic = 0; 
		int c = sc.nextInt(); 
		for (int i = 0; i < c; i++) {
			String num1 = sc.next();
			while (!num1.equals("6174")) {
				if (num1.length()<4) {
					while (num1.length()<4) {
						StringBuilder aux = new StringBuilder(num1);
						aux.insert(num1.length()-1, "0");
						num1=aux.toString();
					}
				}
				char[] numX = num1.toCharArray();
				Arrays.sort(numX);
				String num2 = String.valueOf(numX);
				StringBuilder num3 = new StringBuilder(num2);
				num3.reverse();
				String num4 = num3.toString();
				int numZ = Integer.parseInt(num4);
				int numY = Integer.parseInt(num2);
				int result = numZ - numY;
				ic++;
				num1 = String.valueOf(result);
				if (ic == 8) {
					break;
				}
			}
			System.out.println(ic);
			ic = 0;
		}
	}
}
