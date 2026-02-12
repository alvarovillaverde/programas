package cuatro;

import java.util.Scanner;

public class NumerosAmigos {

    public static boolean sonAmigos(int entero1, int entero2) {

        if (entero1 == sumaDivisoresP(entero2) && entero2 == sumaDivisoresP(entero1)) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumaDivisoresP(int n) {

        int suma = 0;

        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                suma += j;
            }
        }
        return suma;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("comprobacion de numeros amigos.........");

        System.out.println("introduce un numero entero positivo");
        int entero1 = Integer.parseInt(sc.nextLine());

        System.out.println("el numero " + entero1 + " tiene los suma de divisores: " + sumaDivisoresP(entero1));

        for (int j = 1; j <= entero1; j++) {
            if (entero1%j == 0) {
                System.out.print(j + ", ");
            }
        }

        System.out.println("introduce otro numero entero positivo");
        int entero2 = Integer.parseInt(sc.nextLine());

        System.out.println("el numero " + entero2 + " tiene los suma divisores: " + sumaDivisoresP(entero2));

        for (int j = 1; j <= entero2; j++) {
            if (entero2%j == 0) {
                System.out.print(j + ", ");
            }
        }

        System.out.println("Son los numeros " + entero1 + " y " + entero2 + " amigos " + sonAmigos(entero1, entero2));

        sc.close();

    }

}
