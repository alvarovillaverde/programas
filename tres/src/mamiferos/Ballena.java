package mamiferos;

public class Ballena extends Mamifero {
    @Override
    void amamantarCrias() {
        System.out.println("la ballena amamanta a sus crias en alta mar");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("las ballenas abren sus fauces y tragan...");
    }
}
