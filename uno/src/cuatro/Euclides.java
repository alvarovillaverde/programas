package cuatro;

import java.util.Scanner;

public class Euclides {

    public static int minimoComunMultiplo(int a, int b) {

        int temp = a * b;
        return temp / maximoComunDivisor(a, b);

    }

    public static int maximoComunDivisor(int a, int b) {
        
        int resto;

        //ponemos en la a el mayor
        if (b > a) {
            int menor = a;
            a = b;
            b = menor;
        }

        // creamos el bucle
        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);

        return a;
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //variables
        System.out.println("introduce el primer numero entero positivo: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("introduce el siguiente entero positivo: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("el mcd es " + maximoComunDivisor(a, b));
        System.out.println("el mcm es " +minimoComunMultiplo(a, b));

        sc.close();
    }

}
