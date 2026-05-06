package medicina;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Medico> listaMedicos = new ArrayList<>();

        Medico med1 = new Medico("Juan GOnzalez");
        listaMedicos.add(med1);
        Ortopedista ortop1 = new Ortopedista("Carlos Pineda", medicina.Ortopedista.tipologia.MAXILOFACIAL);
        listaMedicos.add(ortop1);
        Pediatra ped1 = new Pediatra("Ana Matilde", medicina.Pediatra.tipologia.PSICOLOGO);
        listaMedicos.add(ped1);

        // ejemplo del operador instanceOf y continue al siguiente elemento de l bucle for
        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico a = (Medico) listaMedicos.get(i);
            System.out.println(a.toString());
            if (a instanceof Ortopedista) {
                System.out.println("El objeto en el indice " + i + " es de la clase ortopedista");
                continue;
            }

            if (a instanceof Pediatra) {
                System.out.println("El objeto en el indice " + i + " es de la clase pediatra");
                continue;
            }

            if (a instanceof Medico) {
                System.out.println("el objeto en el indice " + i + " es de la clase medico");
                continue;
            }
        }
    }
}
