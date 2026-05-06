package bio;

public class Leon extends Felino {

    public Leon(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }
    
    public String getSonido() {
        return "Rugido";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Sabana";
    }

    public String getNombreCientifico() {
        return "Panthera Leo";
    }

    @Override
    public String toString() {
        return "ruge el leon en medio de la avenida\n" + super.toString();
    }

}
