package examenprimeraev;

public class Ejercicio3 {
    /*Crear una clase llamada Peso con los siguientes atributos: piedras (tipo entero) y libras (tipo double) ya
Implementar un constructor que inicialice los atributos piedras y libras. ya
Incluir getters para acceder a los atributos piedras y libras. ya
Añadir un método toString. ya
Desarrollar un método que convierta medidas de peso de piedras y libras a kilogramos. Recibe piedras y libras como parámetros 
(ambos como enteros) y retorna el equivalente en kilogramos (como un número decimal)
Utilice las siguientes conversiones: 1 piedra = 6.35 kilogramos, 1 libra = 0.4536 kilogramos. Además 1 piedra son 14 libras.
Si el usuario introduce 2 piedras y 7 libras el método devolverá 14.56 kg ya*/

    //atributos
    int piedras;
    int libras;

    //constructor
    public Ejercicio3(int piedras, int libras) {
        this.piedras = piedras;
        this.libras = libras;
    }

    //getters
    public int getPiedras() {
        return piedras;
    }

    public int getLibras() {
        return libras;
    }

    //to string
    @Override
    public String toString() {
        return "Ejercicio3 [piedras=" + piedras + ", libras=" + libras + "]";
    }

    public double piedrasYLibrasAKilos(int piedras, int libras) {
    
        //paso las piedras a kilos
        double piedrasakg = piedras * 6.35;

        //paso las libras a kg
        double librasakg = libras * 0.4536;

        //sumo las conversiones
        double kilos = piedrasakg + librasakg;

        return kilos; // Factor conversión
    }

    public static void main(String[] args) {
        Ejercicio3 ejemplo = new Ejercicio3(2, 7);

        System.out.println(ejemplo.piedrasYLibrasAKilos(2, 7));
    }
    
}
