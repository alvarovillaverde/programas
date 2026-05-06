package mamiferos;

public class Ornitorrinco extends Mamifero implements Oviparo {
    @Override
    void amamantarCrias() {
        System.out.println("el ornitorrinco amamanta a sus crias en la estepa");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("nos dedicamos a robar las peras...");
    }

    // metodo de la interfaz
    @Override
    public void ponerHuevos() {
        System.out.println("el ornitorrinco pone huevos");
    }
}
