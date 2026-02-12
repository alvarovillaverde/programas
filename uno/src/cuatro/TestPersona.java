package cuatro;

public class TestPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998);
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001);

        System.out.println(p1);
        System.out.println(p2);

        p1.setPais("Cantabria");
        p2.setPais("Asturias");

        System.out.println(p1);
        System.out.println(p2);

        Persona p3 = new Persona("Margarita", "Lerez", "235B", 2007, "Euzkadi", 'U');

        System.out.println(p3);
    }
    
}
