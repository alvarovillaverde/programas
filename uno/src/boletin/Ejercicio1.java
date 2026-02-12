package boletin;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un numero entero positivo o u numero negativo para terminar el bucle");
            num = Integer.parseInt(sc.nextLine());
            System.out.println("EL cuadrado de tu numero es: " + Math.pow(num, 2));
        } while (num > 0);

        System.out.println("final.............");

        sc.close();
    }
}
