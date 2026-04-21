package inmuebles;

public class CasaUrbanizacion extends CasaUrbana {
    protected int valorComunidad;
    protected boolean tienePiscina;
    protected boolean tieneCanchas;

    public CasaUrbanizacion(int id, int area, String direccion, int numHab, int numBan, int numPisos,
            int valorComunidad, boolean tienePiscina, boolean tieneCanchas) {
        super(id, area, direccion, numHab, numBan, numPisos);
        this.valorComunidad = valorComunidad;
        this.tienePiscina = tienePiscina;
        this.tieneCanchas = tieneCanchas;
    }

    protected double calcularPrecioVenta() {
        return this.precioVenta = area * VALOR_METRO_CUADRADO.get("Casa en urbanizacion");
    }
    
}
