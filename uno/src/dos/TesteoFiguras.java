package dos;

import java.awt.Color;

public class TesteoFiguras {
    public static void main(String[] args) {
        Circulo redondo = new Circulo(5, Color.BLACK);

        System.out.println(redondo.calcularArea());
        System.out.println(redondo.calcularPerimetro());

        System.out.println(redondo);

        Rectangulo jose = new Rectangulo(14, 9, Color.GRAY);

        System.out.println(jose.calcularArea());
        System.out.println(jose.calcularPerimetro());

        System.out.println(jose);

        cuadrado pepe = new cuadrado(6, Color.PINK);

        System.out.println(pepe.calcularArea());
        System.out.println(pepe.calcularPerimetro());

        System.out.println(pepe);

        TrianguloRectangulo messi = new TrianguloRectangulo(18, 21, Color.orange);

        System.out.println(messi.calcularArea());
        System.out.println(messi.calcularPerimetro());
        System.out.println(messi.calcularHipotenusa());

        System.out.println(messi);
    }
}
