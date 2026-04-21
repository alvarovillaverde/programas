package inmuebles;

public class Vivienda extends Inmueble {
    protected int numBan;
    protected int numHab;

    public Vivienda(int id, int area, String direccion, int numHab, int numBan) {
        super(id, area, direccion);
        this.numBan = numBan;
        this.numHab = numHab;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones = " + numHab);
        System.out.println("Numero de baños = " + numBan);
    }
}
