package tres;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("empezamos en el uno...");
        System.out.println("Hasta que numero quieres contar?");
        int numero = Integer.parseInt(sc.nextLine());

        //bucle para repeticiones conocidas
        for(int i=1; i<=numero; i++) {
            System.out.println(i);
        }

        //vamos a contar pares
        for(int j=0; j<=numero; j=j+2) {
            System.out.println(j);
        }
        sc.close();
    }
}
