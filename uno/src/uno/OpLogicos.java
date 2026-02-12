package uno;

public class OpLogicos {

	public static void main(String[] args) {
		
		int m=2, n=5;
		boolean res;
		
		res =m > n && m >= n;
		System.out.println("la expresion evaluada es: " +res);//res=false
		res =!(m < n || m != n);
		System.out.println("la expresion evaluada es: " +res);//res=false
		
	}
	
}
