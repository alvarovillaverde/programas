package gestionAlmacen;

public class ArticuloNoExisteException extends Exception {
    public ArticuloNoExisteException(String string) {
        super(string);
    }
}
