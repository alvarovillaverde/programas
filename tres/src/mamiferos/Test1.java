package mamiferos;

import java.util.ArrayList;

public class Test1 {
public static void main(String[] args) {
    ArrayList<Mamifero> lista = new ArrayList<>();

    Ballena ba = new Ballena();
    lista.add(ba);
    Ornitorrinco or = new Ornitorrinco();
    lista.add(or);

    for (Mamifero mamifero : lista) {
        mamifero.amamantarCrias();
        mamifero.comer();
        if (mamifero instanceof Ornitorrinco) {
            ((Ornitorrinco)mamifero).ponerHuevos();
        }
    }
}
}
