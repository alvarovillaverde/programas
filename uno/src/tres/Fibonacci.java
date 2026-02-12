package tres;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("termino a buscar");
        int ene = Integer.parseInt(sc.nextLine());

        if (ene == 0) 
            System.out.println("el termino es " + 0);
        if (ene == 1)
            System.out.println("el termino es " + 1);
        
        int a = 0; //termino uno
        int b = 1; //termino dos

        for (int i = 2; i <= ene; i++) {
            int siguiente = a + b; //el tres es uno + dos
            a = b; //en el uno pongo el dos
            b = siguiente; //en el dos pongo el nuevo
        }

        System.out.println("el termino es " +b);

        sc.close();

    }
}
