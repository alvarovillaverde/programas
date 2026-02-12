package dos;

public class TestArticulo {
    public static void main(String[] args) {
        //array de strings de tres posiciones
    String[] palabras = {"Fisica", "Espacio", "Tiempo"};

    for(int i = 0; i<palabras.length;i++)
        System.out.println(palabras[i]);

    ArticuloCientifico articulo = new ArticuloCientifico("La teoria especial de la relatividad", "Albert Einstein",
    palabras, "Anales de fisica", 1913,
     "Las leyes de la fisica son las mismas en todos los sistemas de referncia inerciales");
    System.out.println(articulo.toString());
    }
}
