package tres;

import java.util.Scanner;

public class Propuesto8 {

    public static void main(String[] args) {

        //atributos
        int n = 0;
        String res = "";

        //entrada numero
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero entre 1 y 3999: ");
        n = Integer.parseInt(sc.nextLine());

        
        // miles
        while (n >= 1000) {
            res += "M";
            n -= 1000;
        }

        // 900
        if (n >= 900) {
            res += "CM";
            n -= 900;
        }

        // 500
        if (n >= 500) {
            res += "D";
            n -= 500;
        }

        // 400
        if (n >= 400) {
            res += "CD";
            n -= 400;
        }

        // cientos
        while (n >= 100) {
            res += "C";
            n -= 100;
        }

        // 90
        if (n >= 90) {
            res += "XC";
            n -= 90;
        }

        // 50
        if (n >= 50) {
            res += "L";
            n -= 50;
        }

        // 40
        if (n >= 40) {
            res += "XL";
            n -= 40;
        }

        // decenas
        while (n >= 10) {
            res += "X";
            n -= 10;
        }

        // 9
        if (n >= 9) {
            res += "IX";
            n -= 9;
        }

        // 5
        if (n >= 5) {
            res += "V";
            n -= 5;
        }

        // 4
        if (n >= 4) {
            res += "IV";
            n -= 4;
        }

        // unidades
        while (n >= 1) {
            res += "I";
            n -= 1;
        }

        //salida del numero romano
        System.out.println("convertido a romano es: "+res);

        sc.close();
    }
}
