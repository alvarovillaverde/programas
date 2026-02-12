package tres;

public class Resuelto6 {

    public static void main(String[] args) {
        
        int contador = 200;

        System.out.println("ahora con while....");
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 300);

        System.out.println("ahora con for....");
        for (int i = 200; i < 300; i++) {
            System.out.println(i);
        }
    }
}
