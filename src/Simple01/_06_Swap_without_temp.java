package Simple01;

public class _06_Swap_without_temp {
	
	public static void main(String args[]) {
		
		int a = 50 ; 
		int b = 100 ;
		
		a = a + b ;
		b = a - b ; 
		a = a - b ;
		
		System.out.println(a);
		System.out.println(b);
	}

}
