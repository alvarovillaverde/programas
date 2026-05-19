package colombia;

public class TestMadrid {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Álvaro", "Arbeloa", 43, 7, true);

        Portero portero = new Portero("Thibaut", "Courtois", 34, true, 0);

        Defensa[] defensas = {
            new Defensa("Trent", "Alexander-Arnold", 27, true),
            new Defensa("Raúl", "Asencio", 23, true),
            new Defensa("David", "Alaba", 33, true),
            new Defensa("Álvaro", "Carreras", 23, true)
        };

        Mediocampo[] mediocampos = {
            new Mediocampo("Eduardo", "Camavinga", 23, true, 5),
            new Mediocampo("Aurélien", "Tchouaméni", 26, true, 3),
            new Mediocampo("Brahim", "Díaz", 26, true, 8),
            new Mediocampo("Jude", "Bellingham", 22, false, 12)
        };

        Delantero[] delanteros = {
            new Delantero("Gonzalo", "García", 21, true, 1),
            new Delantero("Vinícius", "Júnior", 25, true, 18)
        };

        EquipoFutbol realMadrid = new EquipoFutbol(
            "Real Madrid C.F.", 
            "España", 
            tecnico, 
            portero, 
            defensas, 
            mediocampos, 
            delanteros
        );
        
        realMadrid.imprimir();
    }
}