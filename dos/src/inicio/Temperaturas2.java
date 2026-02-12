package inicio;
import java.util.Scanner;

public class Temperaturas2 {
    private static int[] temperaturas1;
    final static int POS = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        temperaturas1 = new int[POS];

        for (int i = 0; i < POS; i++) {
        System.out.println("Dame un entero para el indice: " +i);
        temperaturas1 [i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < POS; i++) {
            total += temperaturas1[i];
        }
        System.out.println("La media es: " + ((double)total / POS));

        sc.close();
    }
}
