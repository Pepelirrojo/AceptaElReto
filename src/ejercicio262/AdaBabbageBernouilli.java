package ejercicio262;

import java.util.Scanner;

public class AdaBabbageBernouilli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int exp = sc.nextInt();
		int result = 0;
		while (num != 0 && exp != 0) {
			for (int i = 1; i <= num; i++) {
				result += (double) Math.pow(i, exp);
			}
			System.out.println(result);
			num = sc.nextInt();
			exp = sc.nextInt();
			result = 0;
		}
	}
}
