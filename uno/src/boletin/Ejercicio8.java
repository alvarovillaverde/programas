package boletin;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero");
        num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
