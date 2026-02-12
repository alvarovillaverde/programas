package tres;

import java.util.Scanner;

public class ProgresionGeometrica {

    public static void main(String[] args) {

        System.out.println("PROGRESION GEOMETRICA.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("primer termino");
        int primer = Integer.parseInt(sc.nextLine());
        System.out.println("razon a multiplicar: ");
        int razon = Integer.parseInt(sc.nextLine());

        System.out.println("termino a obtener");
        int ene = Integer.parseInt(sc.nextLine());

        //int acumula = primer;
        int termino = primer;

        for (int i = 1; i < ene; i++) {
            System.out.print(termino + " ");
            termino *= razon;
            //acumula += termino;
        }

        System.out.println("el termino " + ene + " es " + termino);

        //System.out.println("la suma de los " + ene + " primeros terminos de la sucesion es " + acumula);

        int SUMA = primer * ((int) Math.pow(razon, termino) / razon - 1) ;
        System.out.println("la suma por formula da: "+SUMA);

        sc.close();
    }
}