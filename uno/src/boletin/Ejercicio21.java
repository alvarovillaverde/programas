package boletin;

import java.util.Scanner;

public class Ejercicio21 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean atopado = false;

    for (int i = 1; i <= 10; i++) {
        System.out.println("Introduce el numero " + i + " de 10:");
        int n = Integer.parseInt(sc.nextLine());
        if (n < 0) {
            atopado = true;
        }
    }

    if (atopado) {
        System.out.println("Ha habido al menos uno negativo");
    } else {
        System.out.println("no hay numeros negativos");
    }

    sc.close();
}
}
