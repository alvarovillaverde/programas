package boletin;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    int contador = 0;

    do {
        System.out.println("Introduce numeros y pon uno negativo para terminar");
        n = Integer.parseInt(sc.nextLine());
        contador++;
    } while (n > 0);

    System.out.println("Has introducido " + contador + " numeros ");

    sc.close();
}
}
