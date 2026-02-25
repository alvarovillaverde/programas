package listas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ecologico {
    private Map<String, Double> catalogo;
    private Map<String, Integer> cesta;

    public Ecologico() {
        catalogo = new HashMap<>();
        cesta = new LinkedHashMap<>(); // Mantiene el orden de inserción
        inicializarCatalogo();
    }

    private void inicializarCatalogo() {
        catalogo.put("avena", 2.21);
        catalogo.put("garbanzos", 2.39);
        catalogo.put("tomate", 1.59);
        catalogo.put("jengibre", 3.13);
        catalogo.put("quinoa", 4.50);
        catalogo.put("guisantes", 1.60);
    }

    public boolean productoExiste(String producto) {
        return catalogo.containsKey(producto.toLowerCase());
    }

    public void agregarProducto(String producto, int cantidad) {
        producto = producto.toLowerCase();
        // Agrupar si ya existe, si no, añadir nuevo
        cesta.put(producto, cesta.getOrDefault(producto, 0) + cantidad);
    }

    public Map<String, Integer> getCesta() {
        return cesta;
    }

    public double getPrecioUnitario(String producto) {
        return catalogo.getOrDefault(producto, 0.0);
    }

    public double calcularSubtotalCesta() {
        double subtotal = 0;
        for (Map.Entry<String, Integer> entry : cesta.entrySet()) {
            subtotal += catalogo.get(entry.getKey()) * entry.getValue();
        }
        return subtotal;
    }

    public double calcularDescuento(double total, String codigo) {
        if ("ECODTO".equalsIgnoreCase(codigo)) {
            return total * 0.10;
        }
        return 0;
    }
}