package bucle;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Morenitos", "Barcelona");
        Equipo e2 = new Equipo("Blanquitos", "China");
        Equipo e3 = new Equipo("Azulitos", "Pitufolandia");

        e1.annadirCiclista(new ContraRelojista(1, "Hector", 15));
        e1.annadirCiclista(new Escalador(4, "Olise", 12, 9));
        e1.annadirCiclista(new Velocista(7, "Estavo", 9, 22));

        e2.annadirCiclista(new ContraRelojista(2, "Willy", 10));
        e2.annadirCiclista(new Escalador(5, "Runo", 11, 14));
        e2.annadirCiclista(new Velocista(8, "Guisa", 22, 16));

        e3.annadirCiclista(new ContraRelojista(3, "Saul", 21));
        e3.annadirCiclista(new Escalador(6, "Pablo", 98, 11));
        e3.annadirCiclista(new Velocista(9, "Borra", 7, 24));

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(e1);
        equipos.add(e2);
        equipos.add(e3);

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n------ ETAPA " + i + " -------");
            
            for (Equipo eq : equipos) {
                System.out.println("\nEQUIPO: " + eq.getNombre());
                for (Ciclista c : eq.getListaCiclistas()) {
                    c.correrEtapa(1000, 2000);
                    c.imprimir();
                }
                eq.calcularTiempoParyAcu();
            }

            System.out.println("\n--- CLASIFICACIÓN POR EQUIPOS (ETAPA " + i + ") ---");
            for (Equipo eq : equipos) {
                eq.imprimir();
                System.out.println("-----------------------");
            }
        }
    }
}