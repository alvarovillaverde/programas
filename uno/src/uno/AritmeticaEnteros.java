package uno;

import java.util.Scanner;

public class AritmeticaEnteros {

	// Variables //

	public static int suma(int s1, int s2) {
		
		// Suma //
		int s = s1 + s2;

		// Devuelve variable //
		return s;
	}

	public static int resta(int r1, int r2) {

		// Resta //
		int r = r1 - r2;

		// Devuelve variable //
		return r;
	}

	public static int producto(int p1, int p2) {

		// Producto //
		int p = p1 * p2;

		// Devuelve variable //
		return p;
	}

	public static int cociente(int c1, int c2) {

		if (c1 == 0) {

			return 0;
		} else if (c2 == 0) {

			return 0;
		}

		// division //
		int c = c1 / c2;

		// Devuelve variable //
		return c;

	}

	public static int modulo(int m1, int m2) {

		if (m1 == 0) {

			return 0;
		} else if (m2 == 0) {

			return 0;
		}

		// Resta //
		int m = m1 % m2;

		// Devuelve variable //
		return m;
	}
	
	public static int pedirNumero() {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		lector.close();
		return lector.nextInt();
	 
	}

	public static void main(String[] args) throws Exception {

		int num1, num2;

		// First enter //
		num1 = pedirNumero();

		// Segundo entero //
		num2 = pedirNumero();

		// Suma //
		int suma = suma(num1, num2);
		System.out.println("La suma de ambos numeros es: " + suma);

		// Resta //
		int resta = resta(num1, num2);
		System.out.println("\nLa resta de ambos numeros es: " + resta);

		// Producto //
		int prod = producto(num1, num2);
		System.out.println("\nEl producto de ambos numeros es: " + prod);

		// Modulo //
		int cociente = cociente(num1, num2);
		System.out.println("\nEl cociente de ambos numeros es: " + cociente);

		// Resta //
		int modulo = modulo(num1, num2);
		System.out.println("\nEl resto de ambos numeros es: " + modulo);

		// Fin programa//
		System.out.println("\n\nFIN OPERATIVAS ARITMETICAS ENTERAS");


	}

}
