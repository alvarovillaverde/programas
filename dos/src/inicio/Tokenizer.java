package inicio;
import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String[] args) {
    // Un párrafo sobre ti, Luca
    String parrafo = "Hola, me llamo Luca, soy una persona algo timida y vivo en el piso dos.";
    
    // Creamos el objeto StringTokenizer
    // El segundo parámetro son los delimitadores (espacio, coma y punto)
    StringTokenizer st = new StringTokenizer(parrafo, " ,.");
    int toques = st.countTokens();
    
    System.out.println("--- Desglosando el párrafo ---");
    
    // Los métodos principales son hasMoreTokens() y nextToken()
    while (st.hasMoreTokens()) {
        System.out.println("Palabra: " + st.nextToken());
    }
    
    // También podemos saber cuántos tokens quedan por procesar
    System.out.println("Total de elementos procesados." + toques);
}
}
