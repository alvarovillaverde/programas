package dos;

public class Automovil extends Object {
	// atributos
	private String marca;
	private String color;
	private int velocidad;
	private int aumento;

	// constructor
	public Automovil(String marca, String color, int velocidad) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
		this.aumento = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAumento() {
		return aumento;
	}

	public void setAumento(int aumento) {
		this.aumento = aumento;
	}
	
	// metodo para acelerar con cariño
	public void acelerar(int aumento) {
		velocidad += aumento;
		System.out.println("El " + marca + " acelera a " + velocidad + " km/h");
	}

	// metodo para frenar
	public void frenar(int aumento) {
		velocidad -= aumento;
		System.out.println("El " + marca + " frena a " + velocidad + " km/h");
	}

	public void mejorado(int aumento) {
		if (aumento<0) {
			frenar(-aumento);
		} else {
			acelerar(+aumento);
		}
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
	}

}
