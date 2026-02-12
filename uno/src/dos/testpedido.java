package dos;

public class testpedido {
public static void main(String[] args) {
    pedido pedido1 = new pedido();
    pedido pedido2 = new pedido();
    pedido pedido3 = new pedido();
    pedido1.calcularPrecio("pizza", 5, "cocacola", 2);
    pedido2.calcularPrecio("carbonara", 10, "pechuga de pollo", 50, "agua", 1.2);
    pedido3.calcularPrecio("ensalada", 7, "hamburguesa", 12, "natillas", 4, "nestea", 5);
}
}
