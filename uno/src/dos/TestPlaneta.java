package dos;

import dos.Planeta.ComoEsElPlaneta;

public class TestPlaneta {
public static void main(String[] args) {
    Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150,
        ComoEsElPlaneta.TERRESTRE, true, 1, 1
    );
    Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139822, 778,
        ComoEsElPlaneta.GASEOSO, true, 11.86, 0.413
    );

    System.out.println(tierra);
    System.out.println("Densidad de Tierra: "+tierra.densidad()+ "kg/km3");
    System.out.println("Tierra es un planeta exterior: "+ tierra.esExterior());

    System.out.println(jupiter);
    System.out.println("Densidad de Jupiter: "+jupiter.densidad()+ "kg/km3");
    System.out.println("Jupiter es un planeta exterior: "+ jupiter.esExterior());
}
}
