package listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Moneda> listaMonedas = new ArrayList<>();
        
        // Generamos la primera moneda (sin restricciones)
        Moneda actual = new Moneda();
        listaMonedas.add(actual);

        // Mapas necesarios para el conteo y los valores
        Map<String, Integer> conteoMonedas = new HashMap<>();
        Map<String, Double> valoresEuros = new HashMap<>();
        
        valoresEuros.put("1 céntimo", 0.01);
        valoresEuros.put("2 céntimos", 0.02);
        valoresEuros.put("5 céntimos", 0.05);
        valoresEuros.put("10 céntimos", 0.10);
        valoresEuros.put("20 céntimos", 0.20);
        valoresEuros.put("50 céntimos", 0.50);
        valoresEuros.put("1 euro", 1.0);
        valoresEuros.put("2 euros", 2.0);

        double sumaTotal = 0;
        
        // Generamos las 19 restantes siguiendo la pauta (Total 20)
        for (int i = 0; i < 19; i++) {
            actual = new Moneda(actual); // Crea una nueva basada en la anterior
            listaMonedas.add(actual);
        }

        // Imprimimos el resultado y calculamos
        for (Moneda m : listaMonedas) {
            System.out.println(m);
            
            String nombreValor = m.getValor(); // Extraemos el nombre del valor
            
            // Contamos la cantidad en el mapa
            conteoMonedas.put(nombreValor, conteoMonedas.getOrDefault(nombreValor, 0) + 1);
            
            // Sumamos el valor real al total acumulado
            sumaTotal += valoresEuros.get(nombreValor);
        }

        // Mostramos el total final
        System.out.print("\nTotal de las 20 monedas: %.2f euros\n" + sumaTotal);
    }
}