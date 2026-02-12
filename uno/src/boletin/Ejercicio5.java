package boletin;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = (int) (Math.random() * 1000 + 1);
    int intento;

    do {
        System.out.println("Introduce un numero para acertar entre 1 y 1000");
        intento = Integer.parseInt(sc.nextLine());
        if (intento < n) {
            System.out.println("El numero a acertar es mayor que el introducido");
        } else if (intento > n){
            System.out.println("El numero a acertar es menor que el introducido");
        }
    } while (n != intento);

    System.out.println("Has acertado el numero :) " + n);

    sc.close();
}
}
