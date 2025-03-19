package Simple01;

public class _10_Prime_Number {
	
	public static void main(String args[]) {
		
		int no = 8 ;  boolean flag = true ;
		
		for( int  i = 2 ; i < no ; i++ ) {
			
			if(no % i == 0 ) {
				flag = false ;
			}
			
		}
		
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}
	}
		
		

}
