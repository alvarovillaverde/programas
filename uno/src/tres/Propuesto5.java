package tres;

import java.util.Scanner;

public class Propuesto5 {

    public static int sumaDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
       
        int dia;
        int mes;
        int ano;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia: DD");
        dia = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el mes: MM");
        mes = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el año: YYYY");
        ano = Integer.parseInt(sc.nextLine());

        int numero = 0;
        int lucky = 0;

        //karate kid
        numero = dia + mes + ano;
        System.out.println("proto lucky es -----> "+numero);

        do {
            lucky = sumaDigitos(numero);
            numero = lucky;
        } while (lucky >= 10);

        //salida
        System.out.println("tu numero es "+lucky);

        sc.close();
    }
}
