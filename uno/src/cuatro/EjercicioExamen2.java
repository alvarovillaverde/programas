package cuatro;

import java.util.Scanner;

public class EjercicioExamen2 {

    public static void main(String[] args) {
        
        double nota = 0d;

        System.out.println("comprobacion de nota a partir de nota numerica...");
        Scanner sc = new Scanner(System.in);

        do {
        System.out.println("introduce la nota entre 0.0 y 10.0: ");
        nota = Integer.parseInt(sc.nextLine());
        } while(nota < 0 || nota > 10);

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        sc.close();
        
    }

}
