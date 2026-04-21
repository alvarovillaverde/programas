package inmuebles;

public class Testeo1 {
public static void main(String[] args) {
    System.out.println("Poblamos el mapa de precios unitarios");
    Inmueble.poblar();

    //creamos una casa rural
    CasaRural pitufo = new CasaRural(1121, 55, "petelos 11", 5, 2, 3, 3, 157);

    //calcular pvp
    pitufo.calcularPrecioVenta();

    //imprimir
    pitufo.imprimir();
}
}
