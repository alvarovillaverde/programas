package gui3;

public class Prisma extends FiguraGeometrica {

    private double ancho;
    private double largo;
    private double alto;

    /**
     * Constructor de la clase Prisma
     * @param ancho  Dimension de la base (ancho)
     * @param largo  Dimension de la base (largo)
     * @param alto   Altura del prisma
     */
    public Prisma(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.setVolumen(calcularVolumen()); 
        this.setSuperficie(calcularSuperficie()); 
    }

    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public double calcularSuperficie() {
        return 2 * ((ancho * largo) + (ancho * alto) + (largo * alto));
    }

    @Override
    public String toString() {
        return super.toString() + " Prisma [ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + "]";
    }
}