package dos;

public class testPersona {

	public static void main(String[] args) {
		
		Persona uno = new Persona(null, null, 0);
		System.out.println(uno.toString());
		uno.setNombre("wilfredo");
		System.out.println(uno.toString());
		uno.setApellido("Pino");
		uno.setEdad(30);
		System.out.println(uno.toString());
		
		uno.canto();
		System.out.println(uno.tengoSueño(7));
		
		uno.firmaPapel("Willi");
		
		Persona dos = new Persona("Javi", "Denis", 19);
		System.out.println(dos.toString());
		
	}
	
}
