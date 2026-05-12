package compo;

public class Recta {
    Punto p1;
    Punto p2;

    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    double pendienteRecta() {
        double pendiente = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        System.out.println("la pendiente de la recta es: " + pendiente);
        return pendiente;
    }

    double longitudSegmento() {
        double longitud = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        System.out.println("la longitud del segmento es: " + longitud);
        return longitud;
    }

    @Override
    public String toString() {
        return "Recta [p1=" + p1 + ", p2=" + p2 + "]";
    }

}
