package tres;

import java.util.Scanner;

public class Propuesto11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("primer termino");
        int primer = Integer.parseInt(sc.nextLine());
        System.out.println("diferencia a sumar: ");
        int diferencia = Integer.parseInt(sc.nextLine());

        System.out.println("termino a buscar");
        int ene = Integer.parseInt(sc.nextLine());

        int acumula = primer;
        int termino = primer;

        for (int i = 1; i < ene; i++) {
            System.out.println(termino + " ");
            termino += diferencia;
            acumula += termino;
        }

        System.out.println("el termino " + ene + " es " + termino);

        System.out.println("la suma de los " + ene + " primeros terminos de la sucesion es " + acumula);

        int SUMA = (ene / 2) * (primer + termino);
        System.out.println("la suma por formula da: "+SUMA);

        sc.close();
    }
}
