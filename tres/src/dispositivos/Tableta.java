package dispositivos;

public class Tableta extends DispositivoInformatico {
    Tableta(String marca) {
        // no hay escrito super
        System.out.println("Marca: " + marca);
    }

    @Override
    public String toString() {
        return "Tableta [marca=" + marca + "]";
    }

}
