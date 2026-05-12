package compo;

public class Test1 {
    public static void main(String[] args) {
        Circulo culo = new Circulo(5, 18, 3);
        Triangulo angulo = new Triangulo(new Punto(3, 56), new Punto(33, 1), new Punto(34, 33));
        Recta vedac = new Recta(new Punto(3, 5), new Punto(33, 66));

        culo.imprimir();
        System.out.println(angulo);
        vedac.longitudSegmento();
        vedac.pendienteRecta();

        Punto punto = culo.getCentro();
        System.out.println(punto);
    }
}
