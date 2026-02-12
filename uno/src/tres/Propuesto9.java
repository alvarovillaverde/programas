package tres;

import java.util.Scanner;

public class Propuesto9 {

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

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int cociente = 2;

        while (cociente < n) {
            if (n%cociente==0) {
            primo = false;
            return primo;
        }
        cociente++;
        }

        return primo;
    }

    public static boolean esOmirp(int n) {
        if (esPrimo(n) && esPrimo(invierteOrdenNumero(n))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        n = Integer.parseInt(sc.nextLine());

        System.out.println("dicho numero escrito al reves es: "+invierteOrdenNumero(n));

        System.out.println("Lista de los numeros primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i+ " es numero primo");
            }
        }

        System.out.println("el y su reverso son primos ambos: "+esOmirp(n));

        int limite = 1000;
        for (int num = 2; num < limite; num++) {
            if (esPrimo(num)) {
                int revertido = invierteOrdenNumero(num);
                if (num != revertido && revertido < limite && esPrimo(revertido)) {
                    System.out.println(num + " y ");
                }
            }
        }

        sc.close();
    }
}
