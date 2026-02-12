package boletin;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;

    do {
        System.out.println("Introduce un numero entero o 0 para finalizar");
        n = Integer.parseInt(sc.nextLine());

        if (n%2 == 0) {
            System.out.println("El numero es par");
        } else if (n%2 != 0){
            System.out.println("El numero es impar");
        }
    } while (n != 0);

    System.out.println("FINAL.....");

    sc.close();
}
}
