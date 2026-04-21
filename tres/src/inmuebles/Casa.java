package inmuebles;

public class Casa extends Vivienda {
    protected int numPisos;

    public Casa(int id, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(id, area, direccion, numHab, numBan);
        this.numPisos = numPisos;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos = " + numPisos);
    }
    
}
