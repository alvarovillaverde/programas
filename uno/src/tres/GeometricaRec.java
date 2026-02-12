package tres;

import java.util.Scanner;

public class GeometricaRec {

    public static int primer;
    public static int razon;

    //metodo para sacar el termino ene gracias a conocer el termino anterior a el
    public static int terminoEne(int n) {

        if (n==1) {
            return primer;
        } else {
            return terminoEne(n-1) + razon;
        }

    }

    //metodo recursivo para la suma todos los terminos
    public static int sumaTodosHastaEne(int n) {
        if (n==1) {
            return primer;
        } else {
            return terminoEne(n) + sumaTodosHastaEne(n -1);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
        System.out.println("primer termino: ");
        primer = Integer.parseInt(sc.nextLine());
        System.out.println("razon multi");
        razon = Integer.parseInt(sc.nextLine());

        System.out.println("dime el termino");
        int ene = Integer.parseInt(sc.nextLine());

        System.out.println("el termino " + ene + " es " + terminoEne(ene));

        System.out.println("la suma de los " + ene + "primeros terminos de la sucesion son " + sumaTodosHastaEne(ene));

        sc.close();
    }
}
