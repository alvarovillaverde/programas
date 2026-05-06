package medicina;

public class Pediatra extends Medico {

	// Valor enumerado de define tipologías de un pediatra
	enum tipologia {
		NEUROLOGO, PSICOLOGO
		};
	protected tipologia tipo; // Atributo que define el tipo de pediatra
	
	public Pediatra(String nombre, tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public void setTipologia(tipologia tipo) {
		this.tipo = tipo;
	}
	
	public tipologia getTipologia() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Pediatra [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	
}