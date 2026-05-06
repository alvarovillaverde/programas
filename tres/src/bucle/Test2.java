package bucle;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Ciclista> pelotazo = new ArrayList<Ciclista>();
        pelotazo.add(new Velocista(1, "josito", 3, 5));
        pelotazo.add(new Velocista(2, "willy fox", 7, 9));
        pelotazo.add(new Escalador(3, "vegeta", 5, 8));
        pelotazo.add(new Escalador(4, "hector moreno lacnha", 3, 12));
        pelotazo.add(new ContraRelojista(5, "fontan", 8));
        pelotazo.add(new ContraRelojista(6, "valverde", 9));

        TesteoConDosEtapas.simularEtapaYMostrar(pelotazo, 1, "asco");
        
        ArrayList<Ciclista> peloton = new ArrayList<>();

        // Creamos uno de cada tipo con atributos específicos
        peloton.add(new Velocista(1, "Peter Sagan", 50, 60));        // Gran resta por potencia/vel
        peloton.add(new Escalador(2, "Nairo Quintana", 8, 15));     // Resta por aceleración/rampa
        peloton.add(new ContraRelojista(3, "Filippo Ganna", 55));   // Resta por velocidad máxima

        System.out.println("--- INICIO DE LA ETAPA ---");
        int tMin = 3000; // 50 minutos
        int tMax = 3600; // 60 minutos

        for (Ciclista c : peloton) {
            c.correrEtapa(tMin, tMax);
            c.imprimir();
            System.out.println("---------------------------");
        }
    }
}
