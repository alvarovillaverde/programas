package tres;

import java.util.Scanner;

public class SolucionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Atributos
        System.out.println("Dame el valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Dame el valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Dame el valor de c: ");
        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            double ecuacion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double ecuacion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Primer valor: " + ecuacion1);
            System.out.println("Segundo valor: " + ecuacion2);
        } else if (discriminante == 0) {
            double ecuacion1 = -b / (2 * a);
            System.out.println("Valor único: " + ecuacion1);
        } else {
            System.out.println("Solución no real.");
        }

        sc.close();
    }
}