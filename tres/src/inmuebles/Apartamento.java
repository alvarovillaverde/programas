package inmuebles;

public class Apartamento extends Vivienda {
    //no hay atributos nuevos
    public Apartamento(int id, int area, String direccion, int numHab, int numBan) {
        super(id, area, direccion, numHab, numBan);
    }
    
    @Override
    void imprimir() {
        super.imprimir();
    }
}
