package compo;

public class Triangulo {

    Punto v1;
    Punto v2;
    Punto v3;
    
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

}
