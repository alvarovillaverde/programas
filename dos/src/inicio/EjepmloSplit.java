package inicio;
public class EjepmloSplit {
public static void main(String[] args) {
    String frase = "Aprende a programar en Java requiere práctica constante y mucho paciencia diaria";

    String[] palabrasArray = frase.split(" ");

    System.out.println("Numero de palabras encontradas: " + palabrasArray.length);

    System.out.println("---Contenido del array---");
    for (int i = 0; i < palabrasArray.length; i++) {
        System.out.println("Posicion [" + i + "]: " + palabrasArray[i]);
    }
}
}
