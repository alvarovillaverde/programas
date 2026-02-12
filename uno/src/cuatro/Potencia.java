package cuatro;

import java.util.Scanner;

public class Potencia {
    public static int potenciaRecursiva(int base, int expo) {
        
        if (expo == 0) {
            return 1;
        } else {
            return base*potenciaRecursiva(base, expo - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio de calculo de potencia \n metodo repetitivo y metodo recursivo");

        System.out.println("Introduce un numero entero positivo base");
        int base = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce un entero positivo exponente");
        int expo = Integer.parseInt(sc.nextLine());

        System.out.println("metodo repetitivo");
        int resRep = 1;

        for (int i = 0; i < expo; i++) {
            resRep *= base;
        }

        System.out.println("la potencia de " + base + " elevado a " + expo + " da " + resRep);

        System.out.println("------------------");
        System.out.println("metodo recursivo");
        System.out.println("la potencia de " + base + " elevado a " + expo + " da " +potenciaRecursiva(base, expo));

        sc.close();
    }
}
