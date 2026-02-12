package tres;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resuelto7 {

    public static void main(String[] args) {
        
        String[] traducido = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};

        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero del 1 al 10-----y te lo traduzco al ingles");
        int numero = Integer.parseInt(sc.nextLine());

        switch (numero) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        
            default:
                System.out.println("NaN");
                break;
        }

        System.out.println("dime un numero del 1 al 10-----y te lo traduzco al aleman");
        int digito = Integer.parseInt(sc.nextLine());

        System.out.println("traducido al aleman es: "+traducido[digito-1]);

        Map<Integer, String> numerosFrances = new HashMap<>();

        numerosFrances.put(1, "un");
        numerosFrances.put(2, "deux");
        numerosFrances.put(3, "trois");
        numerosFrances.put(4, "quatre");
        numerosFrances.put(5, "cinq");
        numerosFrances.put(6, "six");
        numerosFrances.put(7, "sept");
        numerosFrances.put(8, "huit");
        numerosFrances.put(9, "neuf");
        numerosFrances.put(10, "dix");

        System.out.println("dime un numero del 1 al 10-----y te lo traduzco al frances");
        int cifra = Integer.parseInt(sc.nextLine());

        System.out.println("traducido al frances es: "+numerosFrances.get(cifra));

        sc.close();
    }
}
