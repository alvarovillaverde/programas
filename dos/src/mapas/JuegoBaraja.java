package mapas;

import java.util.ArrayList;

public class JuegoBaraja {
    public static void main(String[] args) {

        // Cambiado a CartaBaraja para que coincida con tu clase anterior
        ArrayList<CartaBaraja> mano = new ArrayList<CartaBaraja>();

        while (mano.size() < 5) {
            CartaBaraja carta = new CartaBaraja();
            
            // Comprobamos si la carta ya está en la mano para que no haya duplicados
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }

        // Ordenación usando el compareTo que explicamos antes
        mano.sort((o1, o2) -> o1.compareTo(o2));

        // Mostrar mano carta por carta
        for (CartaBaraja carta : mano) {
            System.out.println(carta);
        }

        System.out.println("ve tu mano");
        System.out.println(mano);
    }
}