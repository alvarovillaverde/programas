package inicio;
import java.util.Arrays;

public class Cadenas3 {
public static void main(String[] args) {
    String cadena1 = "Hola";
    String cadena2 = "Java";

    char[] array1 = cadena1.toCharArray();
    char[] array2 = cadena2.toCharArray();

    System.out.println("primer caracter de array1: " + array1[0]);
    System.out.println("segundo caracter de array2: " + array2[array2.length - 1]);

    System.out.println(Arrays.toString(array1));
}
}
