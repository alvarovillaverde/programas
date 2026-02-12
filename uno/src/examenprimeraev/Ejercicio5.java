package examenprimeraev;

import java.util.Scanner;

public class Ejercicio5 {

    public static int sumaDigitos(int n) {
        // CASO BASE: Si el número es 0, ya no hay más dígitos que sumar
        if (n == 0) {
            return 0;
        } 
        // CASO RECURSIVO
        else {
            int ultimoDigito = n % 10; // Sacamos el dígito de la derecha (el 3 de 123)
            int restoDelNumero = n / 10; // Quitamos ese dígito del número (el 12 de 123)
            
            // Sumamos el dígito actual + la suma de los que quedan
            return ultimoDigito + sumaDigitos(restoDelNumero);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero:");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("La suma de los dígitos es: " + sumaDigitos(n));

        sc.close();
    }
}