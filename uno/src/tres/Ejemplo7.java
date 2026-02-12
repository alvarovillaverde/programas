package tres;

import java.util.Scanner;

public class Ejemplo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hasta que numero quieres contar?");
        int numero = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < 10; i++) {
            if (i == numero) {
                break; // salir del bucle cuando i sea 5
            }
            System.out.println("i = "+i);
        }

        System.out.println("ejemplo de continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //saltar numeros pares
            }
            System.out.println("i impar = "+i);
        }

        sc.close();
    }
}
