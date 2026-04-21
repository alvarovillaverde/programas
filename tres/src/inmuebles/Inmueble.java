package inmuebles;

import java.util.HashMap;
import java.util.Map;

public class Inmueble {

    // Definición del HashMap estático
    public static final Map<String, Double> VALOR_METRO_CUADRADO = new HashMap<>();

    //Insertamos los datos dentro de la tabla
    public static final void poblar() {
        VALOR_METRO_CUADRADO.put("Casa rural", 1500.0);
        VALOR_METRO_CUADRADO.put("Casa en Urbanizacion", 2500.0);
        VALOR_METRO_CUADRADO.put("Casa independiente", 3000.0);
        VALOR_METRO_CUADRADO.put("Apartaestudio", 1500.0);
        VALOR_METRO_CUADRADO.put("Apartamento familiar", 2000.0);
        VALOR_METRO_CUADRADO.put("Local comercial", 3000.0);
        VALOR_METRO_CUADRADO.put("Oficina", 3500.0);
    }

    //Atributo para el identificador inmobiliario de un inmueble
    protected int id;
    protected int area;
    protected String direccion;
    //Atributo que identifica el precio de venta de un inmueble
    protected double precioVenta = 0d; //No hay precio hasta llegar a algun objeto de la tabla

    //Constructor de la clase inmueble
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    //Metodo para calcular el precio de venta unitario de un inmueble
    protected double calcularPrecioVenta() {
        return precioVenta;
    }

    //Metodo que muesyta en pantalla los datos
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + id);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio venta = $ " + precioVenta);
    }
}
