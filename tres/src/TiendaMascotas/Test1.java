package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.PerroGrande.razaG;
import TiendaMascotas.PerroMediano.razaM;
import TiendaMascotas.PerroPequeno.razaP;

public class Test1 {

    public static void main(String[] args) {
        
        ArrayList<Perro> canes = new ArrayList<Perro>();

        PerroGrande dog1 = new PerroGrande("manolo", 4, "azul", 23d, true, razaG.rotwiller);
        PerroMediano dog2 = new PerroMediano("pepe", 3, "indefinido", 12, false, razaM.collie);
        PerroPequeno dog3 = new PerroPequeno("carlos", 6, "manchas", 6, true, razaP.chiuahua);

        canes.add(dog1);
        canes.add(dog2);
        canes.add(dog3);

        System.out.println("perretes");

        for (Perro perro : canes) {
            perro.sonido();
            System.out.println(perro.toString());
            System.out.println("--------------------");
        }

    }

}
