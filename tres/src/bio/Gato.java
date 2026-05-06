package bio;

public class Gato extends Felino {

    public Gato(String sonido, String alimentos, String habitat, String nombreCientifico) {
        super(sonido, alimentos, habitat, nombreCientifico);
    }
    
    public String getSonido() {
        return "Maullido";
    }

    public String getAlimentos() {
        return "Ratones";
    }

    public String getHabitat() {
        return "Casero";
    }

    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }

    @Override
    public String toString() {
        return "el gato maulla\n" + super.toString();
    }
    
}
