package boletin;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
    double suma = 0;
    int cta_mil = 0;

    Scanner sc = new Scanner(System.in);
    double num = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("Introduce un sueldo (con centimos)");
        num = Double.parseDouble(sc.nextLine());
        if (num > 1000) {
            cta_mil++;
        }
        suma += num;
    }

    System.out.println("la nomina total es: " + suma);
    System.out.println("sueldos mayores de 1000 hay" + cta_mil);

    sc.close();
}
}
