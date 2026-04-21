package inmuebles;

public class Local extends Inmueble{

    protected enum TipoLocal {
        INTERNO,
        EXTERNO
    }
    
    protected TipoLocal tipo;

    public Local(int id, int area, String direccion, TipoLocal tipo) {
        super(id, area, direccion);
        this.tipo = tipo;
    }

}
