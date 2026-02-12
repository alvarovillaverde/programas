package uno;

public class EjemploBucleFor {

	public static void main(String[] args) throws InterruptedException {
		
		//contar numeros de 1 a 10
		for(int i=1; i<=10; i++) {
			System.out.println("repeticion => "+i);
			Thread.sleep(2000);
		}
		
		//cuenta descendente
		for (int j = 100; j > 0; j--) {
			System.out.println("descendiendo hasta 0 => " +j);
		}
		
	}
	
}