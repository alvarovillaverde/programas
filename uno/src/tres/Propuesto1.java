package tres;

import java.util.Scanner;

public class Propuesto1 {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("dime un numero entero a:");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("dime un numero entero b:");
        b = Integer.parseInt(sc.nextLine());

        System.out.println("dime un numero entero c:");
        c = Integer.parseInt(sc.nextLine());

        int mayor;
        int menor;

        //kung fu
        if (a > b && b > c) {
            mayor = a;
            menor = c;
        } else if (a > c && c > b) {
            mayor = a;
            menor = b;
        } else if (b > a && a > c) {
            mayor = b;
            menor = c;
        } else if (b > c && c > a) {
            mayor = b;
            menor = a;
        } else if (c > a && a > b) {
            mayor = c;
            menor = b;
        } else {
            mayor = c;
            menor = a;
        }

        if (a > b || a > c && b > c) {
            mayor = a;
            menor = c;
        } else {
            mayor = a;
            menor = b;
        } 

        //salidas
        System.out.println("el numero mayor es: "+mayor);
        
        System.out.println("el numero menor es: "+menor);

        sc.close();
    }
}
