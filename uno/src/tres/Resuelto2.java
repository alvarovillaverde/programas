package tres;

public class Resuelto2 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int k  = 3; k > i; k--) {
                System.out.print(" ");
            }//bucle interno de blanquitos

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }//bucle interno de estrellitas

            System.out.println();
        }//bucle externo
    }
}
