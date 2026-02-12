package inicio;
import java.util.Scanner;
import java.util.Arrays;

public class Temperaturas {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] temperaturas1;

    temperaturas1 = new int[10];

    System.out.println(Arrays.toString(temperaturas1));

    for (int i = 0; i < temperaturas1.length; i++) {
        System.out.println("Dame un entero para el indice: " +i);
        temperaturas1 [i] = Integer.parseInt(sc.nextLine());
    }

    System.out.println(Arrays.toString(temperaturas1));

    // clonación nuevo objeto en lugar de memoria distinta
    int[] temperaturas2 = (int[]) temperaturas1.clone();

    // referencia ambas variables en el mismo objeto en memoria
    int[] temperaturas3 = temperaturas1;

    System.out.println(temperaturas2);
    System.out.println(temperaturas3);

    sc.close();
}
}
