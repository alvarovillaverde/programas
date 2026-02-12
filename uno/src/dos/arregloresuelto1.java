package dos;

import java.util.Scanner;

public class arregloresuelto1 {

	// Fahrenheit a Celsius C = (F - 32)/l,8
	// Celsius a Fahrenheit F = (1,8)C + 32

	public static double centigradosToFahrenheit(double temp) {

		return (9D * temp / 5) + 32;

	}

	public static double fahrenheitToCentigrados(double temp) {

		return (temp - 32) * 5D / 9;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String seleccion = null;

		do {

			System.out.println("convertir c a f (1) / convertir f a c (2) / finalizar (3)");
			seleccion = sc.nextLine();

			switch (seleccion) {
			case "1":
				System.out.println("Introduce una temperatura en C: ");
				double c = sc.nextDouble();
				System.out.println("transformada a F es: " + centigradosToFahrenheit(c));
				sc.nextLine();// limpia
				break;
			case "2":
				System.out.println("Introduce una temperatura en F: ");
				double f = sc.nextDouble();
				System.out.println("transformada a C es: " + fahrenheitToCentigrados(f));
				sc.nextLine();// limpia
				break;
			}
		} while (!seleccion.equals("3"));

		System.out.println("chao...");

		sc.close();
	}
}