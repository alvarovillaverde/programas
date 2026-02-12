package boletin;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;

    do {
        System.out.println("Introduce un numero entero o 0 para finalizar");
        n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            System.out.println("El numero es positivo");
        } else if (n < 0){
            System.out.println("El numero es negativo");
        }
    } while (n != 0);

    System.out.println("FINAL......");

    sc.close();
}
}
