package bio;

public class Lobo extends Canido {

    public Lobo(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }
    
    public String getSonido() {
        return "Aullido";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Bosque";
    }

    public String getNombreCientifico() {
        return "Canis Lupus";
    }

    @Override
    public String toString() {
        return "i am a f**** lobo\n" + super.toString();
    }
}
