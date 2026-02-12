package uno;

import java.util.Scanner;

public class propuesto12 {

	public static void main(String[] args) {

		// variables
		int dinero = 0;
		int b500 = 0;
		int b200 = 0;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;

		// scanner para la cantidad de dinero
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su cantidad de dinero: ");
		dinero = sc.nextInt();

		// recorrido
		/*
		 * if (dinero >= 500) { b500++; dinero-=500; } else if (dinero >= 200) { b200++;
		 * dinero-=200; } else if (dinero >= 100) { b100++; dinero-=100; } else if
		 * (dinero >= 50) { b50++; dinero-=50; } else if (dinero >= 20) { b20++;
		 * dinero-=20; } else if (dinero >= 10) { b10++; dinero-=10; } else if (dinero
		 * >= 5) { b5++; dinero-=5; }
		 */

		// algoritmo
		do {
			if (dinero >= 500) {
				b500++;
				dinero -= 500;
			} else if (dinero >= 200) {
				b200++;
				dinero -= 200;
			} else if (dinero >= 100) {
				b100++;
				dinero -= 100;
			} else if (dinero >= 50) {
				b50++;
				dinero -= 50;
			} else if (dinero >= 20) {
				b20++;
				dinero -= 20;
			} else if (dinero >= 10) {
				b10++;
				dinero -= 10;
			} else if (dinero >= 5) {
				b5++;
				dinero -= 5;
			}
		} while (dinero >= 5);

		// salidas
		System.out.println("Tienes " + b500 + " billetes de 500 euros," + b200 + " billetes de 200 euros," + b100
				+ " billetes de 100 euros," + b50 + " billetes de 50 euros," + b20 + " billetes de 20 euros," + b10
				+ " billetes de 10 euros," + b5 + " billetes de 5 euros y " + dinero + " en monedas.");

		sc.close();
	}

}