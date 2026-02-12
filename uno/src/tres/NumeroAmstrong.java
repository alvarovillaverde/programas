package tres;

import java.util.Scanner;

public class NumeroAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduzca un numero de 3 cifras entero: ");
            numero = sc.nextInt();
        } while (numero <= 100 || numero >= 999);

        int centena = numero / 100;
        int decena = (numero%100)/10;
        int unidad = (numero%100)%10;
        double suma1 = Math.pow(centena, 3) + Math.pow(decena, 3) + Math.pow(unidad, 3) ;
        if (numero == suma1) {
            System.out.println("Es numero Amstrong");
        } else {
            System.out.println("No es numero Amstrong");
        }
        sc.close();
    }
}
