package dos;

public class Persona {

	//atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	//constructor con todos los parametros
	public Persona(String nombre, String apellido, int edad) {
		//se pueden inicializar 
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	//metodos propios
	public void firmaPapel (String nombre) {
		System.out.println(nombre+ " no vengo el jueves");
	}
	
	public String tengoSueño (int horas) {
		return "tengo horas de sueño atrasadas: "+horas;
	}
	
	public void canto() {
		System.out.println("estoy cantando como pavaroti la traviata");
	}
}
