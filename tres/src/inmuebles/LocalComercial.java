package inmuebles;

public class LocalComercial extends Local{
    protected String nombreLocal;

    public LocalComercial(int id, int area, String direccion, TipoLocal tipo, String nombreLocal) {
        super(id, area, direccion, tipo);
        this.nombreLocal = nombreLocal;
    }
}
