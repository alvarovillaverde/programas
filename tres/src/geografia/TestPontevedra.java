package geografia;

import java.util.ArrayList;

public class TestPontevedra {
    public static void main(String[] args) {
        ArrayList<Municipio> listaInicial = new ArrayList<>();
        Departamento pontevedra = new Departamento("Pontevedra", listaInicial);

        Municipio vigo = new Municipio("Vigo", 293000, 15.0, 40);
        Municipio pontevedraCap = new Municipio("Pontevedra", 83000, 14.8, 20);
        Municipio lalin = new Municipio("Lalín", 20000, 11.6, 550);
        Municipio sanxenxo = new Municipio("Sanxenxo", 17000, 15.2, 10);

        pontevedra.agregarMunicipio(vigo);
        pontevedra.agregarMunicipio(pontevedraCap);
        pontevedra.agregarMunicipio(lalin);
        pontevedra.agregarMunicipio(sanxenxo);

        System.out.println("=== TEST 1: CENSO TOTAL ===");
        int censoTotal = pontevedra.calcularCensoPoblacionDepartamento();
        System.out.println("Población total del departamento: " + censoTotal + " habitantes.");
        System.out.println("----------------------------------------\n");

        System.out.println("=== TEST 2: BUSCAR MUNICIPIO EXISTENTE ===");
        pontevedra.buscarMunicipio("Vigo");
        System.out.println("----------------------------------------\n");

        System.out.println("=== TEST 3: BUSCAR MUNICIPIO INEXISTENTE ===");
        pontevedra.buscarMunicipio("Marín");
        System.out.println("----------------------------------------\n");

        System.out.println("=== TEST 4: MUNICIPIOS CON POBLACIÓN MAYOR A 50.000 ===");
        pontevedra.buscarMunicipioConPoblacionMayor(50000);
        System.out.println("----------------------------------------\n");

        System.out.println("=== TEST 5: ELIMINAR MUNICIPIO (Lalín) ===");
        pontevedra.eliminarMunicipio("Lalín");
        
        System.out.println("\nVerificando censo tras la eliminación:");
        int nuevoCenso = pontevedra.calcularCensoPoblacionDepartamento();
        System.out.println("Nuevo censo total: " + nuevoCenso + " habitantes.");
        System.out.println("----------------------------------------");
    }
}
