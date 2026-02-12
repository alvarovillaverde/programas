package dos;

import java.util.Scanner;

public class AutomovilTarea {

    //scanner

    Scanner sc = new Scanner(System.in);

    //atributos

    private String marca; //nombre del fabricante
    private int modelo; //año del modelo
    private double motor; //volumen en litros del cilindraje del motor
    enum Combustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS
    }
    Combustible tCombustible;
    enum TipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    TipoAutomovil tTipoAutomovil;
    private int puertas; //cantidad de puertas del vehiculo
    private int asientos; //numero de asientos del vehiculo
    private double vMaxima; //velocidad maxima en km/h del vehiculo
    enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }
    Color tColor;
    private double vActual; //velocidad actual del vehiculo
    private boolean automatico; //determina si es automatico o no

    //constructores

    public AutomovilTarea() {

    }

    public AutomovilTarea(String marca, int modelo, double motor, Combustible tCombustible,
            TipoAutomovil tTipoAutomovil, int puertas, int asientos, double vMaxima, Color tColor, double vActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tCombustible = tCombustible;
        this.tTipoAutomovil = tTipoAutomovil;
        this.puertas = puertas;
        this.asientos = asientos;
        this.vMaxima = vMaxima;
        this.tColor = tColor;
        this.vActual = vActual;
        //le pasamos el valor de falso por defecto
        this.automatico = false;
    }

    //getters y setters
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public Combustible gettCombustible() {
        return tCombustible;
    }

    public void settCombustible(Combustible tCombustible) {
        this.tCombustible = tCombustible;
    }

    public TipoAutomovil gettTipoAutomovil() {
        return tTipoAutomovil;
    }

    public void settTipoAutomovil(TipoAutomovil tTipoAutomovil) {
        this.tTipoAutomovil = tTipoAutomovil;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getvMaxima() {
        return vMaxima;
    }

    public void setvMaxima(double vMaxima) {
        this.vMaxima = vMaxima;
    }

    public Color gettColor() {
        return tColor;
    }

    public void settColor(Color tColor) {
        this.tColor = tColor;
    }

    public double getvActual() {
        return vActual;
    }

    public void setvActual(double vActual) {
        this.vActual = vActual;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
    //metodo para acelerar

    public double acelerar () {
        String respuesta;

        do {
            System.out.println("Introduzca cuanto quiere acelerar: ");
            vActual += sc.nextDouble();
            sc.nextLine(); //limpia el escaner
            if (vActual > vMaxima) {
                vActual = vMaxima; //para que no se quede guardado el valor que supera la velocidad maxima
                System.out.println("No puedes acelerar por encima de la velocidad maxima que es de: " +vMaxima);
            } else {
                System.out.println("La velocidad actual despues de acelerar es de: " +vActual);
            }
            System.out.println("Quiere seguir acelerando: (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        return vActual;
    }

    //metodo para desacelerar

    public double desacelerar () {
        String respuesta;

        do {
            System.out.println("Introduzca cuanto quiere desacelerar: ");
            vActual -= sc.nextDouble();
            sc.nextLine(); //limpia el escaner
            if (vActual < 0) {
                vActual = 0; //para que no se guarde el valor negativo
                System.out.println("No puedes desacelerar a una velocidad negativa");
            } else {
                System.out.println("La velocidad actual despues de desacelerar es de: " +vActual);
            }
            System.out.println("Quiere seguir desacelerando: (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        return vActual;
    }

    //metodo para frenar

    public double frenar () {
        String respuesta;

        System.out.println("Quiere frenar: (s/n)");
        respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            vActual = 0;
            System.out.println("El vehiculo se ha detenido y su velocidad actual es: " +vActual);
        } else {
            System.out.println("El vehiculo sigue en movimiento y su velocidad actual es: " +vActual);
        }
        return vActual;
    }

    //metodo para calcular el tiempo estimado de llegada

    public void calculoTiempoEstimado () {
        double distancia; // en km
        double tiempo; // en horas

        System.out.println("Introduzca la distancia a recorrer en kilometros: ");
        distancia = sc.nextDouble();

        tiempo = distancia / vActual; //calculo del tiempo

        System.out.println("El tiempo estimado de llegada es de: " +tiempo+ "horas");
    }

    //metodo para mostrar los valores de los atributos en pantalla

    @Override
    public String toString() {
        return "AutomovilTarea [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor
                + ", tCombustible=" + tCombustible + ", tTipoAutomovil=" + tTipoAutomovil + ", puertas=" + puertas
                + ", asientos=" + asientos + ", vMaxima=" + vMaxima + ", tColor=" + tColor + ", vActual=" + vActual
                + "]";
    }

    //metodo para duplicar un objeto
    public AutomovilTarea duplicaMiCoche() {
        AutomovilTarea duplicado = this;
        return duplicado;
    }
}