package Carro;

public class Llanta {

    String marca;
    int diametroRin;
    int altura;
    int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public void imprimir() {
        System.out.println("marca: " + marca + ", diametro del rin: " + diametroRin + ", altura: " + 
        altura + ", anchura: " + anchura);
    }

}
