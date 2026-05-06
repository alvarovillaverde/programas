package bucle;

import java.util.Comparator;
import java.util.List;

public class LogicaCarrera {
    public static void actualizarClasificacionGeneral(List<Ciclista> lista) {
        // Primero ordenamos por el acumulado
        lista.sort(Comparator.comparingInt(Ciclista::getTiempoAcumulado));
        
        // Luego asignamos la posición según el orden de la lista
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setPosicionGeneral(i + 1);
        }
    }
}
