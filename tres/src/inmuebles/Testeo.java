package inmuebles;

import java.util.ArrayList;

public class Testeo {
    public static void main(String[] args) {
        Inmueble.poblar();

        ArrayList<Inmueble> hogares=new ArrayList<>();

        //Casa rural
        CasaRural cR1=new CasaRural(1, 55, "Plaza America 14", 2, 3, 2, 300,
        100);
        System.out.println(cR1);
        hogares.add(cR1);
        System.out.println("----------------------------------------------------------------------------------------------");


        //Casa en una urbanizacion
        CasaUrbanizacion cu1=new CasaUrbanizacion(2,33,"Avenida Madrid",5,5,2,
                200, true, true);
        System.out.println(cu1);
        hogares.add(cu1);
        System.out.println("----------------------------------------------------------------------------------------------");

        //Casa independiente
        CasaUrbana ci1=new CasaUrbana(3, 44,"redondela 12", 3, 4, 2);
        System.out.println(ci1);
        hogares.add(ci1);
        System.out.println("----------------------------------------------------------------------------------------------");


        //Apartamento familiar
        ApartamentoFamiliar aF1=new ApartamentoFamiliar(4, 50, "Calle Urzaiz 42", 3, 2, 50);
        System.out.println(aF1);
        hogares.add(aF1);
        System.out.println("----------------------------------------------------------------------------------------------");


        //Apartamento Estudio
        ApartaEstudio aE1=new ApartaEstudio(5, 20, "Travesia de Vigo 14", 1,1);
        System.out.println(aE1);
        hogares.add(aE1);
        System.out.println("----------------------------------------------------------------------------------------------");

        //Local comercial
        LocalComercial lC1=new LocalComercial(6,35,"Vigo 35", Local.TipoLocal.INTERNO, "Vialia Vigo");
        System.out.println(lC1);
        hogares.add(lC1);
        System.out.println("----------------------------------------------------------------------------------------------");

        //creo una oficina
        Oficina of1=new Oficina(7, 20, "Camelias 12", Local.TipoLocal.EXTERNO, false);
        System.out.println(of1);
        hogares.add(of1);
        System.out.println("----------------------------------------------------------------------------------------------");


        double valorTotal=0d;
        //Calcular pvp de todos
        for (Inmueble inmo:hogares){
            valorTotal+=inmo.calcularPrecioVenta();
        }
        System.out.println(valorTotal);
    }
}
