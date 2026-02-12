package uno;

public class OpAsignacion {

	public static void main(String[] args) {
		int num=5;
		num += 8; //num = 13, equivale a num = num +8
		System.out.println("la variable num vale: " +num);
		
		int a = 2;
		int b = 4;
		
		a*=b; // 8 <---- 2*4
		System.out.println("la variable a vale: " +a);
		System.out.println("la variable b vale: " +b);
		
		System.out.println("en bucle for -----------------");
		
		int suma = 0;
		for (int i = 1; i <=100; i++) {
			suma+=i;
			System.out.println("suma parcial: "+suma);
		}
	}
	
}
