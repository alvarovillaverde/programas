package boletin;

public class Ejercicio11 {
public static void main(String[] args) {
    int prod_nones = 1;

    for (int i = 1; i <= 10; i++) {
        prod_nones *= (2*i-1);
    }

    System.out.println(prod_nones);
}
}
