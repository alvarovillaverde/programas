package tres;

import java.util.Scanner;

public class AmstrongGeneral {

    public static int cuentaDigitos(int n) {
        int digitos = 0;
        do {
            n = n / 10;
            digitos++;
        } while (n != 0);
        return digitos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0; 
        System.out.println("Introduzca un numero entero de 3 o 4 digitos: ");
        numero = sc.nextInt();
        System.out.println("El numero tiene: " + cuentaDigitos(numero) + " digitos");       

        if (cuentaDigitos(numero) == 3) {
            int centena = numero / 100;
            int decena = (numero % 100) / 10;
            int unidad = numero % 10;
            double suma1 = Math.pow(centena, 3) + Math.pow(decena, 3) + Math.pow(unidad, 3);
            if (numero == suma1) {
                System.out.println("Es numero Amstrong");
            } else {
                System.out.println("No es numero Amstrong");
            }
        }

        if (cuentaDigitos(numero) == 4) {
            int milena = numero / 1000;
            int centena = (numero / 100) % 10;
            int decena = (numero / 10) % 10;
            int unidad = numero % 10;
            double suma1 = Math.pow(milena, 4) + Math.pow(centena, 4) + Math.pow(decena, 4) + Math.pow(unidad, 4);
            if (numero == suma1) {
                System.out.println("Es numero Amstrong");
            } else {
                System.out.println("No es numero Amstrong");
            }
        }

        sc.close();
    }
}
