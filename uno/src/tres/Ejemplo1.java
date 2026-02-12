package tres;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matematicas, lengua;
        System.out.println("Nota mates:");
        matematicas = Integer.parseInt(sc.nextLine());
        System.out.println("Nota lengua:");
        lengua = Integer.parseInt(sc.nextLine());

      /*   if (matematicas >= 5) {
            if (lengua >= 5) {
                System.out.println("Enhorabuena has aprobado ambas");
            }
            
         else {
            System.out.println("Has aprobado mates y lengua no");
        } } else {
            System.out.println("No has aprobado mates, lengua no se");
        } */

        if (matematicas >= 5 && lengua >= 5) {
            System.out.println("Has aprobado ambas");
        } else if (matematicas >= 5 && lengua < 5) {
            System.out.println("Apruebas mates y suspendes lengua");
        } else if (lengua >= 5 && matematicas < 5) {
            System.out.println("Suspendes mates y apruebas lengua");
        } else {
            System.out.println("Suspendes ambas");
        }
        sc.close(); 
    }
}
