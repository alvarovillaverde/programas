package inicio;
public class Cadena9 {
public static void main(String[] args) {
    int edad1 = 6;
    String str = String.valueOf(edad1);
    System.out.println(str);

    float edad2 = 6;
    str = String.valueOf(edad2);
    System.out.println(str);

    long edad3 = 6;
    str = String.valueOf(edad3);
    System.out.println(str);

    double edad4 = 6.5;
    str = String.valueOf(edad4);
    System.out.println(str);

    // convertir cadena a numero
    double numero = Double.parseDouble(str);

    System.out.println("el doble del numero recuperado de la cadena es: " + 2*numero);
}
}
