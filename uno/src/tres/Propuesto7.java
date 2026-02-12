package tres;

import java.util.Random;

public class Propuesto7 {

public static void main(String[] args) {

    int pares = 0;
    int impares = 0;
    
    for (int i = 0; i < 50; i++) {
        Random rnd = new Random();
    int valor = rnd.nextInt(100,200);
    System.out.println("genera random--> "+valor);

    if (valor%2==0) {
        System.out.println("es par");
        pares++;
    } else {
        System.out.println("es impar");
        impares++;
    }
    }

    System.out.println("pares: "+pares);
    System.out.println("impares: "+impares);
    
}
}
