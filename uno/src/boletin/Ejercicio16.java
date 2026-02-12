package boletin;

import java.util.Scanner;

public class Ejercicio16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;

    do {
        System.out.println("Dime un numero entero entre 1 y 10");
        n = Integer.parseInt(sc.nextLine());
    } while (n < 0 || n >= 10);

    System.out.println("tabla de multiplicar del " + n);

    for (int i = 1; i < 11; i++) {
        System.out.println(n + " por " + i + " es: " +n*i);
    }

    sc.close();
}
}
