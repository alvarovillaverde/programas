package inmuebles;

public class CasaRural extends Casa{

    protected static double valorArea = 1500000;
    protected int distanciaCentro;
    protected int altitud;

    public CasaRural(int id, int area, String direccion, int numHab, int numBan, int numPisos, int distanciaCentro, int altitud) {
        super(id, area, direccion, numHab, numBan, numPisos);
        this.distanciaCentro = distanciaCentro;
        this.altitud = altitud;
    }


    @Override
    protected double calcularPrecioVenta() {
        return this.precioVenta = area * Inmueble.VALOR_METRO_CUADRADO.get("Casa rural");
    }
    
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Distancia al centro = " + distanciaCentro + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
    }
}
