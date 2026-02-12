package tres;

public class Letras {

    //atributo
    private char letra;

    //constructor
    public Letras(char l) {
        if (Character.isLowerCase(l)) {
            this.letra = Character.toUpperCase(l);
        } else {
            this.letra = l;
        }
    }

    @Override
    public String toString() {
        return "Letras [letra=" + letra + "]";
    }

}