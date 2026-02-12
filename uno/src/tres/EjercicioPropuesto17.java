package tres;

import java.util.Scanner;

public class EjercicioPropuesto17 {

 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("primer termino");
        double primer = Integer.parseInt(sc.nextLine());
        //System.out.println("diferencia a sumar: ");
        //int diferencia = Integer.parseInt(sc.nextLine());

        System.out.println("termino a buscar");
        int ene = Integer.parseInt(sc.nextLine());

         
        double aux = primer;
        double termino = primer;

        //metodo iterativo
        for (int i = 1; i < ene; i++) {
            System.out.println(termino + ", ");
            aux += i;
            termino += 1 / aux;
            //acumula += termino;
        }

        System.out.println("el termino " + ene + " es " + termino);

        //System.out.println("la suma de los " + ene + " primeros terminos de la sucesion es " + acumula);

        //int SUMA = (ene / 2) * (primer + termino);
        //System.out.println("la suma por formula da: "+SUMA);

        sc.close();
    }

}