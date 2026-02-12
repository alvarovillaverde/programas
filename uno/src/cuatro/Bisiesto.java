package cuatro;

import java.util.Scanner;

public class Bisiesto {

    public static boolean esBisiesto(int n) {

        if ( n%4 == 0 && (n%100 != 0 || n%400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el año");
        int ano = Integer.parseInt(sc.nextLine());

        System.out.println("El año " + ano + " es bisiesto?? " + esBisiesto(ano));

        sc.close();

    }    

}
