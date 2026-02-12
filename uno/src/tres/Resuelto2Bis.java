package tres;

import java.util.Scanner;

public class Resuelto2Bis {
public static void main(String[] args) {

    //numero de filas
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce numero de lineas: ");
    int filas = sc.nextInt();
    
        for (int i = 0; i < filas; i++) {

            for (int k  = filas; k > i; k--) {
                System.out.print(" ");
            }//bucle interno de blanquitos

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }//bucle interno de estrellitas

            System.out.println();
        }//bucle externo
    sc.close();
    }
}
