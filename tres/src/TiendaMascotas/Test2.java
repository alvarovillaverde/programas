package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.GatoPeloCorto.razaPC;
import TiendaMascotas.GatoPeloLargo.razaPL;
import TiendaMascotas.GatoSinPelo.razaSP;

public class Test2 {

    public static void main(String[] args) {
        
        ArrayList<Gato> michis = new ArrayList<>();

        GatoSinPelo cat1 = new GatoSinPelo("man", 5, "jasp", 1.12d, 2.34, razaSP.donskoy);
        GatoPeloLargo cat2 = new GatoPeloLargo("pep", 6, "definido", 1.2d, 2.65d, razaPL.himalayo);
        GatoPeloCorto cat3 = new GatoPeloCorto("carl", 2, "chas", 6.35d, 2.25d, razaPC.manx);

        michis.add(cat1);
        michis.add(cat2);
        michis.add(cat3);

        System.out.println("gatetes");

        double ventaGatos = 0d;

        for (Gato gato : michis) {
            gato.sonido();
            System.out.println(gato.toString());
            System.out.println("-------------------");
            ventaGatos += gato.calcularPrecioVenta();
            System.out.println("-------------------");
        }

        System.out.println("total venta gatos: " + ventaGatos);

    }

}
