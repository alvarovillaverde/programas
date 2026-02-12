package inicio;
public class Cadenas6 {
public static void main(String[] args) {
    String cad1 = "EMMA";
    String cad2 = new String("EMMA");

    if (cad1.equals(cad2)) {
        System.out.println("SON IGUALES");
    }

    if (cad1 == cad2) {
        System.out.println("SON IGUALES");
    } else {
        System.out.println("SON DIFERENTES");
    }

    String cad3 = cad1;

    if (cad1.equals(cad3)) {
        System.out.println("SON IGUALES");
    }

    if (cad1 == cad3) {
        System.out.println("SON IGUALES");
    } else {
        System.out.println("SON DIFERENTES");
    }
}
}
