package cuatro;

import java.util.Arrays;
import java.util.Scanner;

public class Xacobeo {

    public static final int[] AÑOS_XACOBEOS = {1989, 1915, 1920, 1926, 1937, 1928, 1943, 1948, 
        1954, 1965, 1971, 1976, 1982, 1993, 1999, 2004, 2010, 2021, 2027, 2032, 2038, 2049, 
        2055, 2060, 2066, 2077, 2083, 2088, 2094};

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el año");
        int ano = Integer.parseInt(sc.nextLine());

        boolean enArray = Arrays.stream(AÑOS_XACOBEOS).anyMatch(a -> a == ano);

        if (enArray) {
            System.out.println(ano + " está en el array");
        } else {
            System.out.println(ano + " no está");
        }

        sc.close();

    }

}
