package cuatro;

import java.util.Scanner;

public class Divisores {

    public static boolean esPerfecto(int n) {

        int suma = 0;

        for (int j = 1; j <= n; j++) {
            if (n%j == 0) {
                suma += j;
            }
            }
            if (suma == n) {
                return true;
            } else {
                return false;
            }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("obtencion de todos los divisores de un entero.........");

        System.out.println("introduce un numero entero");
        int entero = Integer.parseInt(sc.nextLine());

        System.out.println("el numero " + entero + " tiene los siguientes divisores: ");

        for (int j = 1; j <= entero; j++) {
            if (entero%j == 0) {
                System.out.print(j + ", ");
            }
        }

        System.out.println("el numero " + entero + " es perfecto? " + esPerfecto(entero));

        sc.close();
    }
}