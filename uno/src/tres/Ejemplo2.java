package tres;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el numero de mes (1-12): ");
            int mes = sc.nextInt();

            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31 dias");
                    break;
                case 4,6,9,11:
                    System.out.println("30 dias");
                    break;
                case 2:
                    System.out.println("28 dias");
                    break;
                default:
                    System.out.println("Mes incorrecto");
                    break;
            }
            sc.close(); 
    }
}
