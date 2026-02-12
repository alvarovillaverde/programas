package dos;

public class ExcepcionAritmetica {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 0;
		int c;
		
		try {
			c = a / b ;}
		catch (ArithmeticException excep)
				{ System.err.println("Error: "+excep.getMessage());
			return;
		}
		
		
		System.out.println("a entre b da: "+c);
		
	}
	
}
