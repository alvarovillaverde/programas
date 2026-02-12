package dos;

public class testPajaro {
	
	public static void main(String[] args) {
		pajaro pajaro1 = new pajaro((char) 0, 0, null);
		pajaro pajaro2 = new pajaro((char) 0, 0, null);
		pajaro pajaro3 = pajaro.pideDatos();
		
		pajaro1.setNombre("periquito");
		pajaro1.setColor('R');
		pajaro1.setEdad(2);
		
		pajaro2.setNombre("canario");
		pajaro2.setColor('A');
		pajaro2.setEdad(3);
		
		System.out.println(pajaro1.toString());
		System.out.println(pajaro2.toString());
		
		pajaro1.cantar();
		pajaro1.mostrarInfo();
		pajaro3.mostrarInfo();
	}
	
}
