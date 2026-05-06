package bio;

public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    // constructor no lo puedo usar directamente

    public Animal(String sonido, String alimentos, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    // CUATRO METODOS ABSTRACTOS

    public abstract String getNombreCientifico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHabitat();

    @Override
    public String toString() {
        return "Animal [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
                + nombreCientifico + "]";
    }

}
