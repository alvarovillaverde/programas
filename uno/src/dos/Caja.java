package dos;

public class Caja {

    //atributos
    double base;
    double anchura;
    double altura;
    String tipo;
    
    //constructor completo
    public Caja(double base, double anchura, double altura) {
        this.base = base;
        this.anchura = anchura;
        this.altura = altura;
    }

    //constructor defecto
    public Caja() {
        base=anchura=altura=0d;
    }

    //constructor con un parametro de tipo longitud doble
    public Caja(double longitud) {
        this.base=this.anchura=this.altura=longitud;
    }

    public Caja(double base, double anchura, double altura, String tipo) {
        this(base, anchura, altura);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Caja [base=" + base + ", anchura=" + anchura + ", altura=" + altura + ", tipo=" + tipo + "]";
    }

    
}
