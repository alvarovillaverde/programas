package dos;

public class Planeta extends Object {

public static final long UA = 149597870;

private String nombre = null;
private int cantidadSatelites = 0;
private double masa = 0D;
private double volumen = 0D;
private int diametro = 0;
private int distanciaMediaSol = 0;
private double añosOrbita = 0;
private double diasRotacion = 0;

enum ComoEsElPlaneta {
    GASEOSO, TERRESTRE, ENANO
}
ComoEsElPlaneta tPLaneta;
private boolean observable = false;

public Planeta() {

}

public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol,
        ComoEsElPlaneta tPLaneta, boolean observable, double añosOrbita, double diasRotacion) {
    //super();
    this.nombre = nombre;
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distanciaMediaSol = distanciaMediaSol;
    this.tPLaneta = tPLaneta;
    this.observable = observable;
    this.añosOrbita = añosOrbita;
    this.diasRotacion = diasRotacion;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getCantidadSatelites() {
    return cantidadSatelites;
}

public void setCantidadSatelites(int cantidadSatelites) {
    this.cantidadSatelites = cantidadSatelites;
}

public double getMasa() {
    return masa;
}

public void setMasa(double masa) {
    this.masa = masa;
}

public double getVolumen() {
    return volumen;
}

public void setVolumen(double volumen) {
    this.volumen = volumen;
}

public int getDiametro() {
    return diametro;
}

public void setDiametro(int diametro) {
    this.diametro = diametro;
}

public int getDistanciaMediaSol() {
    return distanciaMediaSol;
}

public void setDistanciaMediaSol(int distanciaMediaSol) {
    this.distanciaMediaSol = distanciaMediaSol;
}

public ComoEsElPlaneta gettPLaneta() {
    return tPLaneta;
}

public void settPLaneta(ComoEsElPlaneta tPLaneta) {
    this.tPLaneta = tPLaneta;
}

public boolean isObservable() {
    return observable;
}

public void setObservable(boolean observable) {
    this.observable = observable;
}

public double getAñosOrbita() {
    return añosOrbita;
}

public void setAñosOrbita(double añosOrbita) {
    this.añosOrbita = añosOrbita;
}

public double getDiasRotacion() {
    return diasRotacion;
}

public void setDiasRotacion(double diasRotacion) {
    this.diasRotacion = diasRotacion;
}

@Override
public String toString() {
    return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa + ", volumen="
            + volumen + ", diametro=" + diametro + ", distanciaMediaSol=" + distanciaMediaSol + ", añosOrbita="
            + añosOrbita + ", diasRotacion=" + diasRotacion + ", tPLaneta=" + tPLaneta + ", observable=" + observable
            + "]";
}

public double densidad() {
    return masa/volumen; //kg / km3
}

public boolean esExterior() {
    if (distanciaMediaSol*1E6>=3.4*UA)
    return false;
    else
    return true;
}

public enum planSiSol {
    MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
}
}
