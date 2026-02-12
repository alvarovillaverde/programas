package tres;

import java.util.Scanner;

public class Ejemplo6 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("empezamos en el uno...");
        System.out.println("Hasta que numero quieres contar?");
        int numero = Integer.parseInt(sc.nextLine());

    //ejemplo con dos contadores
    for(int i = 0, j = numero; i < numero; i++, j--) {
        System.out.println("i = "+i+", j = "+j);
    }

    //ejemplo con condicion de permanencia en bucle mas compleja que relaciona dos contadores 
    for(int i = 0, j = numero; i < j; i++, j--) {
        System.out.println("i = "+i+", j = "+j);
    }
    sc.close();
}
}
