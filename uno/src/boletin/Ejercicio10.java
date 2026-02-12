package boletin;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int suma = 0;

    for (int i = 1; i <= 15; i++) {
        System.out.println("Introduce un entero");
        int num = Integer.parseInt(sc.nextLine());
        suma += num;
    }

    System.out.println("la suma de los 15 numeros es " + suma);

    sc.close();
}
}
