package tres;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hasta que numero quieres contar");
        int numero = Integer.parseInt(sc.nextLine());
        int contador = 1;

        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
        sc.close(); 
    }
}