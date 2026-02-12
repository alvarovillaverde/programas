package dos;

import dos.AutomovilTarea.Color;
import dos.AutomovilTarea.Combustible;
import dos.AutomovilTarea.TipoAutomovil;

public class TestAutomovilTarea {
    public static void main(String[] args) {
        AutomovilTarea ñochi = new AutomovilTarea(
           "Kia", 2014, 1.7, Combustible.DIESEL, TipoAutomovil.FAMILIAR, 5, 
           5, 190, Color.NEGRO, 110 
        );

        ñochi.acelerar();
        
        ñochi.desacelerar();

        ñochi.calculoTiempoEstimado();

        System.out.println(ñochi);
        System.out.println("Es automático: " +ñochi.isAutomatico());

        //objeto duplicado
        AutomovilTarea gnocci = ñochi.duplicaMiCoche();
        System.out.println(gnocci);

        //comparar objetos
        System.out.println(ñochi.equals(gnocci));

    }
}
