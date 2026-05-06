package bio;

public class Test1 {
    public static void main(String[] args) {
        
        // Animal sobera = new Animal("ewrl", "kiwis", "Cejus huspañ", "navidelo");

        // Canido toralla = new Canido("burp", "bichotas", "marino", "carolus maritumus");

        Canido mafalda = new Perro("guff", "salchichas", "pisero", "mafaldus galaicus");

        Animal feroz = new Lobo("argh", "abuelas", "altas esferas", "hambrunos tipex");

        Leon scar = new Leon("roar", "bifidus", "gran via", "leonicus pantero");

        Animal conbotas = new Gato("raw", "mierda", "birmingham", "notoi paris");

        System.out.println(mafalda);
        System.out.println(feroz);
        System.out.println(scar);
        System.out.println(conbotas);

        //Perro pe = (Perro) mafalda;
        //Lobo lo = (Lobo) feroz;
        //Canido ca = (Canido) feroz;
        //Leon le = (Leon) scar;
        //Felino fe = (Felino) conbotas;

    }
}
