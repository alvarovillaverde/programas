package uno;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//NUmero entero aleatorio entre 0 y 9
		int entero = rand.nextInt(10);
		System.out.println("Aleatorio entre 0 y 9: " + entero);
		
		//Numeor entero aleatori entre 1 y 10
		int entre1y10 = rand.nextInt(10) + 1;
		System.out.println("Aleatorio entre 1 y 10" + entre1y10);
		
		//Numero booleano aleatorio
		boolean bool = rand.nextBoolean();
		System.out.println("Booleano aleatorio: " + bool);
		
		//Numero long aleatorio
		long l = rand.nextLong();
		System.out.println("Long aleatorio: " +l);
	}
	
}
