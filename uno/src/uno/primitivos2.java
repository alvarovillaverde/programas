package uno;

public class primitivos2 {
	
	final static double PI=3.141592;
	
	public static void main(String[] args) {
		
		char car1='c';
		System.out.println("su valor es: "+car1);
		
		char car2=99; /*car1 y car2 son lo mismo porque el 99 en decimal es la 'c' */
		System.out.println("su valor es: "+car2);

		float pi= (float) 3.1416;
		System.out.println("su valor es: "+pi);
		
		float pibis=3.1416F; /* la F en este caso indica Float*/
		System.out.println("su valor es: "+pibis);
		
		float medio=1/2F; /*0.5*/
		System.out.println("su valor es: "+medio);
		
		double millon=1e6; /* 1x106 */
		System.out.println("su valor es: "+millon);
		
		double mediobis=1/2D; /*0.5 la D en este caso indica Double*/
		System.out.println("su valor es: "+mediobis);

		int a = (int) 2.38;
		System.out.println("su valor es: "+a);
	}
	
}
