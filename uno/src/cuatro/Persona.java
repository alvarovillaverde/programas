package cuatro;

public class Persona {
	
	//ATRIBUTOS
	String nombre; // Atributo que identifica el nombre de una persona
	String apellidos; // Atributo que identifica los apellidos de una persona
	/* Atributo que identifica el número de documento de identidad de una persona */
	String númeroDocumentoIdentidad;
	int añoNacimiento; /* Atributo que identifica el año de nacimiento de una persona */
    //nuevos
    String pais;
    char genero;
	
	/**
	* Constructor de la clase Persona
	* @param nombre Parámetro que define el nombre de la persona
	* @param apellidos Parámetro que define los apellidos de la persona
	* @param númeroDocumentoIdentidad Parámetro que define el
	* número del documento de identidad de la persona
	* @param añoNacimiento Parámetro que define el año de nacimiento
	* de la persona
	*/
	
	Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
		this.añoNacimiento = añoNacimiento;
	}
    
    //nuevo constructor de 6
	public Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String pais,
            char genero) {
        this(nombre, apellidos, númeroDocumentoIdentidad, añoNacimiento);
        this.pais = pais;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getNúmeroDocumentoIdentidad() {
        return númeroDocumentoIdentidad;
    }


    public void setNúmeroDocumentoIdentidad(String númeroDocumentoIdentidad) {
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
    }


    public int getAñoNacimiento() {
        return añoNacimiento;
    }


    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
	* Método que imprime en pantalla los datos de una persona
	*/
	void imprimir() {
	System.out.println("Nombre = " + nombre);
	System.out.println("Apellidos = " + apellidos);
	System.out.println("Número de documento de identidad = " +
	númeroDocumentoIdentidad);
	System.out.println("Año de nacimiento = " + añoNacimiento);
	System.out.println();
	}

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", númeroDocumentoIdentidad="
                + númeroDocumentoIdentidad + ", añoNacimiento=" + añoNacimiento + ", pais=" + pais + ", genero="
                + genero + "]";
    }
    
}