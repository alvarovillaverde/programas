package ejercicios;

public class Propuesto6 {
public static boolean esCapicua(int dato) {
    Integer i = new Integer (dato);
    String reverse = new StringBuffer(i.toString()).reverse().toString();
    return i.toString().equals(reverse);
}
public static void main(String[] args) {
    int a = 121;

    System.out.println(esCapicua(a));
}
}
