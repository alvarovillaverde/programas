package repaso;

import java.util.Scanner;

public class repaso1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String cadena1;
    String cadena2;
    String salida = "";

    System.out.println("dame la primera cadena: ");
    cadena1 = sc.nextLine();
    System.out.println("dame la segunda cadena: ");
    cadena2 = sc.nextLine();

    char[] cad1 = cadena1.toCharArray();
    char[] cad2 = cadena2.toCharArray();

    for (int i = 0; i < cad2.length && i < cad1.length; i++) {
        salida += cad1[i];
        salida += cad2[i];
    }

    if (cad1.length > cad2.length) {
        salida += cadena1.substring(cad2.length);
    } else if (cad2.length > cad1.length) {
        salida += cadena2.substring(cad1.length);
    }

    System.out.println(salida);
    sc.close();
}
}