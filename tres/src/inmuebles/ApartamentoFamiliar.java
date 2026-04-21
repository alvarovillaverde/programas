package inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected int cuota;

    public ApartamentoFamiliar(int id, int area, String direccion, int numHab, int numBan, int cuota) {
        super(id, area, direccion, numHab, numBan);
        this.cuota = cuota;
    }
}
