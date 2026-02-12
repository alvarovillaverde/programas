package boletin;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero no negativo: ");

        int num = Integer.parseInt(sc.nextLine());
  
            if (num < 0) {
                System.out.println("El factorial solo está definido para números enteros no negativos.");
            } else {
                System.out.println("El factorial de " + num + " es: " + factorial(num));
            }

        sc.close();
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
