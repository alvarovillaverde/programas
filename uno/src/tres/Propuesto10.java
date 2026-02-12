package tres;

import java.util.Scanner;

public class Propuesto10 {

    /* Realiza una clase minumero con un método esVampiro que diga si un número es vampiro o no. Un número es
    vampiro si es obtenido a partir del producto de dos números que se obtienen a partir de los dígitos del mismo (los
    dos colmillos). Por ejemplo: 2187=27x81 ó 1260=21x60. 

    16
    10
    20
    61
    62
    26
    */

    public static int cuentaDigitos(int n) {
        int digito = 0;
        while (n > 0) {
            n = n / 10;
            digito++;
        }
        return digito;
    }

    public static int invierteOrdenNumero(int n) {
        int pot = cuentaDigitos(n)-1;
        int reverso = 0;

        while (n > 0) {
            int cifra = n%10; //quita el ultimo digito al original
            n/=10; //divide entre 10 el original
            reverso += cifra*Math.pow(10, pot); //usa dicho numero multiplicado por 10 elevado a la potencia -1
            pot--;
        }
        return reverso;
    }


    //metodo para saber si es vampiro
    public static boolean esVampiro(int n) {

        boolean vampiro = false; // por defecto suponemos que no va a ser vampiro

        //separamos los digitos del numero en 2 y 2
        int num1 = n / 100; //12
        int num2 = n % 100; //60

        //hacemos todas las combinaciones posibles
        int num3 = invierteOrdenNumero(num1); //21
        int num4 = invierteOrdenNumero(num2); //06

        //comprobamos si se cumple la regla
        if (n == (num1 * num2) || n == (num1 * num3) || n == (num1 * num4) 
        || n == (num2 * num3) || n == (num2 * num4) || n == (num3 * num4)) {
            vampiro = true;
            return vampiro;
        }
        
        return vampiro;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        //metemos un filtro para que el numero sea de 4 cifras
        do {
            //pedimos el numero
            System.out.println("Introduce tu numero de 4 cifras para saber si es vampiro");
            numero = Integer.parseInt(sc.nextLine());
        } while (numero < 1000 || numero > 9999);

        System.out.println("El numero es vampiro ----> "+esVampiro(numero));

        sc.close();

    }
}
