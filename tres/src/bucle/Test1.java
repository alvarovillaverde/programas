package bucle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Ciclista> ciclistas = new ArrayList<>();

        Ciclista uno = new Ciclista(1, "hector");
        Ciclista dos = new Ciclista(2, "jose");
        Ciclista tres = new Ciclista(3, "ruedas");
        Ciclista cuatro = new Ciclista(4, "pedalesman");
        Ciclista cinco = new Ciclista(5, "sinfrenos");

        ciclistas.add(uno);
        ciclistas.add(dos);
        ciclistas.add(tres);
        ciclistas.add(cuatro);
        ciclistas.add(cinco);

        for (Ciclista ciclista : ciclistas) {
            ciclista.correrEtapa(1000, 2600);
        }

        ciclistas.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        
        LogicaCarrera.actualizarClasificacionGeneral(ciclistas);
        
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimir();
        }
    }
}
