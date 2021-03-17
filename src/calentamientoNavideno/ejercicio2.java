package calentamientoNavideno;

import java.util.Scanner;

public class ejercicio2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numCasos = sc.nextInt();
		double gramosBotella = 0.125;
		for (int i = 0; i < numCasos; i++) {
			int kilos = sc.nextInt();
			int gramosAhorrados = 0;
			int count = 0;
			sc.nextLine();
			String[] botellas = sc.nextLine().split("\\s");
			for (int j = 0; j < botellas.length && ( gramosAhorrados < kilos); j++) {
				count++;
				int aux = Integer.parseInt(botellas[j]);
				gramosAhorrados += aux * gramosBotella;
			}

			System.out.println(count <= botellas.length - 1 ? count : "SIGAMOS RECICLANDO");
		}

	}

}
