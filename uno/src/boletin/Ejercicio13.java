package boletin;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
    int suma_pos = 0;
    int cta_pos = 0;
    int suma_neg = 0;
    int cta_neg = 0;
    int cta_ceros = 0;

    Scanner sc = new Scanner(System.in);

    int num = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("Introduce un numero entero (pos/neg/0): ");
        num = Integer.parseInt(sc.nextLine());

        if (num > 0) {
            cta_pos++;
            suma_pos += num;
        } else if (num == 0) {
            cta_ceros++;
        } else {
            cta_neg++;
            suma_neg += num;
        }
    }
    if (cta_pos > 0)
    System.out.println("media positivos: " + (double) suma_pos/cta_pos);

    if (cta_neg > 0)
    System.out.println("media de negativos: " + (double) suma_neg/cta_neg);

    if (cta_ceros > 0)
    System.out.println("numero de ceros: " + cta_ceros);

    sc.close();
}
}
