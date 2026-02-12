package primer_trimestre;

public class Recursividad {
    public int metodoRecursivo(int parametro) {
    // 1. EL STOP (Caso Base)
    // Sin esto, el programa no sabe cuándo parar.
    int valorFinal = 0, valorLimite = 0, algo = 0;
    if (parametro <= valorLimite) { 
        return valorFinal;
    } 
    
    // 2. EL PASO (Caso Recursivo)
    // Haces algo con el dato actual Y llamas al método otra vez,
    // pero modificando el dato para acercarte al Caso Base.
    else {
        return algo + metodoRecursivo(parametro - 1);
    }
}
}