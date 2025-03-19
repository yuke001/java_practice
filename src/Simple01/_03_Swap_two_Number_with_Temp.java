package Simple01;

public class _03_Swap_two_Number_with_Temp {
	
	public static void main(String args[]) {
		
		int a = 10 , b = 30 , temp = 0 ;
		
		System.out.println(a);
		System.out.println(b);
		
		temp = a ; 
		a = b ; 
		b = temp ; 
		
		
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
	}

}
