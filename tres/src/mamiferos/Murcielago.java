package mamiferos;

public class Murcielago extends Mamifero implements Volador {
    @Override
    public void amamantarCrias() {
        System.out.println("los murcielagos amamantan las crias boca abajo");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("con colmillos poderosos succionantes");
    }

    @Override
    public void volar() {
        System.out.println("los murcielagos vuelan como quieren");
    }
}
