package ejercicio153;

import java.util.Scanner;

public class RelojATravesDelEspejo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			String horas = sc.next();
			String aux[] = horas.split(":");
			int horaF = Integer.parseInt(aux[0]);
			int minutosF = Integer.parseInt(aux[1]);
			int minutosR = 0;
			int horaR = 0;
			if (horaF == 12) {
				horaR = 12;
			} else {
				horaR = 12 - (horaF);
			}
			if (minutosF == 0) {
				minutosR = 0;
			} else {
				minutosR = 60 - minutosF;
				horaR -= 1;
			}
			if (horaR == 0) {
				horaR+=12;
			}
			String horaDef = horaR + "";
			String minutosDef = minutosR + "";
			if (horaR < 10) {
				horaDef = "0" + horaR;
			}
			if (minutosR < 10) {
				minutosDef = "0" + minutosDef;
			}
			System.out.println(horaDef + ":" + minutosDef);
		}
	}
}