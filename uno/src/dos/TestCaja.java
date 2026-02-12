package dos;

public class TestCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(4, 3, 2);
        System.out.println(caja1);

        Caja caja2 = new Caja();
        System.out.println(caja2);

        Caja caja3 = new Caja(5);
        System.out.println(caja3);

        Caja caja4 = new Caja(3, 4, 5, "de zapatos");
        System.out.println(caja4);
    }
}
