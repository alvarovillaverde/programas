package inmuebles;

public class Oficina extends Local{
    protected boolean ocupado;

    public Oficina(int id, int area, String direccion, TipoLocal tipo, boolean ocupado) {
        super(id, area, direccion, tipo);
        this.ocupado = ocupado;
    }
}
