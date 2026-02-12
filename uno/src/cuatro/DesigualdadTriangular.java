package cuatro;

import java.util.Scanner;

public class DesigualdadTriangular {

    public static boolean isTriangle(double a, double b, double c) {

        if ((a <= b +c) && (b <= a + c) && (c <= a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a;
        double b;
        double c;

        System.out.println("Introduce valor de a");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce valor de b");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce valor de c");
        c = Double.parseDouble(sc.nextLine());

        System.out.println(isTriangle(a, b, c));

        sc.close();
    }
}
