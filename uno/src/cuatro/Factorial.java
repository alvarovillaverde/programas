package cuatro;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        int numero = 0;

        System.out.println("calculo de factorial...");
        Scanner sc = new Scanner(System.in);

        do {
        System.out.println("introduce el numero entero entre 0 y 1000: ");
        numero = Integer.parseInt(sc.nextLine());
        } while(numero < 0 || numero > 10);

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("factorial de " + numero + " es: " + factorial);

        sc.close();

    }

}
