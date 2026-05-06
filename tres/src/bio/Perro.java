package bio;

public class Perro extends Canido {

    public Perro(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }

    public String getSonido() {
        return "Ladrido";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Domestico";
    }

    public String getNombreCientifico() {
        return "Canis Lupus familiaris";
    }

    @Override
    public String toString() {
        return "Esto es un perro\n" + super.toString();
    }
    
}
