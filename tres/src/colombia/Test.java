package colombia;

public class Test {
        public static void main(String[] args) {

        Tecnico tecnico = new Tecnico("Carlos", "Queiroz", 66, 30, false);

        Portero portero = new Portero("David", "Ospina", 30, true, 10);

        Defensa[] defensas = {
            new Defensa("Yerry", "Mina", 24, true),
            new Defensa("Davinson", "Sánchez", 23, true),
            new Defensa("William", "Tesillo", 29, true),
            new Defensa("Stefan", "Medina", 29, true)
        };

        Mediocampo[] mediocampos = {
            new Mediocampo("Mateus", "Uribe", 28, true, 12),
            new Mediocampo("Wilmar", "Barrios", 25, true, 12),
            new Mediocampo("Juan Guillermo", "Cuadrado", 31, true, 10),
            new Mediocampo("James", "Rodríguez", 28, true, 32)
        };

        Delantero[] delanteros = {
            new Delantero("Radamel", "Falcao", 33  , true, 15),
            new Delantero("Duván", "Zapata", 28, true, 12)
        };

        EquipoFutbol seleccionColombia = new EquipoFutbol(
            "Selección Colombia", 
            "Colombia", 
            tecnico, 
            portero, 
            defensas, 
            mediocampos, 
            delanteros
        );

        seleccionColombia.imprimir();
    }
}

