package dos;

import java.awt.Color;

public class TrianguloRectangulo {
    
    int base;
    int altura;
    Color color;

    public TrianguloRectangulo(int base, int altura, Color color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double calcularHipotenusa() {
        int suma = (int) (Math.pow(base, 2) + Math.pow(altura, 2));
        return Math.sqrt(suma); //square root
    }

    @Override
    public String toString() {
        return "TrianguloRectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]";
    }

    double calcularArea() {
        return (base * altura)*0.5;
    }

    double calcularPerimetro() {
        return base + altura + this.calcularHipotenusa();
    }

}
